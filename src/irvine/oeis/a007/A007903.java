package irvine.oeis.a007;

import java.util.HashSet;
import java.util.Set;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.Permutation;

/**
 * A007903 The number of distinct principal ideals in the semigroup of binary relations on <code>an</code> n-set.
 * @author Sean A. Irvine
 */
public class A007903 implements Sequence {

  private long mCount = 0;
  private int mN = 0;

  // Represent matrix with one long per row.

  // Explicit standard form check (this is slow)
  private boolean isStandardForm(final long[] matrix) {
    final Permutation rowPerm = new Permutation(matrix.length);
    int[] rp;
    while ((rp = rowPerm.next()) != null) {
      final Permutation colPerm = new Permutation(matrix.length);
      int[] cp;
      while ((cp = colPerm.next()) != null) {
        for (int row = 0; row < matrix.length; ++row) {
          final long mr = matrix[row];
          long reduction = 0;
          for (int col = 0; col < matrix.length && reduction <= mr; ++col) {
            if ((matrix[rp[row]] & (1L << cp[col])) != 0) {
              reduction |= 1L << col;
            }
          }
          final int c = Long.compare(reduction, mr);
          if (c > 0) {
            break; // Try next permutation
          } else if (c < 0) {
            return false;
          }
        }
      }
    }
    return true;
  }

  // Necessary conditions for standard form:
  // (1) it is reduced
  // (2) all of its zero rows (cols), if any, are at the top (left) of the matrix
  // (3) its nonzero rows (cols), when considered as binary numbers, are strictly increasing
  // (4) all ones in the first nonzero row (col), are at the right (bottom) of the row (col)
  // (5) none of its rows has fewer ones than the first nonzero rows

  // Addition here is non-standard 1 + 1 = 1.

  // We generate in such a way that (1)-(5) are satisfied for rows, then check cols.

  private long col(final long[] matrix, final int col) {
    final long bit = 1 << col;
    long res = 0;
    for (int k = 0; k < matrix.length; ++k) {
      if ((matrix[k] & bit) != 0) {
        res |= 1L << (mN - 1 - k);
      }
    }
    return res;
  }

  private boolean checkColumnConstraints(final long[] matrix) {
    int col = matrix.length - 1;
    long v;
    while ((v = col(matrix, col)) == 0) {
      --col;
    }
    // col is now first non-zero column, and v its value

    // check it ends with ones (i.e. v + 1 is a power of 2)
    if ((v & (v + 1)) != 0) {
      return false;
    }
    final HashSet<Long> forbidden = new HashSet<>();
    forbidden.add(0L);
    forbidden.add(v);

    // verify remaining columns increase
    for (int k = col - 1; k >= 0; --k) {
      final long u = col(matrix, k);
      if (u <= v || forbidden.contains(u)) {
        return false;
      }
      for (final long w : new HashSet<>(forbidden)) {
        forbidden.add(u | w);
      }
      v = u;
    }
    return true;
  }

//  private void dump(final long[] matrix) {
//    final StringBuilder sb = new StringBuilder();
//    for (final long v : matrix) {
//      if (sb.length() > 0) {
//        sb.append(", ");
//      }
//      sb.append(LongUtils.toBinaryString(v).substring(Long.SIZE - mN));
//    }
//    System.out.println(sb);
//  }

  private void generate(final long[] matrix, final int row, final int minPop, final long min, final Set<Long> forbidden) {
    if (row >= mN) {
      if (checkColumnConstraints(matrix) && isStandardForm(matrix)) {
        //dump(matrix);
        ++mCount;
      }
      return;
    }
    final long limit = 1 << mN;
    long r = min;
    final HashSet<Long> newForbidden = new HashSet<>(2 * forbidden.size());
    while (++r < limit) {
      if (Long.bitCount(r) >= minPop && !forbidden.contains(r)) {
        matrix[row] = r;
        newForbidden.clear();
        newForbidden.addAll(forbidden);
        for (final long v : forbidden) {
          newForbidden.add(v | r);
        }
        generate(matrix, row + 1, minPop, r, newForbidden);
      }
    }
  }

  private void generate(final long[] matrix, final int nonZeroRow) {
    final HashSet<Long> forbidden = new HashSet<>(2);
    for (int k = 1; k <= mN; ++k) {
      matrix[nonZeroRow] = (1L << k) - 1; // k ones
      forbidden.clear();
      forbidden.add(0L);
      forbidden.add(matrix[nonZeroRow]);
      generate(matrix, nonZeroRow + 1, k, matrix[nonZeroRow], forbidden);
    }
  }

  @Override
  public Z next() {
    mCount = 1; // count the all zero matrix
    final long[] matrix = new long[++mN];
    for (int allZeroRows = mN - 1; allZeroRows >= 0; --allZeroRows) {
      generate(matrix, allZeroRows);
    }
    return Z.valueOf(mCount);
  }
}
