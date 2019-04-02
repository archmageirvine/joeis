package irvine.oeis.a001;

import irvine.math.z.Z;

/**
 * A001413 Number of 2n-step polygons on cubic lattice.
 * @author Sean A. Irvine
 */
public class A001413 extends A001412 {

  @Override
  protected long count(final int point) {
    if (mN > 2) { // Needed to weed out lines
      final int z = z(point) - BIAS;
      final int y = y(point) - BIAS;
      final int x = x(point) - BIAS;
      if (z == 0) {
        if (y == 0) {
          if (x == -1 || x == 1) {
            return 6;
          }
        } else if (x == 0) {
          if (y == -1 || y == 1) {
            return 6;
          }
        }
      } else if (y == 0 && x == 0) {
        if (z == -1 || z == 1) {
          return 6;
        }
      }
    }
    return 0;
  }

  @Override
  public Z next() {
    ++mN;
    return super.next();
  }
}
