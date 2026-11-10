
package irvine.oeis.a006;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a001.A001212;
import irvine.util.array.DynamicIntArray;

/**
 * A006638 Restricted postage stamp problem with n denominations and 2 stamps.
 * Based on Algorithm 1 of J. Kohonen, 2014.
 * @author Sean A. Irvine
 */
public class A006638 extends Sequence1 {

  private final DirectSequence mA001212 = DirectSequence.create(new A001212());
  private final DynamicIntArray mA = new DynamicIntArray();
  private int mK = 0;

  /**
   * Get n_2(k) from A001212, using zero-based indexing.
   * @param k basis length
   * @return maximum ordinary range
   */
  private int n2(final int k) {
    if (mA.get(k) == 0) {
      mA.set(k, mA001212.a(k).intValueExact());
    }
    return mA.get(k);
  }

  /**
   * Enumerate admissible bases of a given length and minimum range.
   * The basis contains len+1 elements, including zero.
   * @param a current basis
   * @param len current number of elements
   * @param sums pairwise sums of current basis
   * @param range current consecutive coverage
   * @param targetLen desired number of elements
   * @param minRange minimum required range
   * @param half maximum possible element
   * @param result resulting bases
   */
  private void enumerate(final int[] a, final int len,
                         final BitSet sums, final int range,
                         final int targetLen, final int minRange,
                         final int half, final List<int[]> result) {
    if (len == targetLen) {
      if (range >= minRange) {
        result.add(a);
      }
      return;
    }

    final int max = Math.min(half, range + 1);
    for (int x = a[len - 1] + 1; x <= max; ++x) {
      final BitSet next = (BitSet) sums.clone();
      for (int t = 0; t < len; ++t) {
        next.set(x + a[t]);
      }
      next.set(2 * x);
      final int nextRange = Math.min(half, next.nextClearBit(0) - 1);
      if (nextRange >= x) {
        final int[] b = Arrays.copyOf(a, len + 1);
        b[len] = x;
        enumerate(b, len + 1, next, nextRange, targetLen, minRange, half, result);
      }
    }
  }

  /**
   * Generate all admissible bases of the specified length and range.
   * @param len basis length (number of elements excluding zero)
   * @param minRange minimum range
   * @param half maximum element
   * @return list of bases
   */
  private List<int[]> admissible(final int len, final int minRange, final int half) {
    final List<int[]> result = new ArrayList<>();
    final BitSet sums = new BitSet();
    sums.set(0);
    enumerate(new int[] {0}, 1, sums, 0, len + 1, minRange, half, result);
    return result;
  }

  /**
   * Check whether the union of a prefix and mirrored suffix
   * is a restricted basis for n.
   * @param a prefix
   * @param b mirrored suffix before mirroring
   * @param n required range
   * @return true if a restricted basis is obtained
   */
  private boolean check(final int[] a, final int[] b, final int n) {
    final int half = n / 2;
    final int i = a.length - 1;
    final int j = b.length - 1;

    // The prefix and suffix must be disjoint and ordered
    if (a[i] >= half - b[j]) {
      return false;
    }

    final int[] basis = new int[i + j + 2];
    System.arraycopy(a, 0, basis, 0, i + 1);
    for (int t = 0; t <= j; ++t) {
      basis[i + 1 + t] = half - b[j - t];
    }

    // Generate all pairwise sums
    final BitSet sums = new BitSet(n + 1);
    for (int p = 0; p < basis.length; ++p) {
      for (int q = p; q < basis.length; ++q) {
        sums.set(basis[p] + basis[q]);
      }
    }

    return sums.nextClearBit(0) > n;
  }

  /**
   * Test whether a restricted basis of length k and range n exists.
   * @param k length
   * @param n range
   * @return true if one exists
   */
  private boolean exists(final int k, final int n) {
    final int i = k / 2;
    final int j = k - i - 1;
    final int half = n / 2;
    final int na = n2(i - 1);
    final int nb = n2(j - 1);

    // Theorem 6: lower bounds for the prefix and suffix
    final int minA = half - nb - 2;
    final int minB = half - na - 2;
    final List<int[]> a = admissible(i, minA, half);
    final List<int[]> b = (i == j) ? a : admissible(j, minB, half);
    for (final int[] prefix : a) {
      for (final int[] suffix : b) {
        if (check(prefix, suffix, n)) {
          return true;
        }
      }
    }
    return false;
  }

  /**
   * Upper bound from Corollary 8.
   * @param k length
   * @return upper bound for extremal restricted range
   */
  private int upperBound(final int k) {
    final int r = k / 2;
    if ((k & 1) == 0) {
      return 4 * n2(r - 1) + 4;
    }
    return 2 * n2(r - 1) + 2 * n2(r) + 4;
  }

  @Override
  public Z next() {
    ++mK;
    if (mK == 1) {
      return Z.TWO;
    }
    if (mK == 2) {
      return Z.FOUR;
    }
    if (mK == 3) {
      return Z.EIGHT;
    }

    // Only even ranges are possible.
    int n = upperBound(mK);
    n -= n & 1;
    while (n >= 2) {
      if (exists(mK, n)) {
        return Z.valueOf(n);
      }
      n -= 2;
    }
    throw new IllegalStateException("No restricted basis found");
  }
}
