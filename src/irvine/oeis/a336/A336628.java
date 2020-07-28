package irvine.oeis.a336;

import irvine.math.TwoDimensionalWalk;
import irvine.oeis.a006.A006744;

/**
 * A336627 allocated for Sean A. Irvine.
 * @author Sean A. Irvine
 */
public class A336628 extends A006744 {

  // todo this is not the right sequence number

  @Override
  protected int init() {
    return -5; // We want -1, 3, 7, 11 because our count() handles closing the loop
  }

  @Override
  protected int step() {
    return 4;
  }

  @Override
  protected boolean accept(final TwoDimensionalWalk w, final int x, final int y, final int remaining) {
    // Because we are looking for cycles, fail if we cannot make it back in remaining steps
    return x + y <= remaining && !w.contains(x, y);
  }

  @Override
  protected long count(final TwoDimensionalWalk w) {
    final int x = w.x();
    final int y = w.y();
    if (x == 0 && y + d(x) == 0) {
      return 2;
    }
    if (y == 0 && x + d(x) == 0) {
      return 2;
    }
    return 0;
  }
}
