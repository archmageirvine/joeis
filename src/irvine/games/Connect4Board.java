package irvine.games;

import java.util.Arrays;
import java.util.Set;

import irvine.util.string.StringUtils;

/**
 * Representation of state during a game of Connect 4.
 * @author Sean A. Irvine
 */
public final class Connect4Board implements Comparable<Connect4Board> {

  // Connect Four
  // When one player gets four coins in a row, column, or diagonal the game ends.
  // The board size is 6 rows, 7 columns.
  // Call players red = 01, black = 10.
  // This sequence is up to horizontal reflection.
  // Represent each row by a short with 2-bits per column (00, 01, or 10).
  // Represent board with array of 6 shorts, entry 0 is bottom row.
  // Note sequence is finite and contains 43 terms -- once they are all computed
  // this code would never be needed again.
  // The solution for the non-reflected case is completed, see A212693.
  // Moved this here so can do an offline verification of terms.

  private static final int ROWS = 6;
  private static final int COLS = 7;
  private static final int BITS_PER_CELL = 2;
  private static final int BIT_MASK = (1 << BITS_PER_CELL) - 1;
  private static final char[] SYMBOLS = {'.', '@', 'X', '!'};
  private static final short[] REFLECT = computeRowReflectionTable();

  private static short[] computeRowReflectionTable() {
    // Some of these values (with bits 11) are never used, but it does no harm
    // to compute them all up front.  It's minor time in the grand scheme of things.
    final short[] reflect = new short[1 << (BITS_PER_CELL * COLS)];
    for (int row = 0; row < reflect.length; ++row) {
      int v = 0;
      for (int r = row, k = 0; k < COLS; ++k, r >>>= BITS_PER_CELL) {
        v <<= BITS_PER_CELL;
        v += r & BIT_MASK;
      }
      reflect[row] = (short) v;
    }
    return reflect;
  }

  /**
   * Test if the supplied array is in the least of the two reflections.
   * @param board board
   * @return true iff is the least to the two orderings
   */
  public static boolean isLeast(final short[] board) {
    for (final short row : board) {
      final short r = REFLECT[row];
      if (row < r) {
        return true;
      } else if (row > r) {
        return false;
      }
    }
    return true; // completely symmetric
  }

  /**
   * Test if the most recent play at the specified position finished the game.
   * @param board current board
   * @param row row last played
   * @param col column last played
   * @return true iff this play finished the game.
   */
  public static boolean isFinished(final short[] board, final int row, final int col) {
    // We just played at (row, col), did that play result in a win
    // Check for four in a row
    int r = board[row];
    final int mask = 0b11111111;
    while (r >= 0b01010101) {
      final int g = r & mask;
      if (g == 0b01010101 || g == 0b10101010) {
        return true;
      }
      r >>>= 2;
    }
    // Check for four in a column
    final int msk = BIT_MASK << (2 * col);
    final int player = board[row] & msk;
    if (row >= 3) {
      boolean ok = true;
      for (int m = 1; m < 4; ++m) {
        if ((board[row - m] & msk) != player) {
          ok = false;
          break;
        }
      }
      if (ok) {
        return true;
      }
    }
    // Check diagonals
    // Harder because we need to check both up and down
    int cnt = 1;
    final int p = player >> (2 * col);
    for (int y = row - 1, x = 2 * (col - 1); y >= 0; --y, x -= 2) {
      if (((board[y] >>> x) & BIT_MASK) == p) {
        if (++cnt == 4) {
          return true;
        }
      } else {
        break;
      }
    }
    for (int y = row + 1, x = 2 * (col + 1); y < ROWS; ++y, x += 2) {
      if (((board[y] >>> x) & BIT_MASK) == p) {
        if (++cnt == 4) {
          return true;
        }
      } else {
        break;
      }
    }
    cnt = 1;
    for (int y = row - 1, x = 2 * (col + 1); y >= 0; --y, x += 2) {
      if (((board[y] >>> x) & BIT_MASK) == p) {
        if (++cnt == 4) {
          return true;
        }
      } else {
        break;
      }
    }
    for (int y = row + 1, x = 2 * (col - 1); y < ROWS; ++y, x -= 2) {
      if (((board[y] >>> x) & BIT_MASK) == p) {
        if (++cnt == 4) {
          return true;
        }
      } else {
        break;
      }
    }
    return false;
  }

  private final short[] mBoard;
  private final boolean mFinished;

  Connect4Board(final short[] board, final boolean finished) {
    mBoard = board;
    mFinished = finished;
  }

  /**
   * Construct a new empty board.
   */
  public Connect4Board() {
    mBoard = new short[ROWS];
    mFinished = false;
  }

  Connect4Board(final String desc) {
    mBoard = new short[ROWS];
    mFinished = desc.length() > 4 * ROWS && desc.charAt(4 * ROWS) == '!';
    for (int k = 0; k < mBoard.length; ++k) {
      mBoard[k] = Short.parseShort(desc.substring(4 * k, 4 * k + 4), 16);
    }
  }

  /**
   * Reflect the board left-to-right.
   */
  public void reflect() {
    for (int k = 0; k < mBoard.length; ++k) {
      mBoard[k] = REFLECT[mBoard[k]];
    }
  }

