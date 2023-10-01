package irvine.oeis.a066;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066044 Numbers k that are repdigits in more bases (smaller than k) than any smaller number.
 * @author Sean A. Irvine
 */
public class A066044 extends Sequence1 {

  private long mN = 0;
  private long mBest = -1;

  private long countRepDigitReps(final long n) {
    long cnt = 0;
    for (long base = 2; base < n; ++base) {
      if (LongUtils.isRepDigit(n, base)) {
        ++cnt;
      }
    }
    return cnt;
  }

  @Override
  public Z next() {
    while (true) {
      final long cnt = countRepDigitReps(++mN);
      if (cnt > mBest) {
        mBest = cnt;
        return Z.valueOf(mN);
      }
    }
  }
}
