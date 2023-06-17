package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A007180 Expansion of critical exponent for walks on tetrahedral lattice.
 * @author Sean A. Irvine
 */
public class A007180 extends AbstractSequence {

  /* Construct the sequence. */
  public A007180() {
    super(1);
  }

  // Diamond or tetrahedral lattice
  // Using a four-dimensional coordinate system.
  // See http://en.wikipedia.org/wiki/Diamond_cubic

  // Coordinate of a point is (x,y,z,t) such that x+y+z+t = 0 or 1.
  // The neighbours of each point are found by changing any one coordinate by
  // +/- 1.  Hence there are eight neighbours for each point.
  // Pack (x,y,z,t) into a single long with 16-bits per entry.  To avoid
  // having to worry about propagation of negatives, bias each coordinate by
  // 0x8000.  Hence we can deal with lattice extent of roughly 2^15 in any
  // direction (an amount that will not be exhausted in a brute force
  // counting of paths, etc.)
  protected static final int BITS_PER_COORDINATE = 16;
  private static final int Y_SHIFT = 2 * BITS_PER_COORDINATE;
  private static final int X_SHIFT = 3 * BITS_PER_COORDINATE;
  protected static final long MASK = (1L << BITS_PER_COORDINATE) - 1;
  private static final long BIAS = 1L << (BITS_PER_COORDINATE - 1);
  protected static final long ORIGIN = (BIAS << (3 * BITS_PER_COORDINATE))
    | (BIAS << (2 * BITS_PER_COORDINATE))
    | (BIAS << BITS_PER_COORDINATE)
    | BIAS;

  protected static long t(final long point) {
    return point & MASK;
  }

  protected static long z(final long point) {
    return (point >> BITS_PER_COORDINATE) & MASK;
  }

  protected static long y(final long point) {
    return (point >> Y_SHIFT) & MASK;
  }

  protected static long x(final long point) {
    return (point >> X_SHIFT) & MASK;
  }

  protected int mN = 0;
  private long[] mPath = null;

  protected void setPathLength(final int n) {
    mPath = new long[n];
  }

  protected void setPathElement(final int pos, final long value) {
    mPath[pos] = value;
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
    return t(point) <= z(point) && !contains(point, n);
  }

  protected long count(final long point) {
    return 1;
  }

  // sgn alternates between 1 and -1 in accordance to whether the sum of the point is 0 or 1
  protected long count(final long point, final long sgn, final int n) {
    if (n == mN) {
      return count(point);
    }
    mPath[n] = point;
    long count = 0;
    for (long delta = 1; delta != 0; delta <<= BITS_PER_COORDINATE) {
      final long newPoint = point + sgn * delta;
      if (check(newPoint, n)) {
        count += count(newPoint, -sgn, n + 1);
      }
    }
    return count;
  }

  @Override
  public Z next() {
    setPathLength(++mN);
    return Z.valueOf(count(ORIGIN, 1, 0));
  }
}
