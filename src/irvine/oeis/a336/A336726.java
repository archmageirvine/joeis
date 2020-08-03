package irvine.oeis.a336;

import irvine.math.TwoDimensionalWalk;

/**
 * A336726 allocated for Sean A. Irvine.
 * @author Sean A. Irvine
 */
public class A336726 extends A336724 {

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
