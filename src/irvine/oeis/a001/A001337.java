package irvine.oeis.a001;

import irvine.math.z.Z;

/**
 * A001337 Number of n-step polygons on f.c.c. lattice.
 * @author Sean A. Irvine
 */
public class A001337 extends A001336 {

  @Override
  protected Z firstTerm() {
    return Z.ZERO;
  }

  @Override
  protected long count(final int point) {
    if (mN > 1) {
      final int x = x(point) - BIAS;
      final int y = y(point) - BIAS;
      final int z = z(point) - BIAS;
      if (z == 0) {
        if (y == 1 || y == -1) {
          if (x == -1 || x == 1) {
            return 12;
          }
        }
      } else if (y == 0) {
        if (z == -1 || z == 1) {
          if (x == -1 || x == 1) {
            return 12;
          }
        }
      } else if (x == 0) {
        if (z == -1 || z == 1) {
          if (y == -1 || y == 1) {
            return 12;
          }
        }
      }
    }
    return 0;
  }
}
