package irvine.oeis.a000;

import java.util.List;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import jmason.poly.Polyiamond;
import jmason.poly.PolyiamondCounter;

/**
 * A000577 Number of triangular polyominoes (or triangular polyforms, or polyiamonds) with n cells (turning over is allowed, holes are allowed, must be connected along edges).
 * @author jmason
 */
public class A000577 extends Sequence1 {

  private int mN = 0;
  private List<Polyiamond> mPrevList = null;

  @Override
  public Z next() {
    final PolyiamondCounter pc = new PolyiamondCounter(++mN);
    pc.run(true, false, false, mPrevList, true);
    mPrevList = pc.getList();
    return Z.valueOf(pc.getCu().getCounter(mN)); 
  }    
}
