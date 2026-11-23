package irvine.math.graph;

import java.util.Arrays;

/**
 * Exact search for the finite-board snake number variants.
 * @author Gregory Morse
 */
public final class SnakeNumberBoard {
  private final int mN;
  private final int[] mX;
  private final int[] mY;
  private final int[][] mMoves;
  private final long[] mPhases;
  private final boolean[] mVisited;
  private final long[] mRows;
  private final long[] mColumns;
  private final boolean mKnight;
  private int mBest;

  private SnakeNumberBoard(final int n, final boolean knight) {
    if (n < 1 || n > Long.SIZE) {
      throw new IllegalArgumentException("Board dimensions out of range");
    }
    mN = n;
    mKnight = knight;
    final int size = n * n;
    mX = new int[size];
    mY = new int[size];
    mMoves = new int[size][];
    mPhases = new long[size];
    mVisited = new boolean[size];
    mRows = new long[n];
    mColumns = new long[n];
    for (int i = 0; i < size; ++i) {
      mX[i] = i % n;
      mY[i] = i / n;
      mPhases[i] = 1L << mX[i];
    }
    for (int i = 0; i < size; ++i) {
      final int[] moves = new int[8];
      int count = 0;
      for (int j = 0; j < size; ++j) {
        if (adjacent(i, j)) {
          moves[count++] = j;
        }
      }
      mMoves[i] = Arrays.copyOf(moves, count);
    }
  }

  private boolean adjacent(final int i, final int j) {
    final int x = Math.abs(mX[i] - mX[j]);
    final int y = Math.abs(mY[i] - mY[j]);
    return mKnight ? x * y == 2 : x + y == 1;
  }

  private void search(final int cell, final int depth) {
    mBest = Math.max(mBest, depth + 1);
    if (mBest == mVisited.length) {
      return;
    }
    final int row = mY[cell];
    final int col = mX[cell];
    final long mark = mPhases[depth];
    final long next = mPhases[depth + 1];
    mRows[row] |= mark;
    mColumns[col] |= mark;
    mVisited[cell] = true;
    for (final int dest : mMoves[cell]) {
      if (!mVisited[dest] && ((mRows[mY[dest]] | mColumns[mX[dest]]) & next) == 0) {
        search(dest, depth + 1);
        if (mBest == mVisited.length) {
          break;
        }
      }
    }
    mVisited[cell] = false;
    mRows[row] ^= mark;
    mColumns[col] ^= mark;
  }

  private void acceptPath(final int[] path) {
    final boolean[] seen = new boolean[mVisited.length];
    final long[] rows = new long[mN];
    final long[] cols = new long[mN];
    for (int i = 0; i < path.length; ++i) {
      final int cell = path[i];
      final long mark = mPhases[i];
      if (seen[cell] || i > 0 && !adjacent(path[i - 1], cell)
        || ((rows[mY[cell]] | cols[mX[cell]]) & mark) != 0) {
        throw new IllegalArgumentException("Invalid snake path at position " + i);
      }
      seen[cell] = true;
      rows[mY[cell]] |= mark;
      cols[mX[cell]] |= mark;
    }
    mBest = Math.max(mBest, path.length);
  }

  /**
   * Exhaustively search the board for the longest valid path.
   * @param n board side length
   * @param knight allow knight moves instead of orthogonal unit moves
   * @return maximum path length
   */
  public static int maximum(final int n, final boolean knight) {
    final SnakeNumberBoard board = new SnakeNumberBoard(n, knight);
    // Reflections and transposition preserve both the moves and the constraints.
    for (int y = 0; 2 * y < n && board.mBest < n * n; ++y) {
      for (int x = 0; x <= y && board.mBest < n * n; ++x) {
        board.search(y * n + x, 0);
      }
    }
    return board.mBest;
  }

  /**
   * Check an attaining path and return its length.
   * @param n board side length
   * @param knight allow knight moves instead of orthogonal unit moves
   * @param path row-major cell indices along the path
   * @return length of the validated path
   */
  public static int witnessLength(final int n, final boolean knight, final int[] path) {
    final SnakeNumberBoard board = new SnakeNumberBoard(n, knight);
    board.acceptPath(path);
    return board.mBest;
  }
}
