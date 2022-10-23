package irvine.oeis.a052;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicBooleanArray;
import irvine.util.string.StringUtils;

/**
 * A052184 Length of shortest dominating cycle in binary hypercube of dimension n.
 * @author Sean A. Irvine
 */
public class A052184 extends Sequence1 {

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private int mN = 0;
  private long mLim = 1;
  private long[][] mWorkspace = null;

  // WLOG we can incrementally explore dimensions (tracked by minUsedDimension).
  // We can cut the search short if there are not enough steps remaining to close the cycle.
  // We can cut the search short if the unseen exceeds maximum number we can make from remaining steps

  private boolean search(final LongDynamicBooleanArray used, final LongDynamicBooleanArray seen, final long head, final long countUnseen, final int minUnusedDimension, final int remaining) {
    if (remaining <= 1) {
      if ((head & (head - 1)) == 0) {
        return countUnseen <= 0;
      }
      return false;
    }
    if (Long.bitCount(head) > remaining) {
      return false; // Cannot close the cycle in the remaining time
    }
    if (countUnseen > (mN - 1) * (long) remaining) {
      return false;
    }
    int dim = 0;
    for (long k = 1; k < mLim && dim <= minUnusedDimension; k <<= 1, ++dim) {
      final long t = head ^ k;
      if (!used.isSet(t)) {
        // We can add t to the current path
        final long[] undoBuffer = mWorkspace[remaining];
        int u = 0;
        for (long j = 1; j < mLim; j <<= 1) {
          final long t1 = t ^ j;
          if (!seen.isSet(t1)) {
            seen.set(t1);
            undoBuffer[u++] = t1;
          }
        }
        used.set(t);
        if (search(used, seen, t, countUnseen - u, Math.max(minUnusedDimension, dim + 1), remaining - 1)) {
          return true;
        }
        used.clear(t);
        while (--u >= 0) {
          seen.clear(undoBuffer[u]);
        }
      }
    }
    return false;
  }

  @Override
  public Z next() {
    mLim <<= 1;
    if (++mN == 1) {
      return Z.ONE;
    }
    int s = mN >= 4 ? 2 * (int) (((mLim + mN - 3) / (mN - 2) + 1) / 2) : 2;
    final LongDynamicBooleanArray seen = new LongDynamicBooleanArray();
    final LongDynamicBooleanArray used = new LongDynamicBooleanArray();
    used.set(0);
    for (long j = 1; j < mLim; j <<= 1) {
      seen.set(j);
    }
    while (true) {
      if (mVerbose) {
        StringUtils.message("Starting search for path length " + s + " on " + mN + " dimensions");
      }
      mWorkspace = new long[s + 1][mN];
      if (search(used, seen, 0, mLim - mN, 1, s)) {
        return Z.valueOf(s);
      }
      s += 2;
    }
  }
}

