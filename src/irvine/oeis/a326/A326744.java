package irvine.oeis.a326;

import irvine.math.Cell;
import irvine.math.z.Z;

/**
 * A326744 Number of length <code>n self-avoiding</code> walks on the kisrhombille tiling starting at a degree 6 vertex.
 * @author Sean A. Irvine
 */
public class A326744 extends A326743 {

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    mCount = 0;
    mPath.add(new Cell(0, 0, 'C'));
    //search(new Cell(0, 0, 'C'), mN);
    // Take advantage of symmetry to make the search faster
    search(new Cell(0, 0, 'A'), mN - 1);
    search(new Cell(0, 0, 'B'), mN - 1);
    return Z.valueOf(mCount).multiply(3);
  }
}
