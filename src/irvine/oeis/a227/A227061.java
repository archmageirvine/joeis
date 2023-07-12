package irvine.oeis.a227;

import irvine.math.IntegerUtils;
import irvine.math.z.Z;
import irvine.oeis.memory.MemoryFunction2Sequence;

/**
 * A227061 T(n,k) = Number of (n+k-1) X (n+k-1) binary arrays with k 1s in every row and column with rows and columns in lexicographically nondecreasing order.
 * @author Sean A. Irvine
 */
public class A227061 extends MemoryFunction2Sequence<Integer, Long> {

  /** Construct the sequence. */
  public A227061() {
    super(1);
  }

  private int mN = 0;
  private int mM = 0;

  private long mCount = 0;
  private int mMaxSum = 0;
  private int mLimit;

  private boolean isColSafe(final int[] colSums, final int element) {
    for (int k = 0, j = 1; k < colSums.length; ++k, j <<= 1) {
      if ((element & j) != 0 && colSums[k] >= mMaxSum) {
        return false;
      }
    }
    return true;
  }

  private static void incColSums(final int[] colSums, final int element) {
    for (int k = 0, j = 1; k < colSums.length; ++k, j <<= 1) {
      if ((element & j) != 0) {
        ++colSums[k];
      }
    }
  }

  private static void decColSum(final int[] colSums, final int element) {
    for (int k = 0, j = 1; k < colSums.length; ++k, j <<= 1) {
      if ((element & j) != 0) {
        --colSums[k];
      }
    }
  }

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

  private static boolean isSorted(final int[] m) {
    for (int k = 1; k < m.length; ++k) {
      if (m[k] < m[k - 1]) {
        return false;
      }
    }
    return true;
  }

  // Construct in a way that maintains both the matrix and transpose in lexicographic sorted order
  private void search(final int[] matrix, final int[] transpose, final int[] colSums, final int row, final int element) {
    if (row == matrix.length) {
      assert isSorted(matrix);
      assert isSorted(transpose);
      if (accept(matrix, transpose)) {
        ++mCount;
      }
      return;
    }
    if (element >= mLimit) {
      return;
    }
    final int bit = 1 << (matrix.length - row - 1);
    for (int e = element; e < mLimit; e = IntegerUtils.swizzle(e)) {
      // Place element in matrix[row] and move to next row
      if (isColSafe(colSums, e)) {
        incColSums(colSums, e);
        matrix[row] = e;
        for (int k = transpose.length - 1, j = e; k >= 0; --k, j >>>= 1) {
          transpose[k] |= bit * (j & 1);
        }
        if (isSorted(transpose)) {
          search(matrix, transpose, colSums, row + 1, e);
        }
        for (int k = 0; k < transpose.length; ++k) {
          transpose[k] &= ~bit;
        }
        //matrix[row] = 0;
        decColSum(colSums, e);
      }
    }
  }

  protected boolean accept(final int[] matrix, final int[] transpose) {
    return true;
  }

  @Override
  protected Long compute(final Integer n, final Integer m) {
    if (m > n) {
      return 0L;
    }
    if (m < 1) {
      return 1L;
    }
    mCount = 0;
    mMaxSum = m;
    mLimit = 1 << n;
    search(new int[n], new int[n], new int[n], 0, (1 << m) - 1);
    return mCount;
  }

  @Override
  public Z next() {
    if (++mM >= mN) {
      ++mN;
      mM = 0;
    }
    return Z.valueOf(get(mN, mN - mM));
  }
}
