package irvine.oeis.a155;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A155934 The sequence {k(m)} defined in A005991.
 * @author Sean A. Irvine
 */
public class A155934 extends AbstractSequence {

  /** Construct the sequence. */
  public A155934() {
    super(2);
  }

  private int mN = 1;

  // The actual search part of this implementation is next to useless.  The upper bound is
  // already precise for n <= 42 (but not n = 43).  But this search is too slow to be useful
  // for n bigger than about 10.

//  // Check there is a zero in the three cells in the 2x2 submatrix ending at (x,y)
//  private boolean hasZero(final boolean[][] m, final int x, final int y) {
//    // Check all combinations of rows and columns to left and above specified position
//    for (int k = 0; k < x; ++k) {
//      if (m[k][y]) {
//        for (int j = 0; j < y; ++j) {
//          if (m[x][j] && m[k][j]) {
//            return false;
//          }
//        }
//      }
//    }
//    return true;
//  }
//
//  // Return true iff there exists a matrix m containing k ones in every row and column and no 2x2 submatrix that is all 1s
//  private boolean solve(final boolean[][] m, final int[] colCount, final int[] rowCount, final int k, final int x, final int y) {
//    if (x >= colCount.length) {
//      return true; // Made it all the way through with all conditions satisfied
//    }
//    if (y >= rowCount.length) {
//      return colCount[x] == k && solve(m, colCount, rowCount, k, x + 1, 0);
//    }
//    // Consider placing a 1 at position (x,y)
//    if (colCount[x] < k && rowCount[y] < k && hasZero(m, x, y)) {
//      // can do it
//      colCount[x]++;
//      rowCount[y]++;
//      m[x][y] = true;
//      final boolean res = solve(m, colCount, rowCount, k, x, y + 1);
//      m[x][y] = false;
//      rowCount[y]--;
//      colCount[x]--;
//      if (res) {
//        return true;
//      }
//    }
//    return solve(m, colCount, rowCount, k, x, y + 1);
//  }
//
//  private boolean solve(final int n, final int k) {
//    //System.out.println("n=" + n + " k=" + k);
//    final boolean[][] m = new boolean[n][n];
//    final int[] colCount = new int[n];
//    final int[] rowCount = new int[n];
//    return solve(m, colCount, rowCount, k, 0, 0);
//  }

  private int upperBound(final int n) {
    // This upper bound is exact for n <= 42
    return (int) Math.floor(0.5 * (Math.sqrt(4 * n - 3) + 3));
  }

//  private int lowerBound(final int n) {
//    return (int) Math.ceil(Math.sqrt(n) - Math.pow(n, 5.0 / 16.0));
//  }

  @Override
  public Z next() {
    int prev;
    if (++mN < 43) {
      prev = upperBound(mN);
    } else {
      throw new UnsupportedOperationException();
//      int k = Math.max(mPrev, lowerBound(mN));
//      while (solve(mN, k)) {
//        ++k;
//      }
//      mPrev = k;
    }
    return Z.valueOf(prev);
  }

}

