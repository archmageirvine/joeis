package irvine.oeis.a020;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A020645 Least positive integer k for which 4^n divides k!.
 * @author Sean A. Irvine
 */
public class A020645 extends Sequence0 {

  private Z mF = Z.ONE;
  private long mN = -1;
  private long mM = 0;
  private long mR = 1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    while (mM < mN) {
      mF = mF.multiply(++mR);
      while (mF.and(Z.THREE).isZero()) {
        mF = mF.shiftRight(2);
        ++mM;
      }
    }
    return Z.valueOf(mR);
  }
}
