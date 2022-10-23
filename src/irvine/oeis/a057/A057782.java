package irvine.oeis.a057;

import java.util.List;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import jmason.poly.Polytriamond;
import jmason.poly.PolytriamondCounter;

/**
 * A057782 Building block is trapezoid formed from 3 equilateral triangles; sequence gives number of pieces (polytraps) that can be formed from n such trapezoids.
 * @author Sean A. Irvine
 */
public class A057782 extends Sequence1 {

  private int mN = 0;
  private List<Polytriamond> mPrevList = null;

  @Override
  public Z next() {
    final PolytriamondCounter pc = new PolytriamondCounter(++mN);
    pc.run(true, false, false, mPrevList, true);
    mPrevList = pc.getList();
    //System.out.println(mPrevList);
    return Z.valueOf(pc.getCu().getCounter(mN)); 
  }    
}
