package irvine.oeis.a036;

import irvine.math.z.Z;

/**
 * A036538 Number of integers m &lt;= 2^n such that d(m) = 2^k for some k = 0, 1, 2, 3, ...
 * @author Sean A. Irvine
 */
public class A036538 extends A036537 {

  private Z mLim = Z.ONE;
  private Z mA = super.next();
  private long mCount = 0;

  @Override
  public Z next() {
    mLim = mLim.multiply2();
    while (mA.compareTo(mLim) <= 0) {
      ++mCount;
      mA = super.next();
    }
    return Z.valueOf(mCount);
  }
}
