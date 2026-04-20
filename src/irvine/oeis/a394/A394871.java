package irvine.oeis.a394;

import java.util.ArrayList;
import java.util.List;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A394871 allocated for Yifan Xie.
 * @author Sean A. Irvine
 */
public class A394871 extends Sequence1 {

  private int mN = 0;

  private int countOverlap(final long[] a, final long[] b) {
    int sum = 0;
    for (int i = 0; i < a.length; ++i) {
      sum += Long.bitCount(a[i] & b[i]);
    }
    return sum;
  }

  private boolean coversPairing(final int[] subset, final int[] mate) {
    for (final int a : subset) {
      final int b = mate[a];
      // subset must contain exactly one endpoint
      final boolean inA = contains(subset, a);
      final boolean inB = contains(subset, b);
      if (inA == inB) {
        return false;
      }
    }
    return true;
  }

  private boolean contains(final int[] arr, final int x) {
    for (final int v : arr) {
      if (v == x) {
        return true;
      }
    }
    return false;
  }

  private void generateCanonicalPairings(final int n, final int[] mate, final boolean[] used, final int start, final List<int[]> out) {
    int i = start;
    // find first unused
    while (i < n && used[i]) {
      ++i;
    }
    if (i == n) {
      out.add(mate.clone());
      return;
    }

    used[i] = true;
    // canonical restriction: only pair forward
    for (int j = i + 1; j < n; ++j) {
      if (!used[j]) {
        used[j] = true;
        mate[i] = j;
        mate[j] = i;
        generateCanonicalPairings(n, mate, used, i + 1, out);
        used[j] = false;
      }
    }
    used[i] = false;
  }

  private void generateSubsets(final int n, final int k, final int start, final int[] cur, final int depth, final List<int[]> out) {
    if (depth == k) {
      out.add(cur.clone());
      return;
    }
    for (int i = start; i < n; ++i) {
      cur[depth] = i;
      generateSubsets(n, k, i + 1, cur, depth + 1, out);
    }
  }

  @Override
  public Z next() {
    if (++mN <= 1) {
      return Z.valueOf(mN);
    }

    final int size = 2 * mN;

    // 1. generate all pairings as mate arrays
    final List<int[]> pairings = new ArrayList<>();
    generateCanonicalPairings(size, new int[size], new boolean[size], 0, pairings);

    final int pSize = pairings.size();

    // 2. generate all subsets of size n
    final List<int[]> subsets = new ArrayList<>();
    generateSubsets(size, mN, 0, new int[mN], 0, subsets);
    final int sSize = subsets.size();

    // 3. precompute coverage using bitsets
    final long[][] covers = new long[sSize][(pSize + 63) >>> 6];

    for (int si = 0; si < sSize; ++si) {
      final int[] subset = subsets.get(si);
      for (int pi = 0; pi < pSize; ++pi) {
        if (coversPairing(subset, pairings.get(pi))) {
          covers[si][pi >>> 6] |= 1L << (pi & 63);
        }
      }
    }

    // 4. uncovered bitset
    final long[] uncovered = new long[(pSize + 63) >>> 6];
    for (int i = 0; i < pSize; ++i) {
      uncovered[i >>> 6] |= 1L << (i & 63);
    }

    int remaining = pSize;
    int used = 0;

    // 5. greedy set cover
    while (remaining > 0) {
      int best = -1;
      int bestGain = -1;
      for (int si = 0; si < sSize; ++si) {
        final int gain = countOverlap(covers[si], uncovered);
        if (gain > bestGain) {
          bestGain = gain;
          best = si;
        }
      }

      // apply best subset
      final long[] c = covers[best];
      for (int i = 0; i < uncovered.length; ++i) {
        final long before = uncovered[i];
        final long after = before & ~c[i];
        uncovered[i] = after;
        remaining -= Long.bitCount(before) - Long.bitCount(after);
      }
      ++used;
    }

    return Z.valueOf(used);
  }
}
