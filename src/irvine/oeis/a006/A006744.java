package irvine.oeis.a006;

import irvine.math.TwoDimensionalWalk;
import irvine.oeis.a001.A001411;

/**
 * A006744 Number of <code>n-step self-avoiding</code> walks on a Manhattan lattice.
 * @author Sean A. Irvine
 */
public class A006744 extends A001411 {

  // Manhattan lattice, square lattice with alternate rows (and columns)
  // running in opposite directions.

  protected int mN = init();

  protected int d(final int z) {
    //return (z & 1) == 0 ? 1 : -1;
    return 1 - ((z & 1) << 1);
  }

  @Override
  protected long count(final TwoDimensionalWalk w) {
    return 1;
  }

  @Override
  protected int init() {
    return 0;
  }

  @Override
  protected long count(final TwoDimensionalWalk w, final int remaining) {
    if (remaining == 0) {
      return count(w);
    }
    long sum = 0;
    final int x = w.x();
    final int y = w.y();
    final int nx = x + d(y);
    if (accept(w, nx, y, remaining)) {
      sum += count(new TwoDimensionalWalk(nx, y, w), remaining - 1);
    }
    final int ny = y + d(x);
    if (accept(w, x, ny, remaining)) {
      sum += count(new TwoDimensionalWalk(x, ny, w), remaining - 1);
    }
    return sum;
  }
}
