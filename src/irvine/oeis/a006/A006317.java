package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006317.
 * @author Sean A. Irvine
 */
public class A006317 implements Sequence {

  // This is too slow to get more than a few terms.

  // Solve problem of placing queens of different colours on a chessboard
  // so that no queen attack another of the same colour.

  // Assume 0 represents no queen and 2^n a queen of colour n.  Hence
  // with a byte can support search with up to 8 queens.  There can be
  // a lot of symmetry in these kind of searches, WLOG we will assume
  // here that the count of queens of colour n >= queens of colour n+1.
  // There are rotations and reflections that could perhaps be eliminated
  // to make this faster.

  // We will use a simple exhaustive backtracking search.

  // Directions to move to look at already considered cells
  private static final int[] DELTA_X = {-1, 0, -1, 1};
  private static final int[] DELTA_Y = {0, -1, -1, -1};

  private int mBest = 0;
  private int mN = 0;
  private int mColours = 3;
  private int mLimit;
  private byte[][] mBoard = null;

  /**
   * Called for each discovered arrangement of queens.
   * @param totalQueens the total number of queens placed
   */
  protected void process(final int totalQueens) {
    // Default is to find the largest number of queens that can be placed
    if (totalQueens > mBest) {
      mBest = totalQueens;
      //System.out.println("Best now: " + mBest);
      //System.out.println(Arrays.deepToString(mBoard));
    }
  }

  private boolean canPlace(final int queenColor, final int x, final int y) {
    for (int d = 0; d < DELTA_X.length; ++d) {
      final int dx = DELTA_X[d];
      final int dy = DELTA_Y[d];
      int sx = x + dx;
      int sy = y + dy;
      while (sx >= 0 && sy >= 0 && sx < mN /* && sy < mN*/) {
        if (mBoard[sy][sx] == queenColor) {
          return false;
        }
        if (mBoard[sy][sx] != 0) {
          break; // Another colour queen is block the rest of this line
        }
        sx += dx;
        sy += dy;
      }
    }
    return true;
  }

  private void search(final int totalQueens, final int x, final int y, final int usedQueens) {
    // usedQueens is a bit set that keeps track of the lowest unused queen type, by
    // symmetry considerations we never use a queen number until at least one of
    // every lower queen number has been used
    if (y == mN) {
      process(totalQueens);
    } else if (mLimit - y * mN - x >= mBest - totalQueens) {
      final int nx = x + 1;
      // Consider each possible colour in turn for this position
      for (int queenColor = 1, bit = 1; queenColor <= mColours && bit - 1 <= usedQueens; ++queenColor, bit <<= 1) {
        // It is allowable to place this colour
        if (canPlace(queenColor, x, y)) {
          final int u = usedQueens | bit;
          mBoard[y][x] = (byte) queenColor;
          if (nx == mN) {
            search(totalQueens + 1, 0, y + 1, u);
          } else {
            search(totalQueens + 1, nx, y, u);
          }
          mBoard[y][x] = 0;
        }
      }
      // Consider not placing a queen here
      if (nx == mN) {
        search(totalQueens, 0, y + 1, usedQueens);
      } else {
        search(totalQueens, nx, y, usedQueens);
      }
    }
  }

  @Override
  public Z next() {
    ++mN;
    // Larger board will always support more queens, no need to reset best
    // mBest = 0; // 2 * n * n / 3; // Provable lower bound for queens==3
    mColours = 3;
    mBoard = new byte[mN][mN];
    mLimit = mN * mN;
    search(0, 0, 0, 0);
    return Z.valueOf(mBest);
  }

}

