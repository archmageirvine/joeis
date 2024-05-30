package irvine.oeis.a007;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A007705 Number of ways of arranging 2n+1 nonattacking queens on a 2n+1 X 2n+1 toroidal board.
 * @author Sean A. Irvine
 */
public class A007705 extends AbstractSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A007705(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A007705() {
    super(0);
  }

  // This code uses a fairly simple backtracking approach to search
  // all possible placements forming a dominating set, up to the minimum
  // number of queens so far needed.

  protected int mBoardSize = -1;
  protected int mSquares;
  private long mCount = 0;
  private Z mFilled;
  protected Z[] mCovers;

  protected void initConstants() {
    mSquares = mBoardSize * mBoardSize;
    mCovers = new Z[mSquares];
    // The low mSquares bits of a long are used to indicate which squares
    // are dominated by the current state.  Once this becomes all one we
    // have reached a domination of the board.
    mFilled = Z.ONE.shiftLeft(mSquares).subtract(1);

    // We precompute the set of positions dominated by each square on the
    // board.  Empirically it is better to consider the cells in a random
    // order during the search, thus the final result is shuffled.  But,
    // for A002563 we need to know the actual assignment of queens so we
    // can test for isomorphisms.  This means we need to also keep track
    // of the actual positions where queens are placed.
    // Note this initialization only happens once for each new board size
    // so it does not need to be efficient.
    int j = 0;
    for (int y = 0, ypos = 0; y < mBoardSize; ++y, ypos += mBoardSize) {
      for (int x = 0; x < mBoardSize; ++x) {
        Z c = Z.ZERO;
        // Fill in the row
        for (int k = 0; k < mBoardSize; ++k) {
          c = c.or(Z.ONE.shiftLeft(ypos + k)); // row
          c = c.or(Z.ONE.shiftLeft((long) k * mBoardSize + x)); // column
        }
        // Fill in the diagonals (with wrap)
        if (mBoardSize > 1) {
          c = fillDiagonal(y, x, c, 1, 1);
          c = fillDiagonal(y, x, c, -1, 1);
          c = fillDiagonal(y, x, c, 1, -1);
          c = fillDiagonal(y, x, c, -1, -1);
        }
        mCovers[j++] = c;
      }
    }
  }

  private int step(final int z, final int dz, final int mod) {
    final int u = z + dz;
    if (u >= mod) {
      return u - mod;
    } else if (u < 0) {
      return u + mod;
    } else {
      return u;
    }
  }

  private Z fillDiagonal(final int y, final int x, Z c, final int dx, final int dy) {
    int xp = x;
    int yp = y;
    do {
      c = c.or(Z.ONE.shiftLeft((long) yp * mBoardSize + xp));
      xp = step(xp, dx, mBoardSize);
      yp = step(yp, dy, mBoardSize);
    } while (xp != x || yp != y);
    return c;
  }

  private void search(final Z state, final int queens, final int nextFreePosition) {
    if (queens == mBoardSize) {
      ++mCount;
    } else if (!state.equals(mFilled)) {
      for (int p = nextFreePosition; p < mSquares; ++p) {
        if (!state.testBit(p)) {
          search(state.or(mCovers[p]), queens + 1, p + 1);
        }
      }
    }
  }

  @Override
  public Z next() {
    mBoardSize += 2;
    if (Functions.GCD.i(mBoardSize, 6) != 1) {
      return Z.ZERO; // Ahrens theorem
    }
    mCount = 0;
    initConstants();
    search(Z.ZERO, 0, 0);
    return Z.valueOf(mCount);
  }
}
