package irvine.oeis.a064;

import irvine.math.z.Z;
import irvine.oeis.a000.A000959;

/**
 * A064703 Smallest lucky number that is the product of n lucky numbers.
 * @author Sean A. Irvine
 */
public class A064703 extends A000959 {

  private int mN = 0;
  private int mCount = 0;
  private Z mBest = null;

  @Override
  public Z next() {
    ++mN;
    while (mN > mCount) {
      final Z lucky = super.next();
      Z t = lucky;
      int cnt = 0;
      for (long k = 1; k < mLucky.length() && !Z.ONE.equals(t); ++k) {
        final long l = mLucky.get(k);
        while (t.mod(l) == 0) {
          ++cnt;
          t = t.divide(l);
        }
      }
      if (cnt > mCount) {
        mCount = cnt;
        mBest = lucky;
      }
    }
    return mBest;
  }
}
