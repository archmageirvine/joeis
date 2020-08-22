package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007825 Number of n step self-avoiding walks on 3 X infinity grid starting from (0,1).
 * @author Sean A. Irvine
 */
public class A007825 implements Sequence {

  // Coordinate of a point is (x,y).
  // The six neighbours of (x,y) are (x+1,y), (x-1,y), (x,y+1), (x,y-1).
  // To avoid having to worry about propagation of negatives, bias each
  // coordinate by 0x8000.  Hence we can deal with lattice extent of roughly
  // 2^15 in any direction (an amount that will not be exhausted in a brute
  // force counting of paths, etc.)
  protected static final int BITS_PER_COORDINATE = 16;
  protected static final int MASK = (1 << BITS_PER_COORDINATE) - 1;
  protected static final int BIAS = 1 << (BITS_PER_COORDINATE - 1);
  static final int[] DELTAS = {1 << BITS_PER_COORDINATE,
    (-1) << BITS_PER_COORDINATE,
    1,
    -1,
  };

  protected static int y(final int point) {
    return point & MASK;
  }

  protected static int x(final int point) {
    return (point >> BITS_PER_COORDINATE) & MASK;
  }

  protected static int c(final int x, final int y) {
    return ((x + BIAS) << BITS_PER_COORDINATE) + BIAS + y;
  }

  protected int mN = -step();
  private int[] mPath = null;

  protected void setPathLength(final int n) {
    mPath = new int[n + 1];
  }

  protected void setPathElement(final int pos, final int value) {
    mPath[pos] = value;
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
    final int y = y(point) - BIAS;
    return y >= 0 && y < 3 && !contains(point, n);
  }

  protected long count(final int point) {
    return 2;
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

  protected int step() {
    return 1;
  }

  @Override
  public Z next() {
    mN += step();
    if (mN == 0) {
      return Z.ONE;
    }
    setPathLength(mN);
    setPathElement(0, c(0, 1));
    final long leftRight = count(c(1, 1), 1);
    final long up = count(c(0, 2), 1);
    return Z.valueOf(leftRight).add(up);
  }
}
