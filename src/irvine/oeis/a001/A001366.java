package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001366.
 * @author Sean A. Irvine
 */
public class A001366 implements Sequence {

  // This code uses a fairly simple backtracking approach.
  // Its only good for a few terms.

  private static final int[] DELTA_X = {1, -1, 0, 0, 1, 1, -1, -1};
  private static final int[] DELTA_Y = {0, 0, 1, -1, 1, -1, 1, -1};

  private int mN = 0;
  private int mFree = 0;
  private int mBest = 0;
  private byte[] mBoard = null;

  private boolean inc(final int x, final int y) {
    return mBoard[y * mN + x]++ == 0;
  }

  private boolean dec(final int x, final int y) {
    return --mBoard[y * mN + x] == 0;
  }

  private void place(final int x, final int y) {
    if (inc(x, y)) {
      --mFree;
    }
    for (int d = 0; d < DELTA_X.length; ++d) {
      final int dx = DELTA_X[d];
      final int dy = DELTA_Y[d];
      int u = x + dx;
      int v = y + dy;
      while (u >= 0 && v >= 0 && u < mN && v < mN) {
        if (inc(u, v)) {
          --mFree;
        }
        u += dx;
        v += dy;
      }
    }
  }

  private void unplace(final int x, final int y) {
    if (dec(x, y)) {
      ++mFree;
    }
    for (int d = 0; d < DELTA_X.length; ++d) {
      final int dx = DELTA_X[d];
      final int dy = DELTA_Y[d];
      int u = x + dx;
      int v = y + dy;
      while (u >= 0 && v >= 0 && u < mN && v < mN) {
        if (dec(u, v)) {
          ++mFree;
        }
        u += dx;
        v += dy;
      }
    }
  }

  private void search(final int x, final int y, final int remainingQueens) {
    if (remainingQueens == 0) {
      if (mFree > mBest) {
        mBest = mFree;
      }
      return;
    }
    if (mFree <= mBest) {
      return; // Already worse than best solutions
    }
    // Try all remaining positions
    for (int ny = y; ny < mN; ++ny) {
      for (int nx = ny == y ? x + 1 : 0; nx < mN; ++nx) {
        place(nx, ny);
        search(nx, ny, remainingQueens - 1);
        unplace(nx, ny);
      }
    }
  }

  @Override
  public Z next() {
    ++mN;
    mBest = 0;
    mFree = mN * mN;
    mBoard = new byte[mFree];
    // Symmetry considerations. First queen y <= mN / 2, x <= y
    for (int y = 0; y < (mN + 1) / 2; ++y) {
      for (int x = 0; x <= y; ++x) {
        place(x, y);
        search(x, y, mN - 1);
        unplace(x, y);
      }
    }
    return Z.valueOf(mBest);
  }
}
