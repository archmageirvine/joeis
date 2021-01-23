package irvine.oeis.a034;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A034727 a(n) = that n-digit number m which gives minimal integral value of m/(sum of digits of m); in case of a tie pick the smallest.
 * @author Sean A. Irvine
 */
public class A034727 implements Sequence {

  private long mN = 1;
  private long mLim = 10;

  @Override
  public Z next() {
    long min = Long.MAX_VALUE;
    long minN = 0;
    while (mN < mLim) {
      final long d = ZUtils.digitSum(mN);
      if (mN % d == 0) {
        final long v = mN / d;
        if (v < min) {
          min = v;
          minN = mN;
        }
      }
      ++mN;
    }
    mLim *= 10;
    return Z.valueOf(minN);
  }
}
