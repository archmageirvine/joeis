package irvine.oeis.a133;

import irvine.math.z.Z;
import irvine.oeis.a227.A227061;
import irvine.util.Permutation;

/**
 * A133687 Triangle with number of equivalence classes of <code>n X n</code> matrices over <code>{0,1}</code> with rows and columns summing to k <code>(0&lt;=k&lt;=n)</code>, where equivalence is defined by row and column permutations.
 * @author Sean A. Irvine
 */
public class A133687 extends A227061 {

  private int mN = -1;
  private int mM = -1;

  private static int[] transpose(final int[] m) {
    final int[] r = new int[m.length];
    for (int v : m) {
      for (int j = m.length - 1; j >= 0; --j) {
        r[j] <<= 1;
        r[j] += v & 1;
        v >>= 1;
      }
    }
    return r;
  }

  private static int findMin(final int[] m, final int j) {
    int r = 0;
    for (int k = 1; k < j; ++k) {
      if (m[k] < m[r]) {
        r = k;
      }
    }
    return r;
  }

  @Override
  protected boolean accept(final int[] matrix, final int[] transpose) {
    // Note both matrices are already sorted
    final int[] pm = new int[transpose.length];
    // Generate all row permutations of the transpose
    final Permutation perm = new Permutation(transpose.length);
    int[] p;
    while ((p = perm.next()) != null) {
      for (int k = 0; k < pm.length; ++k) {
        pm[k] = transpose[p[k]];
      }
      final int[] t = transpose(pm);

      // Notionally now want to sort t by rows and compare to matrix.
      // If they are the same, then matrix was canonical.  But doing
      // the whole sort is slow, so we do it as we go.

      // Simultaneous sort and compare
      for (int k = 0, j = matrix.length; k < matrix.length; ++k) {
        final int h = findMin(t, j);
        final int u = t[h];
        final int c = matrix[k];
        if (u < c) {
          return false;
        } else if (u > c) {
          break;
        }
        t[h] = t[--j]; // ignore already processed entry
      }
    }
    return true;
  }

  @Override
  public Long get(final Integer n, final Integer m) {
    return m <= n / 2 ? super.get(n, m) : super.get(n, n - m);
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return Z.valueOf(get(mN, mM));
  }
}

