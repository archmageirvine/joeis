package irvine.oeis.a034;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A034726 Smallest integral value of m/(sum of digits of m) for any n-digit number m.
 * @author Sean A. Irvine
 */
public class A034726 implements Sequence {

  private long mN = 1;
  private long mLim = 10;

  @Override
  public Z next() {
    long min = Long.MAX_VALUE;
    while (mN < mLim) {
      final long d = ZUtils.digitSum(mN);
      if (mN % d == 0) {
        final long v = mN / d;
        if (v < min) {
          min = v;
        }
      }
      ++mN;
    }
    mLim *= 10;
    return Z.valueOf(min);
  }
}
