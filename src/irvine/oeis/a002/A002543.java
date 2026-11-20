package irvine.oeis.a002;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A002543: Number of essentially distinct complete Post functions of n variables.
 * @author Sean A. Irvine
 */
public class A002543 extends Sequence1 {

  private int mN = 0;

  /**
   * Apply a permutation to a binary input vector.
   * @param x input vector
   * @param p permutation
   * @return permuted vector
   */
  private int permute(final int x, final int[] p) {
    int y = 0;
    for (int k = 0; k < p.length; ++k) {
      if ((x & (1 << k)) != 0) {
        y |= 1 << p[k];
      }
    }
    return y;
  }

  /**
   * Count the orbits of binary vectors under a permutation.
   * @param p permutation
   * @return number of orbits
   */
  private int orbitCount(final int[] p) {
    final int size = 1 << p.length;
    final boolean[] seen = new boolean[size];
    int count = 0;
    for (int x = 0; x < size; ++x) {
      if (!seen[x]) {
        ++count;
        int y = x;
        while (!seen[y]) {
          seen[y] = true;
          y = permute(y, p);
        }
      }
    }
    return count;
  }

  /**
   * Test whether all cycles of a permutation have even length.
   * @param p permutation
   * @return true if all cycles have even length
   */
  private boolean allCyclesEven(final int[] p) {
    final boolean[] seen = new boolean[p.length];
    for (int k = 0; k < p.length; ++k) {
      if (!seen[k]) {
        int j = k;
        int len = 0;
        while (!seen[j]) {
          seen[j] = true;
          ++len;
          j = p[j];
        }
        if ((len & 1) != 0) {
          return false;
        }
      }
    }
    return true;
  }

  /**
   * Accumulate Burnside's contribution for each permutation.
   * @param p permutation
   * @param used used permutation entries
   * @param pos next position
   * @param sum accumulated sum
   */
  private void enumerate(final int[] p, final boolean[] used, final int pos, final Z[] sum) {
    if (pos == p.length) {
      final int c = orbitCount(p);
      Z f = Z.ONE.shiftLeft(c - 2);
      if (!allCyclesEven(p)) {
        f = f.subtract(Z.ONE.shiftLeft((c - 2) / 2));
      }
      sum[0] = sum[0].add(f);
      return;
    }

    for (int k = 0; k < p.length; ++k) {
      if (!used[k]) {
        used[k] = true;
        p[pos] = k;
        enumerate(p, used, pos + 1, sum);
        used[k] = false;
      }
    }
  }

  @Override
  public Z next() {
    ++mN;
    final int[] p = new int[mN];
    final Z[] sum = {Z.ZERO};
    enumerate(p, new boolean[mN], 0, sum);
    return sum[0].divide(Functions.FACTORIAL.z(mN));
  }
}
