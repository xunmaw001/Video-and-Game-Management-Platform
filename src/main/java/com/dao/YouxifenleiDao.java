package com.dao;

import com.entity.YouxifenleiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YouxifenleiVO;
import com.entity.view.YouxifenleiView;


/**
 * 游戏分类
 * 
 * @author 
 * @email 
 * @date 2023-04-17 12:06:34
 */
public interface YouxifenleiDao extends BaseMapper<YouxifenleiEntity> {
	
	List<YouxifenleiVO> selectListVO(@Param("ew") Wrapper<YouxifenleiEntity> wrapper);
	
	YouxifenleiVO selectVO(@Param("ew") Wrapper<YouxifenleiEntity> wrapper);
	
	List<YouxifenleiView> selectListView(@Param("ew") Wrapper<YouxifenleiEntity> wrapper);

	List<YouxifenleiView> selectListView(Pagination page,@Param("ew") Wrapper<YouxifenleiEntity> wrapper);
	
	YouxifenleiView selectView(@Param("ew") Wrapper<YouxifenleiEntity> wrapper);
	

}
