package com.yzd.common.cache.core.redis.sharded;

import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.*;

public class ShardedRedisUtilTest {
    private static final Logger LOGGER = LoggerFactory.getLogger(ShardedRedisUtilTest.class);
    ShardedRedisUtil shardedRedisUtil;

    @Before
    public void init(){
        shardedRedisUtil=ShardedRedisUtil.getInstance();
    }

    @Test
    public void setex() {
        String value="v";
        String key="k";
        shardedRedisUtil.setex(key,100,value);
        String v=shardedRedisUtil.get(key);
        LOGGER.info(v);
    }
    @Test
    public void setCachedWrapper() {
        String value="v";
        String key="k";
        shardedRedisUtil.setCachedWrapper(key,100,value);
        shardedRedisUtil.getCachedWrapper(key);
        String v=shardedRedisUtil.get(key);
        LOGGER.info(v);
    }
}