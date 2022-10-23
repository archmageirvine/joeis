package irvine.oeis.a028;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicBooleanArray;
import irvine.util.string.StringUtils;

/**
 * A028307 Form a triangle with n numbers in top row; all other numbers are the sum of their parents. E.g.: 4 1 2 7; 5 3 9; 8 12; 20. The numbers must be positive and distinct and the final number is to be minimized. Sequence gives final number.
 * @author Sean A. Irvine
 */
public class A028307 extends Sequence1 {

  // Incrementally chooses elements for the top row.
  // Maintain last element of each subsequent row (sufficient to compute total or back up).
  // Can use A*-style condition to determine sum of remaining elements.
  // Abort search if sum will exceed current best solution.

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private int mN = 0;
  private long mBest = 0;

  private long aStarBound(final LongDynamicBooleanArray seen, final int k, final long t) {
    long s = t;
    for (int j = k + 1, p = 0; j < mN; ++j) {
      while (++p == t || seen.isSet(p)) {
        // do nothing
      }
      s += p;
    }
    return s;
  }

  private boolean isOk(final LongDynamicBooleanArray seen, final long[] prev, final int k, long s) {
    for (int j = 0; j <= k; ++j) {
      if (s >= mBest || seen.isSet(s)) {
        return false;
      }
      s += prev[j];
    }
    return true;
  }

  private void search(final LongDynamicBooleanArray seen, final long sum, final long[] prev, final int k) {
    if (k >= mN) {
      if (prev[mN - 1] < mBest) {
        mBest = prev[mN - 1];
        if (mVerbose) {
          StringUtils.message("Best now " + mBest);
        }
      }
    } else {
      for (long s = 1; s < mBest; ++s) {
        if (sum + k * s < mBest && sum + k * aStarBound(seen, k, s) < mBest && isOk(seen, prev, k, s)) {
          long t = s;
          for (int j = 0; j <= k; ++j) {
            seen.set(t);
            final long u = t + prev[j];
            prev[j] = t;
            t = u;
          }
          search(seen, sum + k * s, prev, k + 1);
          for (int j = k; j >= 0; --j) {
            final long u = t - prev[j];
            t = prev[j];
            prev[j] = u;
            seen.clear(t);
          }
        }
      }
    }
  }

  @Override
  public Z next() {
    ++mN;
    mBest = Integer.MAX_VALUE;
    final LongDynamicBooleanArray seen = new LongDynamicBooleanArray();
    final long[] prev = new long[mN];
    search(seen, 0, prev, 0);
    return Z.valueOf(mBest);
  }

}
