package irvine.oeis.a326;

import java.util.HashSet;
import java.util.Set;

import irvine.math.Cell;
import irvine.math.z.Z;
import irvine.oeis.a309.A309279;

/**
 * A326743 Number of length <code>n self-avoiding</code> walks on the kisrhombille tiling starting at a degree 12 vertex.
 * @author Sean A. Irvine
 */
public class A326743 extends A309279 {

  private static final int[] START_ANGLE = {0, 0, 30, 60, 30, 30};
  private static final int[] STEP_ANGLE = {30, 90, 60, 90, 60, 90};

  protected final Set<Cell> mPath = new HashSet<>();
  protected long mCount = 0;
  protected int mN = -1;

  protected void search(final Cell cell, final int cnt) {
    if (mPath.add(cell)) {
      if (cnt == 0) {
        ++mCount;
      } else {
        for (int theta = START_ANGLE[cell.getType() - 'A']; theta < 360; theta += STEP_ANGLE[cell.getType() - 'A']) {
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
    mPath.add(new Cell(0, 0, 'A'));
    // search(new Cell(0, 0, 'A'), mN);
    // Take advantage of symmetry to make the search faster
    search(new Cell(0, 0, 'B'), mN - 1);
    search(new Cell(0, 0, 'C'), mN - 1);
    return Z.valueOf(mCount).multiply(6);
  }
}
