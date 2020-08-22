package irvine.oeis.a326;

import irvine.math.Cell;
import irvine.math.z.Z;

/**
 * A326745 Number of length n self-avoiding walks on the kisrhombille tiling starting at a degree 4 vertex.
 * @author Sean A. Irvine
 */
public class A326745 extends A326743 {

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    mCount = 0;
    mPath.add(new Cell(0, 0, 'B'));
    //search(new Cell(0, 0, 'B'), mN);
    // Take advantage of symmetry to make the search faster
    search(new Cell(0, 0, 'A'), mN - 1);
    search(new Cell(0, 0, 'C'), mN - 1);
    return Z.valueOf(mCount).multiply2();
  }
}
