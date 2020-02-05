package irvine.oeis.a028;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.array.LongDynamicLongArray;

/**
 * A028506 Number of non-descending integral vectors b of length n such that number of symmetric <code>0-1-matrices</code> A of order n with row sums <code>&lt;=</code> b is odd.
 * @author Sean A. Irvine
 */
public class A028506 implements Sequence {

  // There is probably a faster way to do this,
  // but this follows the description in the definition.

  // 1. Generate symmetric {0,1}-matrices of order n
  // 2. Compute the row sum of the matrix
  // 3. Increment vector counts
  // 4. Count number of odd counts

  private int mN = 0;
  private final LongDynamicLongArray mCounts = new LongDynamicLongArray();

  private long pack(final int[] vector) {
    long index = 0;
    for (final int v : vector) {
      index *= mN + 1;
      index += v;
    }
    return index;
  }

  // Matrix here is symmetric
  private void process(final int[] matrix) {
    final int[] rowSums = new int[mN];
    for (int k = 0; k < mN; ++k) {
      rowSums[k] = Integer.bitCount(matrix[k]);
    }
    final long index = pack(rowSums);
    mCounts.set(index, mCounts.get(index) + 1);
  }

  // Represent matrix as n int's using low n bits for each row
  private void generateSymmetric01Matrices(final int[] matrix, final int row, final int col) {
    if (row == mN) {
      // We are done generating
      process(matrix);
      return;
    }
    if (col == row + 1) {
      // Move to next row
      generateSymmetric01Matrices(matrix, row + 1, 0);
    } else {
      // 0 at this location
      generateSymmetric01Matrices(matrix, row, col + 1);
      // 1 at this location
      matrix[row] |= 1 << col;
      matrix[col] |= 1 << row;
      generateSymmetric01Matrices(matrix, row, col + 1);
      matrix[col] &= ~(1 << row);
      matrix[row] &= ~(1 << col);
    }
  }

  private boolean lt(long m, long n) {
    final long mod = mN + 1;
    for (int k = 0; k < mN; ++k) {
      if ((m % mod) > (n % mod)) {
        return false;
      }
      m /= mod;
      n /= mod;
    }
    return true;
  }

  private long totalCount(final long n) {
    long count = 0;
    for (long k = 0; k <= n; ++k) {
      if (lt(k, n)) {
        count += mCounts.get(k);
      }
    }
    return count;
  }

  private boolean isNonDecreasing(long n) {
    long prev = 0;
    for (int k = 0; k < mN; ++k) {
      final long t = n % (mN + 1);
      if (t < prev) {
        return false;
      }
      prev = t;
      n /= mN + 1;
    }
    return true;
  }

  private long countOdd() {
    // The counts form a kind of lattice, there is probably a non-quadratic way to do this
    long cnt = 0;
    for (long k = 0; k < mCounts.length(); ++k) {
      if (isNonDecreasing(k) && (totalCount(k) & 1) == 1) {
        ++cnt;
      }
    }
    return cnt;
  }

  @Override
  public Z next() {
    mCounts.truncate(0);
    final int[] matrix = new int[++mN];
    generateSymmetric01Matrices(matrix, 0, 0);
    return Z.valueOf(countOdd());
  }
}
