package irvine.oeis.a002;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002740 Number of tree-rooted bridgeless planar maps with two vertices and n faces.
 * @author Sean A. Irvine
 */
public class A002740 implements Sequence {

  private final MemoryFactorial mF = MemoryFactorial.SINGLETON;
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN < 3) {
      return Z.ZERO;
    }
    return mF.factorial(2 * (mN - 1))
      .divide2()
      .divide(mF.factorial(mN))
      .divide(mF.factorial(mN - 3));
  }
}
