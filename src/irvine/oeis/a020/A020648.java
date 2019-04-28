package irvine.oeis.a020;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A020648 Least positive integer k for which <code>9^n</code> divides <code>k!</code>.
 * @author Sean A. Irvine
 */
public class A020648 implements Sequence {

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
      Z[] qr;
      while (Z.ZERO.equals((qr = mF.divideAndRemainder(Z.NINE))[1])) {
        mF = qr[0];
        ++mM;
      }
    }
    return Z.valueOf(mR);
  }
}
