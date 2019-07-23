package irvine.oeis.a309;

import java.util.HashSet;
import java.util.Set;

import irvine.math.IntegerUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A309279 allocated for Felix Fr&#246;hlich.
 * @author Sean A. Irvine
 */
public class A309279 implements Sequence {

  // Truncated trihexagonal tiling

  // Take y-axis as running vertically, and x-axis running at 60 degrees from the vertical to the right
  // Encode each cell with (x,y,k) where k is a letter in A..M with A being the dodecagon and the others
  // the cells around the dodecagon in a clockwise direction starting with the square immediately above
  // the dodecagon.
  // Further, normalized states are such that x, then y, are as small as possible.  In fact, only
  // letters A..F occur in normalized states.
  // The following is then a state transition function from (x,y,k), theta to (x',y',k') where theta
  // is the angle in degrees (it will always be a multiple of 30 degrees, but in some cells the
  // restrictions are more severe -- e.g. in a square there are only four possible values).
  // Angles measure clockwise.

  /**
   * A cell in the truncated trihexagonal tiling.
   */
  public static final class Cell {
    int mX;
    int mY;
    char mK;

    /**
     * Construct a new cell.
     * @param x x-coordinate
     * @param y y-coordinate
     * @param k cell type
     */
    public Cell(final int x, final int y, final char k) {
      mX = x;
      mY = y;
      mK = k;
    }

    /**
     * Get the type of the cell.
     * @return the cell type
     */
    public char getType() {
      return mK;
    }

    @Override
    public boolean equals(final Object obj) {
      if (!(obj instanceof Cell)) {
        return false;
      }
      final Cell that = (Cell) obj;
      return that.mX == mX && that.mY == mY && that.mK == mK;
    }

    @Override
    public int hashCode() {
      return IntegerUtils.hash(mX, mY) * mK;
    }
  }

  private Cell normal(final int x, final int y, final char k) {
    switch (k) {
      case 'A':
      case 'B':
      case 'C':
      case 'D':
      case 'E':
      case 'F':
        return new Cell(x, y, k);
      case 'G':
        return new Cell(x, y - 1, 'C');
      case 'H':
        return new Cell(x, y - 1, 'B');
      case 'I':
        return new Cell(x - 1, y, 'E');
      case 'J':
        return new Cell(x - 1, y, 'D');
      case 'K':
        return new Cell(x - 1, y, 'C');
      case 'L':
        return new Cell(x - 1, y + 1, 'F');
      case 'M':
        return new Cell(x - 1, y + 1, 'E');
      default:
        throw new RuntimeException();
    }
  }

  protected Cell transit(final Cell cell, final int theta) {
    assert theta % 30 == 0;
    assert cell != null && cell.mK >= 'A' && cell.mK <= 'F';
    switch (cell.mK) {
      case 'A':
        return normal(cell.mX, cell.mY, (char) ('B' + theta / 30));
      case 'B':
        switch (theta) {
          case 0:
            return normal(cell.mX, cell.mY + 1, 'A');
          case 90:
            return normal(cell.mX, cell.mY, 'C');
          case 180:
            return normal(cell.mX, cell.mY, 'A');
          case 270:
            return normal(cell.mX, cell.mY, 'M');
          default:
            throw new RuntimeException();
        }
      case 'C':
        switch (theta) {
          case 30:
            return normal(cell.mX, cell.mY + 1, 'F');
          case 90:
            return normal(cell.mX + 1, cell.mY, 'A');
          case 150:
            return normal(cell.mX, cell.mY, 'D');
          case 210:
            return normal(cell.mX, cell.mY, 'A');
          case 270:
            return normal(cell.mX, cell.mY, 'B');
          case 330:
            return normal(cell.mX, cell.mY + 1, 'A');
          default:
            throw new RuntimeException();
        }
      case 'D':
        switch (theta) {
          case 60:
            return normal(cell.mX + 1, cell.mY, 'A');
          case 150:
            return normal(cell.mX, cell.mY, 'E');
          case 240:
            return normal(cell.mX, cell.mY, 'A');
          case 330:
            return normal(cell.mX, cell.mY, 'C');
          default:
            throw new RuntimeException();
        }
      case 'E':
        switch (theta) {
          case 30:
            return normal(cell.mX + 1, cell.mY, 'A');
          case 90:
            return normal(cell.mX + 1, cell.mY - 1, 'B');
          case 150:
            return normal(cell.mX + 1, cell.mY - 1, 'A');
          case 210:
            return normal(cell.mX, cell.mY, 'F');
          case 270:
            return normal(cell.mX, cell.mY, 'A');
          case 330:
            return normal(cell.mX, cell.mY, 'D');
          default:
            throw new RuntimeException();
        }
      case 'F':
        switch (theta) {
          case 30:
            return normal(cell.mX, cell.mY, 'E');
          case 120:
            return normal(cell.mX + 1, cell.mY - 1, 'A');
          case 210:
            return normal(cell.mX, cell.mY, 'G');
          case 300:
            return normal(cell.mX, cell.mY, 'A');
          default:
            throw new RuntimeException();
        }
      default:
        throw new RuntimeException();
    }
  }

  /*
   * On a white dodecagon, turn 30 degrees right, flip the color of the tile, then move forward one unit.
   * On a black dodecagon, turn 30 degrees left, flip the color of the tile, then move forward one unit.
   * On a white hexagon, turn 60 degrees right, flip the color of the tile, then move forward one unit.
   * On a black hexagon, turn 60 degrees left, flip the color of the tile, then move forward one unit.
   * On a white square, turn 90 degrees right, flip the color of the tile, then move forward one unit.
   * On a black square, turn 90 degrees left, flip the color of the tile, then move forward one unit.
   */

  private final Set<Cell> mBlack = new HashSet<>();
  private Cell mCell;
  private int mAngle = 0;

  @Override
  public Z next() {
    if (mCell == null) {
      mCell = new Cell(0, 0, 'A');
    } else {
      if (mBlack.remove(mCell)) {
        // was black
        if (mCell.mK == 'A') {
          mAngle += 330;
        } else if (mCell.mK == 'C' || mCell.mK == 'E') {
          mAngle += 300;
        } else {
          mAngle += 270;
        }
      } else {
        // was white
        mBlack.add(mCell);
        if (mCell.mK == 'A') {
          mAngle += 30;
        } else if (mCell.mK == 'C' || mCell.mK == 'E') {
          mAngle += 60;
        } else {
          mAngle += 90;
        }
      }
      mAngle %= 360;
      mCell = transit(mCell, mAngle);
    }
    //System.out.println("(" + mState.mX + "," + mState.mY + "," + mState.mK + ") " + mAngle + " " + mBlack.contains(mState));
    return Z.valueOf(mBlack.size());
  }
}
