package irvine.oeis.a213;

import java.util.Arrays;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A213430.
 * @author Sean A. Irvine
 */
public class A213430 extends Sequence1 {

  /*
   * Explanation from Petros Hadjicostas based on Gupta's paper:
   * Let M be a 0-1 upper triangular n x n matrix (M_{ij}: 1 <= i,j <= n) with 1s in the main diagonal.
   * Denote by f(M^2) the n x n matrix obtained by replacing every nonzero element in the matrix M^2 by 1.
   * Then A213430(n) is the number of such matrices M that satisfy f(M^2) = M and
   * sum(row 1) >= sum(row 2) >= ... >= sum(row n-1) >= sum(row n) = 1.
   */

  /*
   * We construct the matrix row by row with each row represented by a long.
   * The leading diagonal is not stored (nor the last row which is always "1").
   * The row 1, 0, 1, 0, 1, 1, for example is packed as 1011.
   * We compute f(M^2) directly (i.e., without need for nonzero step).
   * The get and printMatrix methods deal appropriately with implicit diagonal 1s.
   */

  private int mN = 0;
  private long mCount = 0;
  private long[] mRows;

//  private void printMatrix(final long[] m, final String name) {
//    System.out.println(name);
//    final int n = m.length + 1;
//    final String pad = "0".repeat(n);
//    for (int k = 0; k < n - 1; ++k) {
//      final String r = pad + Long.toBinaryString(m[k] | (1L << (n - 1 - k)));
//      System.out.println(r.substring(r.length() - n));
//    }
//    if (n > 0) {
//      System.out.println("0".repeat(n - 1) + "1");
//    }
//    System.out.println();
//  }

  private long get(final long[] m, final int k, final int j) {
    return k == j ? 1L : ((m[k] >> (m.length - j)) & 1);
  }

  private boolean is(final long[] m) {
    // Test f(M^2) = M
    //printMatrix(m, "M");

    // Compute f(M^2) by determining if each (k,j) is nonzero.
    final int n1 = m.length;
    final long[] m2or = new long[n1];
    for (int k = 0; k < n1; ++k) {
      for (int j = 0; j <= n1; ++j) {
        // Compute element (k,j) of f(M^2)
        long bit = 0;
        for (int i = 0; i <= j; ++i) {
          bit |= get(m, k, i) & get(m, i, j);
        }
        assert bit == 0 || bit == 1;
        m2or[k] |= bit << (n1 - j);
      }
      m2or[k] &= (1L << (n1 - k)) - 1; // Clear main diagonal for comparison with M
    }

    //printMatrix(m2or, "fM^2" + " equals: " + Arrays.equals(m2or, m));

    return Arrays.equals(m2or, m);
  }

  // Generate matrices one row at a time, but without the leading diagonal
  private void search(final int row, final int popCountPrevRow) {
    if (row == mN - 1) {
      // Last row is implicitly 1
      if (is(mRows)) {
        ++mCount;
      }
      return;
    }
    mRows[row] = 0;
    search(row + 1, 0); // Handle special case of 0 row (ignoring main diagonal)

    // Set up for the row search
    final long lim = 1L << (mN - row - 1); // maximum value to be still upper triangular
    long v = 1; // bit vector for the row
    int pop = 1; // number of 1 bits in the row

    // Generate each possible 0,1-vector for the given row.
    // Step to the next vector v with the same number of set bits as the current vector.
    // If this value exceeds the maximum value, then increase the number of 1s in the
    // vector. If this exceeds the previous row then we are done.
    while (pop <= popCountPrevRow) {
      mRows[row] = v; // Actually stash the row in the matrix
      search(row + 1, pop); // Try the current vector
      // Step to the next vector
      v = Functions.SWIZZLE.l(v);
      if (v >= lim) {
        // Step to the next higher number of 1s
        ++pop;
        v = (1L << pop) - 1;
      }
    }
  }

  @Override
  public Z next() {
    mRows = new long[mN++]; // Only need n-1 rows, last row is implicitly "1"
    mCount = 0;
    search(0, mN - 1);
    return Z.valueOf(mCount);
  }
}
