package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A008909.
 * @author Sean A. Irvine
 */
public class A008909 implements Sequence {

  private int mN = -1;
  private long mCount = 0;

  private void count(final int prev, final int sum) {
    ++mCount;
    if (sum < mN) {
      for (int k = 1; k <= prev; ++k) {
        count(k, sum + 1);
      }
      final int limit = mN - sum + prev;
      for (int k = prev + 1; k < limit; ++k) {
        count(k, sum + 1 + k - prev);
      }
    }
  }

  @Override
  public Z next() {
    if (++mN <= 1) {
      return Z.ONE;
    }
    mCount = 0;
    for (int b0 = 1; b0 <= mN; ++b0) {
      count(b0, b0);
    }
    return Z.valueOf(mCount);
  }

}
