package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A010577 Number of n-step self-avoiding walks on 6-d cubic lattice.
 * @author Sean A. Irvine
 */
public class A010577 implements Sequence {

  // 6-dimensional cubic lattice
  // Coordinate of a point is (x,y,z,t,u,v).
  // Pack (x,y,z,t,u,v) into a single int with 10-bits per entry.  To avoid
  // having to worry about propagation of negatives, bias each coordinate by
  // 2^9.  Hence we can deal with lattice extent of roughly 2^9 in any
  // direction (an amount that will not be exhausted in a brute force
  // counting of paths, etc.)
  // Neighbours change one coordinate by +/- 1.
  protected static final int BITS_PER_COORDINATE = 10;
  private static final int U_SHIFT = 2 * BITS_PER_COORDINATE;
  private static final int T_SHIFT = 3 * BITS_PER_COORDINATE;
  private static final int Z_SHIFT = 4 * BITS_PER_COORDINATE;
  private static final int Y_SHIFT = 5 * BITS_PER_COORDINATE;
  protected static final long MASK = (1 << BITS_PER_COORDINATE) - 1;
  protected static final long BIAS = 1 << (BITS_PER_COORDINATE - 1);
  protected static final long ORIGIN = (BIAS << U_SHIFT)
    | (BIAS << T_SHIFT)
    | (BIAS << Y_SHIFT)
    | (BIAS << Z_SHIFT)
    | (BIAS << BITS_PER_COORDINATE)
    | BIAS;
  protected static final long X1 = 1L << Y_SHIFT;
  protected static final long Y1 = 1L << Z_SHIFT;
  protected static final long Z1 = 1L << T_SHIFT;
  protected static final long T1 = 1L << U_SHIFT;
  protected static final long U1 = 1L << BITS_PER_COORDINATE;
  private static final long[] DELTAS = {X1, -X1, Y1, -Y1, Z1, -Z1, T1, -T1, U1, -U1, 1, -1};

  protected static long v(final long point) {
    return point & MASK;
  }

  protected static long u(final long point) {
    return (point >>> BITS_PER_COORDINATE) & MASK;
  }

  protected static long t(final long point) {
    return (point >>> U_SHIFT) & MASK;
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
    return 12;
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
