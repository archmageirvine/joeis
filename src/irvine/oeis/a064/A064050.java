package irvine.oeis.a064;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A064050 Number of essentially different (not mappable to each other by reflection or rotation) arrangements of numbers 1 to n*(n+1)/2 in a triangle of n rows, in such a way that each row and each diagonal is increasing or decreasing.
 * @author Sean A. Irvine
 */
public class A064050 extends Sequence1 {

  protected int mN = 0;
  private int[][] mT;
  private boolean[] mUsed;
  private long mCount = 0;

  private boolean isOk(final int row, final int col, final int k) {
    if (col >= 2) {
      final boolean rowIncreasing = mT[row][col - 2] < mT[row][col - 1];
      final boolean rowProposed = mT[row][col - 1] < k;
      if (rowProposed != rowIncreasing) {
        return false;
      }
      if (col >= row - 3) {
        final boolean leftDiagonalIncreasing = mT[row - 2][col - 2] < mT[row - 1][col - 1];
        final boolean leftRightProposed = mT[row - 1][col - 1] < k;
        if (leftDiagonalIncreasing != leftRightProposed) {
          return false;
        }
      }
    }
    if (col <= row - 2) {
      final boolean rightDiagonalIncreasing = mT[row - 2][col] < mT[row - 1][col];
      final boolean rightDiagonalProposed = mT[row - 1][col] < k;
      if (rightDiagonalIncreasing != rightDiagonalProposed) {
        return false;
      }
    }
    return true;
  }

  private void search(final int row, final int col) {
    if (col > row) {
      search(row + 1);
      return;
    }
    for (int k = row + 1; k < mUsed.length; ++k) {
      if (!mUsed[k] && isOk(row, col, k)) {
        mUsed[k] = true;
        mT[row][col] = k;
        search(row, col + 1);
        mUsed[k] = false;
      }
    }
  }

  private void search(final int row) {
    if (row >= mT.length) {
      ++mCount;
      //System.out.println(Arrays.deepToString(mT));
      return;
    }
    if (!mUsed[row]) {
      return;
    }
    search(row, 0);
  }

  @Override
  public Z next() {
    if (++mN <= 1) {
      return Z.ONE;
    }
    // Empty triangle of full size
    mT = new int[mN][];
    for (int k = 0; k < mN; ++k) {
      mT[k] = new int[k + 1];
    }
    mUsed = new boolean[mN * (mN + 1) / 2 + 1];
    // WLOG [1] [2, x]
    mT[0][0] = 1;
    mT[1][0] = 2;
    mUsed[1] = true;
    mUsed[2] = true;
    mCount = 0;
    search(1, 1);
    return Z.valueOf(mCount);
  }
}
