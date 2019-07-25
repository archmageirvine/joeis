package irvine.oeis.a249;

import java.util.HashSet;
import java.util.Set;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.math.Cell;

/**
 * A249795 Self-avoiding walks with n steps on the truncated trihexagonal tiling or <code>(4,6,12)</code> lattice.
 * @author Sean A. Irvine
 */
public class A249795 implements Sequence {

  // Truncated trihexagonal tiling walks (kisrhombille dual).

  // Take y-axis as running vertically, and x-axis running at 60 degrees from the vertical to the right
  // Encode each cell with (x,y,k) where k is a letter in A..L the triangles in clockwise order around a
  // vertex of degree 12.
  // The following is then a state transition function from (x,y,k), theta to (x',y',k') where theta
  // is 0, 1, or 2 representing which adjacent triangle to proceed to.

  // @formatter:off
  private static final Cell[][] TRANSITIONS = {
    {new Cell(0, 0, 'L'), new Cell(0, 1, 'F'),  new Cell(0, 0, 'B')}, // A
    {new Cell(0, 0, 'A'), new Cell(1, 0, 'I'),  new Cell(0, 0, 'C')}, // B
    {new Cell(0, 0, 'B'), new Cell(1, 0, 'H'),  new Cell(0, 0, 'D')}, // C
    {new Cell(0, 0, 'C'), new Cell(1, -1, 'K'), new Cell(0, 0, 'E')}, // D
    {new Cell(0, 0, 'D'), new Cell(1, -1, 'J'), new Cell(0, 0, 'F')}, // E
    {new Cell(0, 0, 'E'), new Cell(0, -1, 'A'), new Cell(0, 0, 'G')}, // F
    {new Cell(0, 0, 'F'), new Cell(0, -1, 'L'), new Cell(0, 0, 'H')}, // G
    {new Cell(0, 0, 'G'), new Cell(-1, 0, 'C'), new Cell(0, 0, 'I')}, // H
    {new Cell(0, 0, 'H'), new Cell(-1, 0, 'B'), new Cell(0, 0, 'J')}, // I
    {new Cell(0, 0, 'I'), new Cell(-1, 1, 'E'), new Cell(0, 0, 'K')}, // J
    {new Cell(0, 0, 'J'), new Cell(-1, 1, 'D'), new Cell(0, 0, 'L')}, // K
    {new Cell(0, 0, 'K'), new Cell(0, 1, 'G'),  new Cell(0, 0, 'A')}, // L
  };
  // @formatter:on

  protected Cell transit(final Cell cell, final int theta) {
    assert theta >= 0 && theta < 3;
    assert cell != null && cell.getType() >= 'A' && cell.getType() <= 'L';
    final Cell t = TRANSITIONS[cell.getType() - 'A'][theta];
    return new Cell(cell.getX() + t.getX(), cell.getY() + t.getY(), t.getType());
  }

  private final Set<Cell> mPath = new HashSet<>();
  private long mCount = 0;
  private int mN = -1;

  private void search(final Cell cell, final int cnt) {
    if (mPath.add(cell)) {
      if (cnt == 0) {
        ++mCount;
      } else {
        for (int theta = 0; theta < 3; ++theta) {
          final Cell newCell = transit(cell, theta);
          search(newCell, cnt - 1);
        }
      }
      mPath.remove(cell);
    }
  }

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    mCount = 0;
    search(new Cell(0, 0, 'A'), mN);
    return Z.valueOf(mCount);
  }
}
