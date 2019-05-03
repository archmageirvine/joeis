package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001334 Number of <code>n-step self-avoiding</code> walks on hexagonal <code>[ =triangular ]</code> lattice.
 * @author Sean A. Irvine
 */
public class A001334 implements Sequence {

  // Walks on hexagonal/triangular lattice
  // Coordinate of a point is (x,y).
  // The six neighbours of (x,y) are (x+2,y), (x-2,y), (x+1,y+1), (x+1,y-1),
  // (x-1,y+1), (x-1,y-1).
  // To avoid having to worry about propagation of negatives, bias each
  // coordinate by 0x8000.  Hence we can deal with lattice extent of roughly
  // 2^15 in any direction (an amount that will not be exhausted in a brute
  // force counting of paths, etc.)
  protected static final int BITS_PER_COORDINATE = 16;
  protected static final int MASK = (1 << BITS_PER_COORDINATE) - 1;
  private static final int BIAS = 1 << (BITS_PER_COORDINATE - 1);
  protected static final int ORIGIN = c(0, 0);
  protected static final int D1 = (1 << BITS_PER_COORDINATE) + 1;
  static final int[] DELTAS = {2 << BITS_PER_COORDINATE,
    (-2) << BITS_PER_COORDINATE,
    D1,
    (1 << BITS_PER_COORDINATE) - 1,
    ((-1) << BITS_PER_COORDINATE) + 1,
    ((-1) << BITS_PER_COORDINATE) - 1,
  };

  protected static int y(final int point) {
    return point & MASK;
  }

  protected static int x(final int point) {
    return (point >> BITS_PER_COORDINATE) & MASK;
  }

  protected static int c(final int x, final int y) {
    return ((BIAS + x) << BITS_PER_COORDINATE) + BIAS + y;
  }

  protected int mN = -1;
  private int[] mPath = null;

  protected void setPathLength(final int n) {
    mPath = new int[n + 1];
  }

  protected void setPathElement(final int pos, final int value) {
    mPath[pos] = value;
  }

  protected int getPathElement(final int pos) {
    return mPath[pos];
  }

  protected boolean contains(final int point, final int n) {
    for (int k = 0; k <= n; ++k) {
      if (mPath[k] == point) {
        return true;
      }
    }
    return false;
  }

  protected boolean check(final int point, final int n) {
    return !contains(point, n);
  }

  protected long count(final int point) {
    return 6;
  }

  protected long count(final int point, final int n) {
    mPath[n] = point;
    if (n == mN) {
      return count(point);
    }
    long count = 0;
    for (final int delta : DELTAS) {
      final int newPoint = point + delta;
      if (check(newPoint, n)) {
        count += count(newPoint, n + 1);
      }
    }
    return count;
  }

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    setPathLength(mN);
    setPathElement(0, ORIGIN);
    return Z.valueOf(count(ORIGIN + D1, 1));
  }
}
