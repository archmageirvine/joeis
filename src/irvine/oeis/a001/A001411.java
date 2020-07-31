package irvine.oeis.a001;

import irvine.math.TwoDimensionalWalk;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001411 Number of <code>n-step self-avoiding</code> walks on square lattice.
 * @author Sean A. Irvine
 */
public class A001411 implements Sequence {

  protected static final TwoDimensionalWalk ORIGIN = new TwoDimensionalWalk(0, 0, null);
  protected int mN = init();

  protected long count(final TwoDimensionalWalk w) {
    return 4;
  }

  protected int step() {
    return 1;
  }

  protected int init() {
    return -1;
  }

  protected boolean accept(final TwoDimensionalWalk w, final int x, final int y, final int remaining) {
    return !w.contains(x, y);
  }

  protected long count(final TwoDimensionalWalk w, final int remaining) {
    if (remaining == 0) {
      return count(w);
    }
    long sum = 0;
    final int x = w.x();
    final int y = w.y();
    if (accept(w, x + 1, y, remaining)) {
      sum += count(new TwoDimensionalWalk(x + 1, y, w), remaining - 1);
    }
    if (accept(w, x - 1, y, remaining)) {
      sum += count(new TwoDimensionalWalk(x - 1, y, w), remaining - 1);
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
    return mN <= 0 ? Z.ONE : Z.valueOf(count(new TwoDimensionalWalk(1, 0, ORIGIN), mN - 1));
  }
}
