package irvine.oeis.a087;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicArray;
import irvine.util.array.LongDynamicLongArray;

/**
 * A087518:
 * @author Sean A. Irvine
 */
public class A087518 extends Sequence1 {

  private int mN = 0;

  private Z get(final LongDynamicArray<Z> dp, final long k) {
    final Z res = dp.get(k);
    return res == null ? Z.ZERO : res;
  }

  @Override
  public Z next() {
    ++mN;
    final int m = mN * mN;
    // The subset DP uses int masks.
    if (m >= 63) {
      throw new UnsupportedOperationException("Subset DP requires fewer than 63 cells");
    }

    final long size = 1L << m;
    final long full = size - 1;

    // Adjacency mask for each grid vertex.
    final LongDynamicLongArray adj = new LongDynamicLongArray();
    for (int r = 0; r < mN; ++r) {
      for (int c = 0; c < mN; ++c) {
        final int v = r * mN + c;
        if (r > 0) {
          adj.set(v, adj.get(v) | 1L << (v - mN));
        }
        if (r + 1 < mN) {
          adj.set(v, adj.get(v) | 1L << (v + mN));
        }
        if (c > 0) {
          adj.set(v, adj.get(v) | 1L << (v - 1));
        }
        if (c + 1 < mN) {
          adj.set(v, adj.get(v) | 1L << (v + 1));
        }
      }
    }

    /*
     * dp[mask] = number of orderings of the vertices
     * in mask such that every vertex after the first
     * is adjacent to an earlier vertex.
     */
    final LongDynamicArray<Z> dp = new LongDynamicArray<>();
    // Any vertex may be the first one.
    for (int v = 0; v < m; ++v) {
      dp.set(1L << v, Z.ONE);
    }
    for (long mask = 1; mask < full; ++mask) {
      final Z ways = get(dp, mask);
      if (ways.isZero()) {
        continue;
      }
      // Append any vertex adjacent to the existing set.
      for (int v = 0; v < m; ++v) {
        final int bit = 1 << v;
        if ((mask & bit) == 0 && (mask & adj.get(v)) != 0) {
          final long nextMask = mask | bit;
          dp.set(nextMask, get(dp, nextMask).add(ways));
        }
      }
    }
    return dp.get(full);
  }
}
