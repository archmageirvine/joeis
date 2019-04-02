package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A010576 Number of n-step self-avoiding walks on 5-d cubic lattice.
 * @author Sean A. Irvine
 */
public class A010576 implements Sequence {

  // 5-dimensional cubic lattice
  // Coordinate of a point is (x,y,z,t,u).
  // Pack (x,y,z,t,u) into a single int with 12-bits per entry.  To avoid
  // having to worry about propagation of negatives, bias each coordinate by
  // 2^11.  Hence we can deal with lattice extent of roughly 2^11 in any
  // direction (an amount that will not be exhausted in a brute force
  // counting of paths, etc.)
  // Neighbours change one coordinate by +/- 1.
  protected static final int BITS_PER_COORDINATE = 12;
  private static final int T_SHIFT = 2 * BITS_PER_COORDINATE;
  private static final int Z_SHIFT = 3 * BITS_PER_COORDINATE;
  private static final int Y_SHIFT = 4 * BITS_PER_COORDINATE;
  protected static final long MASK = (1 << BITS_PER_COORDINATE) - 1;
  protected static final long BIAS = 1 << (BITS_PER_COORDINATE - 1);
  protected static final long ORIGIN = (BIAS << T_SHIFT)
    | (BIAS << Y_SHIFT)
    | (BIAS << Z_SHIFT)
    | (BIAS << BITS_PER_COORDINATE)
    | BIAS;
  protected static final long X1 = 1L << Y_SHIFT;
  protected static final long Y1 = 1L << Z_SHIFT;
  protected static final long Z1 = 1L << T_SHIFT;
  protected static final long T1 = 1L << BITS_PER_COORDINATE;
  private static final long[] DELTAS = {X1, -X1, Y1, -Y1, Z1, -Z1, T1, -T1, 1, -1};

  protected static long u(final long point) {
    return point & MASK;
  }

  protected static long t(final long point) {
    return (point >>> BITS_PER_COORDINATE) & MASK;
  }

  protected static long z(final long point) {
    return (point >>> T_SHIFT) & MASK;
  }

  protected static long y(final long point) {
    return (point >>> Z_SHIFT) & MASK;
  }

  protected static long x(final long point) {
    return (point >>> Y_SHIFT) & MASK;
  }

  protected int mN = -1;
  private long[] mPath = null;

  protected void setPathLength(final int n) {
    mPath = new long[n];
  }

  protected void setPathElement(final int pos, final long value) {
    mPath[pos] = value;
  }

  protected long getPathElement(final int pos) {
    return mPath[pos];
  }

  protected boolean contains(final long point, final int n) {
    for (int k = 0; k <= n; ++k) {
      if (mPath[k] == point) {
        return true;
      }
    }
    return false;
  }

  protected boolean check(final long point, final int n) {
    return !contains(point, n);
  }

  protected long count(final long point) {
    return 10;
  }

  protected long count(final long point, final int n) {
    if (n == mN) {
      return count(point);
    }
    mPath[n] = point;
    long count = 0;
    for (final long delta : DELTAS) {
      final long newPoint = point + delta;
      if (check(newPoint, n)) {
        count += count(newPoint, n + 1);
      }
    }
    return count;
  }

  protected Z firstTerm() {
    return Z.ONE;
  }

  @Override
  public Z next() {
    if (++mN == 0) {
      return firstTerm();
    }
    setPathLength(mN);
    setPathElement(0, ORIGIN);
    return Z.valueOf(count(ORIGIN + 1, 1));
  }
}
