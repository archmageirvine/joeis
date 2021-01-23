package irvine.oeis.a034;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A034728 Sum of digits of A034727(n).
 * @author Sean A. Irvine
 */
public class A034728 implements Sequence {

  private long mN = 1;
  private long mLim = 10;

  @Override
  public Z next() {
    long min = Long.MAX_VALUE;
    long minD = 0;
    while (mN < mLim) {
      final long d = ZUtils.digitSum(mN);
      if (mN % d == 0) {
        final long v = mN / d;
        if (v < min) {
          min = v;
          minD = d;
        }
      }
      ++mN;
    }
    mLim *= 10;
    return Z.valueOf(minD);
  }
}
