package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

import java.util.HashSet;

/**
 * A002047 Number of <code>3 X (2n+1) zero-sum</code> arrays with entries <code>-n,..,0,..,n</code>.
 * @author Sean A. Irvine
 */
public class A002047 implements Sequence {

  // Hexagonal grid has size n + 1
  // We are to chose 2n+1 values, such that no two are on the same row,
  // or left diagonal or right diagonal.

  // Each cell in the hexagonal grid is on precisely one row, one left diagonal
  // and one right diagonal.  These can be precomputed for a given hexagon
  // size.  Then search to count allowed arrangements keeping track of which
  // rows and diagonals are already used.

  private int mN = -1;

  private boolean[] mUsedRow;
  private boolean[] mUsedLeftDiagonal;
  private boolean[] mUsedRightDiagonal;
  private int[] mRow;
  private int[] mLeftDiagonal;
  private int[] mRightDiagonal;
  private int mPtNumber = 0;
  private int mTarget = 0;
  private long mCount = 0;

  private void setUp(final HashSet<String> used, final int row, final int left, final int right) {
    if (row > mN || left > mN || right > mN || row < -mN || left < -mN || right < -mN) {
      return;
    }
    // This might not be very smart, but the computation time is dominated
    // by the counting anyway.
    final String key = row + "," + left + "," + right;
    if (!used.add(key)) {
      return; // already done
    }
    mRow[mPtNumber] = row + mN;
    mLeftDiagonal[mPtNumber] = left + mN;
    mRightDiagonal[mPtNumber] = right + mN;
    ++mPtNumber;
    // Step 6 ways
    setUp(used, row, left - 1, right - 1);
    setUp(used, row, left + 1, right + 1);
    setUp(used, row + 1, left - 1, right);
    setUp(used, row - 1, left + 1, right);
    setUp(used, row + 1, left, right + 1);
    setUp(used, row - 1, left, right - 1);
  }

  private void setUp() {
    mCount = 0;
    mTarget = 2 * mN + 1;
    mUsedRow = new boolean[mTarget];
    mUsedLeftDiagonal = new boolean[mTarget];
    mUsedRightDiagonal = new boolean[mTarget];
    final int numPoints = 3 * mN * (mN + 1) + 1;
    mPtNumber = 0;
    mRow = new int[numPoints];
    mLeftDiagonal = new int[numPoints];
    mRightDiagonal = new int[numPoints];
    setUp(new HashSet<>(), 0, 0, 0);
    assert mPtNumber == numPoints;
  }

  private void count(final int usedSoFar, final int position) {
    if (mUsedRow[mRow[position]]
        || mUsedLeftDiagonal[mLeftDiagonal[position]]
        || mUsedRightDiagonal[mRightDiagonal[position]]) {
      return;
    }
    final int u = usedSoFar + 1;
    if (u == mTarget) {
      ++mCount;
      return;
    }
    mUsedRow[mRow[position]] = true;
    mUsedLeftDiagonal[mLeftDiagonal[position]] = true;
    mUsedRightDiagonal[mRightDiagonal[position]] = true;
    final int limit = mRow.length - (mTarget - u);
    for (int p = position + 1; p <= limit; ++p) {
      count(u, p);
    }
    mUsedRow[mRow[position]] = false;
    mUsedLeftDiagonal[mLeftDiagonal[position]] = false;
    mUsedRightDiagonal[mRightDiagonal[position]] = false;
  }

  @Override
  public Z next() {
    ++mN;
    setUp();
    for (int p = 0; p <= mRow.length - mTarget; ++p) {
      count(0, p);
    }
    return Z.valueOf(mCount);
  }
}
