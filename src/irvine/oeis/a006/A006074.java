package irvine.oeis.a006;

import irvine.oeis.a354.A354380;

/**
 * A006074 Number of polyaboloes (or polytans): number of different shapes that can be formed with n congruent isosceles right triangles, identifying mirror images.
 * @author Sean A. Irvine
 */
public class A006074 extends A354380 {

  @Override
  protected void update(final int x, final int y, final int v) {
    if ((v & S) != 0) {  /* go down */
      final int ynew = y + 1;
      if (vacant(x, ynew)) {
        add(x, ynew, NW);
        add(x, ynew, NE);
      }
    }
    if ((v & E) != 0) {  /* go right */
      final int xnew = x + 1;
      if (vacant(xnew, y)) {
        add(xnew, y, NW);
        add(xnew, y, SW);
      }
    }
    if ((v & W) != 0) {  /* go left */
      final int xnew = x - 1;
      if (vacant(xnew, y)) {
        add(xnew, y, NE);
        add(xnew, y, SE);
      }
    }
    if ((v & N) != 0) {  /* go up */
      final int ynew = y - 1;
      if (vacant(x, ynew)) {
        add(x, ynew, SE);
        add(x, ynew, SW);
      }
    }
  }
}
