package irvine.oeis.a062;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A062003 Product of the k numbers formed by cyclically permuting digits of n (where k = number of digits of n).
 * @author Sean A. Irvine
 */
public class A062003 extends Sequence1 {

  private long mN = -1;
  private long mMul = 1;
  private long mLim = 10;

  @Override
  public Z next() {
    if (++mN == mLim) {
      mMul = mLim;
      mLim *= 10;
    }
    long m = mN;
    Z prod = Z.ONE;
    do {
      prod = prod.multiply(m);
      m = (m / 10) + (m % 10) * mMul;
    } while (m != mN);
    return prod;
  }
}
