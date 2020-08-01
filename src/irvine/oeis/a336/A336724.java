package irvine.oeis.a336;

import irvine.math.TwoDimensionalWalk;
import irvine.math.z.Z;
import irvine.oeis.a001.A001411;

/**
 * A336724.
 * @author Sean A. Irvine
 */
public class A336724 extends A001411 {

  // Half-Manhattan lattice, square lattice with alternate rows
  // running in opposite directions.

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
    final int nx = x + d(y);
    if (accept(w, nx, y, remaining)) {
      sum += count(new TwoDimensionalWalk(nx, y, w), remaining - 1);
    }
    if (accept(w, x, y + 1, remaining)) {
      sum += count(new TwoDimensionalWalk(x, y + 1, w), remaining - 1);
    }
    if (accept(w, x, y - 1, remaining)) {
      sum += count(new TwoDimensionalWalk(x, y - 1, w), remaining - 1);
    }
    return sum;
  }

  @Override
  public Z next() {
    mN += step();
    return mN <= 0 ? Z.ONE : Z.valueOf(count(new TwoDimensionalWalk(1, 0, ORIGIN), mN - 1))
      .add(Z.valueOf(count(new TwoDimensionalWalk(0, 1, ORIGIN), mN - 1)).multiply2());
  }
}
