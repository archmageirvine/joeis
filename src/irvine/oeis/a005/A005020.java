package irvine.oeis.a005;

import irvine.math.z.Z;

/**
 * A005020.
 * @author Sean A. Irvine
 */
public class A005020 extends A005019 {

  // W. H. Lam describes a potentially more efficient approach.
  // Nevertheless the following was sufficient to verify the existing terms.

  // My approach:
  //
  // I work in rows rather than columns, so some of the concepts are around the
  // opposite dimension to that described in Lam.  In particular, we are
  // looking for the minimal number of rows.
  //
  // I generate the matrix one row at a time.  Each row is represented by a
  // single int with one bit per column.  Thus for a matrix of size n, the
  // possible values for row r range from 0 to 2^n-1.
  //
  // I assign an entire row at a time.  For each possible assignment, I check
  // if the assignment leads to column sums > 1 at every column, by either
  // the row itself is 2^n-1, or if in combination with a previous row this
  // is achieved.  If either is the case, then the 1-width of the matrix is at
  // most 2.  Since any remaining cells could be 0 or 1, it is easy to increment
  // the total count for the remaining matrix without any further computation.
  //
  // Otherwise the search must continue by deciding the content for next row.
  //
  // At the end, I can subtract the number of matrices for which a single row
  // suffices (since that is given by an easy formula in A005019(n)).

  private Z mCount = Z.ZERO;
  private int mN = 0;

  private boolean isComplete(final int[] rows, final int r, final int k) {
    final int c = (1 << mN) - 1;
    if (k == c) {
      return true;
    }
    for (int j = 0; j < r; ++j) {
      if ((k | rows[j]) == c) {
        return true;
      }
    }
    return false;
  }

  private void search(final int[] rows, final int r) {
    if (r < rows.length) {
      // Loop over all possible values for row[r]
      for (int k = 0; k < 1 << mN; ++k) {
        if (isComplete(rows, r, k)) {
          // The remainder of the matrix can be filled in any manner and this
          // matrix will have all cols > 1 with a minimum of 1 or 2 rows.
          // There are (mN - r - 1) * mN remaining cells ...
          mCount = mCount.add(Z.ONE.shiftLeft((mN - r - 1) * mN));
        } else {
          rows[r] = k;
          search(rows, r + 1);
        }
      }
    }
  }

  @Override
  public Z next() {
    ++mN;
    mCount = Z.ZERO;
    search(new int[mN], 0);
    // It remains to remove the count of matrices for which a single row suffices
    return mCount.subtract(super.next());
  }
}

