package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A000868 Number of switching networks with C(2,n) acting on domain and GL(2,Z2) acting on range.
 * @author Sean A. Irvine
 */
public class A000868 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    return Z.ONE.shiftLeft(1 << (mN + 1))
      .add(Z.ONE.shiftLeft(mN + (1 << mN) + 2))
      .subtract(Z.ONE.shiftLeft(1 << mN))
      .add(Z.ONE.shiftLeft(mN + 1))
      .shiftRight(mN + 1)
      .divide(3);
  }
}
