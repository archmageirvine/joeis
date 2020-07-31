package irvine.oeis.a322;

import irvine.math.TwoDimensionalWalk;
import irvine.oeis.a001.A001411;

/**
 * A322419 Number of <code>n-step self-avoiding</code> walks on <code>L-lattice</code>.
 * @author Sean A. Irvine
 */
public class A322419 extends A001411 {

  // L lattice, each step perpendicular to previous step.

  @Override
  protected long count(final TwoDimensionalWalk w) {
    return 2;
  }

  @Override
  protected int init() {
    return -1;
  }

  @Override
  protected long count(final TwoDimensionalWalk w, final int remaining) {
    if (remaining == 0) {
      return count(w);
    }
    long sum = 0;
    final int x = w.x();
    final int y = w.y();
    if (((x + y) & 1) == 0) {
      if (accept(w, x + 1, y, remaining)) {
        sum += count(new TwoDimensionalWalk(x + 1, y, w), remaining - 1);
      }
      if (accept(w, x - 1, y, remaining)) {
        sum += count(new TwoDimensionalWalk(x - 1, y, w), remaining - 1);
      }
    } else {
      if (accept(w, x, y + 1, remaining)) {
        sum += count(new TwoDimensionalWalk(x, y + 1, w), remaining - 1);
      }
      if (accept(w, x, y - 1, remaining)) {
        sum += count(new TwoDimensionalWalk(x, y - 1, w), remaining - 1);
      }
    }
    return sum;
  }
}