  /**
   * Test if the supplied array is symmetric.
   * @return true iff symmetric
   */
  public boolean isSymmetric() {
    for (final short row : mBoard) {
      if (REFLECT[row] != row) {
        return false;
      }
    }
    return true; // completely symmetric
  }

  @Override
  public int compareTo(final Connect4Board o) {
    for (int k = 0; k < mBoard.length; ++k) {
      final int c = Short.compare(mBoard[k], o.mBoard[k]);
      if (c != 0) {
        return c;
      }
    }
    return 0;
  }

  @Override
  public int hashCode() {
    return Arrays.hashCode(mBoard);
  }

  @Override
  public boolean equals(final Object obj) {
    return obj instanceof Connect4Board && Arrays.equals(mBoard, ((Connect4Board) obj).mBoard);
  }

  @Override
  public String toString() {
    final StringBuilder s = new StringBuilder();
    for (int row = mBoard.length - 1; row >= 0; --row) {
      final StringBuilder sb = new StringBuilder();
      for (int col = 0, r = mBoard[row]; col < COLS; ++col, r >>>= BITS_PER_CELL) {
        sb.append(SYMBOLS[r & BIT_MASK]);
      }
      s.append(sb).append('\n');
    }
    s.append(StringUtils.rep('-', COLS)).append('\n');
    return s.toString();
  }

  public boolean isFinished() {
    return mFinished;
  }

  /**
   * Test if this is the canonical form of this board.
   * @return true if the lower of horizontal symmetry
   */
  public boolean isLeast() {
    return isLeast(mBoard);
  }

  /**
   * Step the board to all possible next states, adding them to result.
   * @param res where to store the results
   * @param mover either <code>0b01</code> or <code>0b10</code> depending on turn
   */
  public void step(final Set<Connect4Board> res, final int mover) {
    if (!isFinished()) {
      // Try each possible move
      for (int col = 0; col < COLS; ++col) {
        final int c2 = 2 * col;
        // Attempt to play in column col
        int row = 0;
        while (row < mBoard.length && (mBoard[row] & (BIT_MASK << c2)) != 0) {
          ++row;
        }
        if (row < mBoard.length) {
          // Play a coin and continue the search
          mBoard[row] += mover << c2;
          final boolean finished = Connect4Board.isFinished(mBoard, row, col);
          final Connect4Board newBoard = new Connect4Board(Arrays.copyOf(mBoard, mBoard.length), finished);
          if (!newBoard.isLeast()) {
            newBoard.reflect();
          }
          res.add(newBoard);
          mBoard[row] -= mover << c2;
        }
      }
    }
  }

  /**
   * Step the board to all possible next states, storing results.
   * @param store where to store results
   * @param mover either <code>0b01</code> or <code>0b10</code> depending on turn
   */
  public void stepA(final Set<String> store, final int mover) {
    if (!isFinished()) {
      // Try each possible move
      for (int col = 0; col < COLS; ++col) {
        final int c2 = 2 * col;
        // Attempt to play in column col
        int row = 0;
        while (row < mBoard.length && (mBoard[row] & (BIT_MASK << c2)) != 0) {
          ++row;
        }
        if (row < mBoard.length) {
          // Play a coin and continue the search
          mBoard[row] += mover << c2;
          final boolean finished = Connect4Board.isFinished(mBoard, row, col);
          final Connect4Board newBoard = new Connect4Board(mBoard, finished);
          store.add(newBoard.dense());
          mBoard[row] -= mover << c2;
        }
      }
    }
  }

  /**
   * Step the board to all possible next states, storing results.
   * @param store where to store results
   * @param mover either <code>0b01</code> or <code>0b10</code> depending on turn
   */
  public void stepSymA(final Set<String> store, final int mover) {
    if (!isFinished()) {
      // Try each possible move
      for (int col = 0; col < COLS; ++col) {
        final int c2 = 2 * col;
        // Attempt to play in column col
        int row = 0;
        while (row < mBoard.length && (mBoard[row] & (BIT_MASK << c2)) != 0) {
          ++row;
        }
        if (row < mBoard.length) {
          if (col != 3) {
            final int otherCol = COLS - col - 1;
            final int state = (mBoard[row] >> (2 * otherCol)) & BIT_MASK;
            if (state != 0 && state != mover) {
              continue;
            }
          }

          // Play a coin and continue the search
          mBoard[row] += mover << c2;
          final boolean finished = Connect4Board.isFinished(mBoard, row, col);
          final Connect4Board newBoard = new Connect4Board(Arrays.copyOf(mBoard, mBoard.length), finished);
          if (!newBoard.isLeast()) {
            newBoard.reflect();
          }
          store.add(newBoard.dense());
          mBoard[row] -= mover << c2;
        }
      }
    }
  }

  private static final char[] HEX = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

  /**
   * Return a packed string representation of the board.
   * @return dense string
   */
  public String dense() {
    final StringBuilder sb = new StringBuilder();
    for (final short row : mBoard) {
      sb.append(HEX[row >>> 12]);
      sb.append(HEX[(row >>> 8) & 0xF]);
      sb.append(HEX[(row >>> 4) & 0xF]);
      sb.append(HEX[row & 0xF]);
    }
    if (isFinished()) {
      sb.append('!');
    }
    if (isLeast()) {
      sb.append('<');
    }
    return sb.toString();
  }
}
