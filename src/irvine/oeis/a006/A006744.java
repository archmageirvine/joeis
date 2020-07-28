package irvine.oeis.a006;

import irvine.math.TwoDimensionalWalk;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006744 Number of <code>n-step self-avoiding</code> walks on a Manhattan lattice.
 * @author Sean A. Irvine
 */
public class A006744 implements Sequence {

  // This is not best way known
  // Manhattan lattice, square lattice with alternate rows (and columns)
  // running in opposite directions.

  private static final TwoDimensionalWalk ORIGIN = new TwoDimensionalWalk(0, 0, null);
  protected int mN = init();

  protected int d(final int z) {
    //return (z & 1) == 0 ? 1 : -1;
    return 1 - ((z & 1) << 1);
  }

  protected long count(final TwoDimensionalWalk w) {
    return 1;
  }

  protected int step() {
    return 1;
  }

  protected int init() {
    return 0;
  }

  protected boolean accept(final TwoDimensionalWalk w, final int x, final int y, final int remaining) {
    return !w.contains(x, y);
  }

  private long count(final TwoDimensionalWalk w, final int remaining) {
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

  @Override
  public Z next() {
    mN += step();
    return mN <= 0 ? Z.ONE : Z.valueOf(count(new TwoDimensionalWalk(1, 0, ORIGIN), mN - 1));
  }
}
