package irvine.oeis.a336;

import irvine.math.TwoDimensionalWalk;
import irvine.oeis.a117.A117633;

/**
 * A336662 Number of <code>n-step self-avoiding</code> walks on the Manhattan lattice with no non-contiguous adjacencies.
 * @author Sean A. Irvine
 */
public class A336662 extends A117633 {

  @Override
  protected boolean accept(final TwoDimensionalWalk w, final int x, final int y, final int remaining) {
    if (w.contains(x, y)) {
      return false;
    }
    int neighbourCount = - 1; // -1 for where we are coming from
    if (w.contains(x + 1, y) && ++neighbourCount > 0) {
      return false;
    }
    if (w.contains(x - 1, y) && ++neighbourCount > 0) {
      return false;
    }
    if (w.contains(x, y + 1) && ++neighbourCount > 0) {
      return false;
    }
    if (w.contains(x, y - 1) && ++neighbourCount > 0) {
      return false;
    }
    return true;
  }
}
