package irvine.oeis.a034;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A034728 Sum of digits of A034727(n).
 * @author Sean A. Irvine
 */
public class A034728 extends Sequence1 {

  private long mN = 1;
  private long mLim = 10;

  @Override
  public Z next() {
    long min = Long.MAX_VALUE;
    long minD = 0;
    while (mN < mLim) {
      final long d = Functions.DIGIT_SUM.l(mN);
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
