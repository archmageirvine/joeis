package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.Permutation;

/**
 * A000512 Number of equivalence classes of n X n matrices over <code>{0,1}</code> with rows and columns summing to <code>3,</code> where equivalence is defined by row and column permutations.
 * @author Sean A. Irvine
 */
public class A000512 implements Sequence {

  // I don't think this code is very competitive ....
  // It does lots of exhaustive searching

  private int mN = 0;

  private static int snoob(final int x) {
    final int smallest = x & -x;
    final int ripple = x + smallest;
    final int ones = x ^ ripple;
    return ripple | ((ones >> 2) / smallest);
  }

  private static int[] rotate(final int[] m) {
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

  /*
  private static void dump(final int[] matrix) {
    final StringBuilder z = new StringBuilder();
    for (int k = 0; k < matrix.length; ++k) {
      z.append('0');
    }
    final String zeros = z.toString();
    for (final int r : matrix) {
      final String row = z + Integer.toBinaryString(r);
      System.out.println(row.substring(row.length() - matrix.length));
    }
  }
  */

  private static int findMin(final int[] m, final int j) {
    int r = 0;
    for (int k = 1; k < j; ++k) {
      if (m[k] < m[r]) {
        r = k;
      }
    }
    return r;
  }

  private static boolean isCanonical(final int[] matrix) {
    final int[] r = rotate(matrix);
    final int[] pm = new int[r.length];
    // Generate all permutations of r
    final Permutation perm = new Permutation(r.length);
    int[] p;
    while ((p = perm.next()) != null) {
      for (int k = 0; k < pm.length; ++k) {
        pm[k] = r[p[k]];
      }
      final int[] t = rotate(pm);

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

  private long mCount = 0;

  private void process(final int[] matrix) {
    if (isCanonical(matrix)) {
      ++mCount;
    }
  }

  protected boolean checkColumns(final int[] m) {
    // By construction, the biggest column count we will encounter
    // is 4, this means 3 bits are sufficient to detect it.  We do
    // three separate sums masking appropriate bits, and check for
    // diagnostic bits.

    // This method is likely much faster than the naive approach for
    // larger matrices, since it is O(n) rather than O(n^2).

    int a = 0;
    int b = 0;
    int c = 0;
    for (final int v : m) {
      a += v & 0x49249249;
      b += (v >> 1) & 0x49249249;
      c += (v >> 2) & 0x49249249;
    }
    return ((a | b | c) & 0x24924924) == 0;
  }

  protected int pop() {
    return 3;
  }

  private void enumerate(final int[] m, final int row) {
    // Generate matrices in sorted order by rows.  Generation is done
    // such that row[n+1] >= row[n]
    final int p = pop();
    // Constraint on where the leftmost "1" can be on a given row
    final int limit = 1 << (m.length - (m.length - row - 1) / p);
    while (m[row] < limit) {
      // Extend to next row if allowable
      if (checkColumns(m)) {
        if (row + 1 == m.length) {
          process(m);
        } else {
          m[row + 1] = m[row];
          enumerate(m, row + 1);
          m[row + 1] = 0; // rezero when backtracking
        }
      }

      // Bump entry on current row, maintaining column constraint
      do {
        m[row] = snoob(m[row]);
      } while (m[row] < limit && row >= p && !checkColumns(m));
    }
  }

  private void enumerate(final int size) {
    final int[] m = new int[size];
    m[0] = (1 << pop()) - 1;
    enumerate(m, 0);
  }

  @Override
  public Z next() {
    mCount = 0;
    enumerate(++mN);
    return Z.valueOf(mCount);
  }
}
