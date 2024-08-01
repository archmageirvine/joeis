package irvine.oeis.a071;

import irvine.math.z.Z;

/**
 * A071540 Number of k's less than or equal to 10^n such that there are no middle divisors of k (A071561).
 * @author Sean A. Irvine
 */
public class A071540 extends A071090 {

  private long mLim = 1;
  private long mN = 0;
  private long mCount = 0;

  @Override
  public Z next() {
    mLim *= 10;
    while (mN < mLim) {
      ++mN;
      if (super.next().isZero()) {
        ++mCount;
      }
    }
    return Z.valueOf(mCount);
  }
}
