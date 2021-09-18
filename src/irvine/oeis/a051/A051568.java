package irvine.oeis.a051;

import irvine.math.z.Z;
import irvine.oeis.a019.A019654;

/**
 * A051568 Let M(n) (A051755) be the maximal number of queens that can be placed on an n X n chessboard so that each queen attacks exactly two other queens; a(n) is the number of non-equivalent solutions. "Non-equivalent" means none of the a(n) solutions can be mapped onto any other solution by board rotations through 90, 180 or 270 degrees or mirror operations along the two diagonals or center lines.
 * @author Sean A. Irvine
 */
public class A051568 extends A019654 {

  private int mN = 2;

  @Override
  public Z next() {
    return Z.valueOf(solve(++mN, 2));
  }
}
