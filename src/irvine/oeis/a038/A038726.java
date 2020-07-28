package irvine.oeis.a038;

import irvine.oeis.a010.A010576;

/**
 * A038726 Configurations of linear chains in a 5-dimensional hypercubic lattice.
 * @author Sean A. Irvine
 */
public class A038726 extends A010576 {

  @Override
  protected boolean check(final long point, final int n) {
    if (!super.check(point, n)) {
      return false;
    }
    int neighbourCount = -1;
    for (final long delta : DELTAS) {
      final long newPoint = point + delta;
      if (contains(newPoint, n) && ++neighbourCount > 0) {
        return false;
      }
    }
    return true;
  }
}
