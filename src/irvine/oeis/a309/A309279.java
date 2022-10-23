package irvine.oeis.a309;

import java.util.HashSet;
import java.util.Set;

import irvine.math.Cell;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A309279 Langton's ant on a truncated trihexagonal tiling: number of black cells after n moves of the ant when starting on a dodecagon.
 * @author Sean A. Irvine
 */
public class A309279 extends Sequence0 {

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
    assert cell != null && cell.getType() >= 'A' && cell.getType() <= 'F';
    switch (cell.getType()) {
      case 'A':
        return normal(cell.getX(), cell.getY(), (char) ('B' + theta / 30));
      case 'B':
        switch (theta) {
          case 0:
            return normal(cell.getX(), cell.getY() + 1, 'A');
          case 90:
            return normal(cell.getX(), cell.getY(), 'C');
          case 180:
            return normal(cell.getX(), cell.getY(), 'A');
          case 270:
            return normal(cell.getX(), cell.getY(), 'M');
          default:
            throw new RuntimeException();
        }
      case 'C':
        switch (theta) {
          case 30:
            return normal(cell.getX(), cell.getY() + 1, 'F');
          case 90:
            return normal(cell.getX() + 1, cell.getY(), 'A');
          case 150:
            return normal(cell.getX(), cell.getY(), 'D');
          case 210:
            return normal(cell.getX(), cell.getY(), 'A');
          case 270:
            return normal(cell.getX(), cell.getY(), 'B');
          case 330:
            return normal(cell.getX(), cell.getY() + 1, 'A');
          default:
            throw new RuntimeException();
        }
      case 'D':
        switch (theta) {
          case 60:
            return normal(cell.getX() + 1, cell.getY(), 'A');
          case 150:
            return normal(cell.getX(), cell.getY(), 'E');
          case 240:
            return normal(cell.getX(), cell.getY(), 'A');
          case 330:
            return normal(cell.getX(), cell.getY(), 'C');
          default:
            throw new RuntimeException();
        }
      case 'E':
        switch (theta) {
          case 30:
            return normal(cell.getX() + 1, cell.getY(), 'A');
          case 90:
            return normal(cell.getX() + 1, cell.getY() - 1, 'B');
          case 150:
            return normal(cell.getX() + 1, cell.getY() - 1, 'A');
          case 210:
            return normal(cell.getX(), cell.getY(), 'F');
          case 270:
            return normal(cell.getX(), cell.getY(), 'A');
          case 330:
            return normal(cell.getX(), cell.getY(), 'D');
          default:
            throw new RuntimeException();
        }
      case 'F':
        switch (theta) {
          case 30:
            return normal(cell.getX(), cell.getY(), 'E');
          case 120:
            return normal(cell.getX() + 1, cell.getY() - 1, 'A');
          case 210:
            return normal(cell.getX(), cell.getY(), 'G');
          case 300:
            return normal(cell.getX(), cell.getY(), 'A');
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
        if (mCell.getType() == 'A') {
          mAngle += 330;
        } else if (mCell.getType() == 'C' || mCell.getType() == 'E') {
          mAngle += 300;
        } else {
          mAngle += 270;
        }
      } else {
        // was white
        mBlack.add(mCell);
        if (mCell.getType() == 'A') {
          mAngle += 30;
        } else if (mCell.getType() == 'C' || mCell.getType() == 'E') {
          mAngle += 60;
        } else {
          mAngle += 90;
        }
      }
      mAngle %= 360;
      mCell = transit(mCell, mAngle);
    }
    return Z.valueOf(mBlack.size());
  }
}
