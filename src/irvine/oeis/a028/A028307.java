package irvine.oeis.a028;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.array.LongDynamicBooleanArray;

/**
 * A028307.
 * @author Sean A. Irvine
 */
public class A028307 implements Sequence {

  // Cf. A007710

  private int mN = 0;
  private long mBest = 0;

  private boolean isOk(final LongDynamicBooleanArray seen, final long[] prev, final int k, long s) {
    for (int j = 0; j <= k; ++j) {
      if (s > mBest || seen.isSet(s)) {
        return false;
      }
      s += prev[j];
    }
    return true;
  }

  private void search(final LongDynamicBooleanArray seen, final long[] prev, final int k) {
    if (k >= mN) {
      if (prev[mN - 1] < mBest) {
        mBest = prev[mN - 1];
      }
    } else {
      for (long s = 1; s < mBest; ++s) {
        if (isOk(seen, prev, k, s)) {
          long t = s;
          for (int j = 0; j <= k; ++j) {
            seen.set(t);
            final long u = t + prev[j];
            prev[j] = t;
            t = u;
          }
          search(seen, prev, k + 1);
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
    search(seen, prev, 0);
    return Z.valueOf(mBest);
  }

}
