package irvine.oeis.a309;

import java.util.HashSet;
import java.util.Set;

import irvine.math.Cell;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A309166 Langton's ant on a truncated hexagonal tiling: number of black cells after n moves of the ant when starting on a dodecagon and looking towards an edge where the dodecagon meets a triangle.
 * @author Sean A. Irvine
 */
public class A309166 extends Sequence0 {

  // Truncated hexagonal tiling

  // Take y-axis as running vertically, and x-axis running at 60 degrees from the vertical to the right
  // Encode each cell with (x,y,k) where k is a letter in A..G with A being the dodecagon and the others
  // the triangles around the dodecagon in a clockwise direction starting with the triangle above and right
  // the dodecagon.
  // Further, normalized states are such that x, then y, are as small as possible.  In fact, only
  // letters A..C occur in normalized states.
  // The following is then a state transition function from (x,y,k), theta to (x',y',k') where theta
  // is the angle in degrees (it will always be a multiple of 30 degrees, but in some cells the
  // restrictions are more severe -- e.g. in a square there are only four possible values).
  // Angles measure clockwise.
  // This is description is rotated 90 degrees from Fr&ouml;lich's pictures.

  private Cell normal(final int x, final int y, final char k) {
    switch (k) {
      case 'A':
      case 'B':
      case 'C':
        return new Cell(x, y, k);
      case 'D':
        return new Cell(x, y - 1, 'B');
      case 'E':
        return new Cell(x - 1, y, 'C');
      case 'F':
        return new Cell(x - 1, y, 'B');
      case 'G':
        return new Cell(x - 1, y + 1, 'C');
      default:
        throw new RuntimeException();
    }
  }

  private Cell transit(final Cell cell, final int theta) {
    assert theta % 30 == 0;
    assert cell != null && cell.getType() >= 'A' && cell.getType() <= 'C';
    switch (cell.getType()) {
      case 'A':
        if (theta % 60 == 0) {
          switch (theta / 60) {
            case 0:
              return new Cell(cell.getX(), cell.getY() + 1, 'A');
            case 1:
              return new Cell(cell.getX() + 1, cell.getY(), 'A');
            case 2:
              return new Cell(cell.getX() + 1, cell.getY() - 1, 'A');
            case 3:
              return new Cell(cell.getX(), cell.getY() - 1, 'A');
            case 4:
              return new Cell(cell.getX() - 1, cell.getY(), 'A');
            case 5:
              return new Cell(cell.getX() - 1, cell.getY() + 1, 'A');
            default:
              throw new RuntimeException();
          }
        } else {
          return normal(cell.getX(), cell.getY(), (char) ('B' + (theta - 30) / 60));
        }
      case 'B':
        switch (theta) {
          case 90:
            return normal(cell.getX() + 1, cell.getY(), 'A');
          case 210:
            return normal(cell.getX(), cell.getY(), 'A');
          case 330:
            return normal(cell.getX(), cell.getY() + 1, 'A');
          default:
            throw new RuntimeException();
        }
      case 'C':
        switch (theta) {
          case 30:
            return normal(cell.getX() + 1, cell.getY(), 'A');
          case 150:
            return normal(cell.getX() + 1, cell.getY() - 1, 'A');
          case 270:
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
   * On a white triangle, turn 60 degrees right, flip the color of the tile, then move forward one unit.
   * On a black triangle, turn 60 degrees left, flip the color of the tile, then move forward one unit.
   */

  private final Set<Cell> mBlack = new HashSet<>();
  private Cell mCell;
  private int mAngle = 90;

  @Override
  public Z next() {
    if (mCell == null) {
      mCell = new Cell(0, 0, 'A');
    } else {
      if (mBlack.remove(mCell)) {
        // was black
        mAngle += mCell.getType() == 'A' ? 330 : 300;
      } else {
        // was white
        mBlack.add(mCell);
        mAngle += mCell.getType() == 'A' ? 30 : 60;
      }
      mAngle %= 360;
      mCell = transit(mCell, mAngle);
    }
    //System.out.println("(" + mState.mX + "," + mState.mY + "," + mState.mK + ") " + mAngle + " " + mBlack.contains(mState));
    return Z.valueOf(mBlack.size());
  }
}
