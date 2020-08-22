package irvine.oeis.a001;

import java.util.List;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import jmason.poly.Polyiamond;
import jmason.poly.PolyiamondCounter;

/**
 * A001420 Number of fixed 2-dimensional triangular-celled animals with n cells (n-iamonds, polyiamonds) in the 2-dimensional hexagonal lattice.
 * @author Sean A. Irvine
 */
public class A001420 implements Sequence {

  private int mN = 0;
  private List<Polyiamond> mPrevList = null;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.TWO;
    }
    final PolyiamondCounter pc = new PolyiamondCounter(mN);
    pc.run(true, true, false, mPrevList, false);
    mPrevList = pc.getList();
    return Z.valueOf(pc.getCu().getCounter(mN));
  }
}
