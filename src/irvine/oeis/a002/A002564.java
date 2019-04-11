package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.Pair;

import java.util.ArrayList;
import java.util.Collections;

/**
 * A002564 Number of different ways one can attack all squares on <code>an n</code> X n chessboard using the minimal number of queens.
 * @author Sean A. Irvine
 */
public class A002564 implements Sequence {

  // This code uses a fairly simple backtracking approach to enumerate
  // all possible placements forming a dominating set, up to the minimum
  // number of queens so far needed.

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  protected int mBoardSize = 0;
  protected int mSquares;
  protected int mMinQueens;
  private long mCount = 0;
  private Z mFilled;
  protected Z[] mCovers;
  protected Z[] mPositions;

  protected void initConstants() {
    // Initially start with one queen per column, which certainly is a
    // dominating cover.  This number gets reduced during the course of
    // the search as progressively better solutions are found.
    mMinQueens = mBoardSize;
    mSquares = mBoardSize * mBoardSize;
    mCovers = new Z[mSquares];
    mPositions = new Z[mSquares];
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
    final ArrayList<Pair<Z, Z>> coversAndPositions = new ArrayList<>();

    // Note this initialization only happens once for each new board size
    // so it does not need to be efficient.
    for (int y = 0, ypos = 0; y < mBoardSize; ++y, ypos += mBoardSize) {
      for (int x = 0; x < mBoardSize; ++x) {
        final int queenPos = ypos + x;
        Z c = Z.ZERO;
        // Fill in the row
        for (int k = 0; k < mBoardSize; ++k) {
          c = c.or(Z.ONE.shiftLeft(ypos + k)); // row
          c = c.or(Z.ONE.shiftLeft(k * mBoardSize + x)); // column
        }
        // Fill in the diagonals
        if (mBoardSize > 1) {
          for (int k = queenPos, xp = x, yp = y; xp < mBoardSize && yp < mBoardSize; k += mBoardSize + 1, ++xp, ++yp) {
            c = c.or(Z.ONE.shiftLeft(k));
          }
          for (int k = queenPos, xp = x, yp = y; xp >= 0 && yp < mBoardSize; k += mBoardSize - 1, --xp, ++yp) {
            c = c.or(Z.ONE.shiftLeft(k));
          }
          for (int k = queenPos, xp = x, yp = y; xp < mBoardSize && yp >= 0; k -= mBoardSize - 1, ++xp, --yp) {
            c = c.or(Z.ONE.shiftLeft(k));
          }
          for (int k = queenPos, xp = x, yp = y; xp >= 0 && yp >= 0; k -= mBoardSize + 1, --xp, --yp) {
            c = c.or(Z.ONE.shiftLeft(k));
          }
        }
        coversAndPositions.add(new Pair<>(c, Z.ONE.shiftLeft(queenPos)));
      }
    }
    Collections.shuffle(coversAndPositions);
    for (int k = 0; k < coversAndPositions.size(); ++k) {
      final Pair<Z, Z> p = coversAndPositions.get(k);
      mCovers[k] = p.left();
      mPositions[k] = p.right();
    }
  }

  protected boolean keepLooking(final int queens) {
    return queens < mMinQueens;
  }

  protected boolean isCounted(final Z queenState) {
    return true;
  }

  protected boolean acceptable(final Z state, final int position) {
    return true;
  }
 
  private void enumerate(final Z state, final Z queenState, final int queens, final int nextFreePosition) {
    if (state.equals(mFilled)) {
      // Board is dominated
      if (queens < mMinQueens) {
        // This solution is better than all existing solutions.  Reduce
        // the number of queens required and reset the count.
        mMinQueens = queens;
        mCount = 0;
        if (mVerbose) {
          System.out.println("Min queens is now " + mMinQueens);
        }
      }
      if (isCounted(queenState)) {
        assert queens == mMinQueens;
        ++mCount; // Another solution with same number of queens
      }
    } else {
      // If we have less than the minimum number of queens, but no solution
      // yet, so try adding a queen at each remaining position.  Note each
      // placement can reduce mMinQueens, so need to check at each iteration
      for (int p = nextFreePosition; keepLooking(queens) && p < mSquares; ++p) {
        if (acceptable(state, p)) {
          final Z newState = state.or(mCovers[p]);
          if (!newState.equals(state)) {
            // Only consider this queen position if it improves the result
            enumerate(newState, queenState.or(mPositions[p]), queens + 1, p + 1);
          }
        }
      }
    }
  }

  protected Z count() {
    return Z.valueOf(mCount);
  }

  @Override
  public Z next() {
    ++mBoardSize;
    initConstants();
    enumerate(Z.ZERO, Z.ZERO, 0, 0);
    return count();
  }

  /**
   * Compute a particular term.
   * @param args term to compute with optional upper bound (e.g. from A075458).
   */
  public static void main(final String... args) {
    final A002564 seq = new A002564();
    seq.mBoardSize = Integer.parseInt(args[0]);
    seq.initConstants();
    if (args.length > 1) {
      seq.mMinQueens = Integer.parseInt(args[1]);
    }
    seq.enumerate(Z.ZERO, Z.ZERO, 0, 0);
    System.out.println(seq.count());
  }
}
