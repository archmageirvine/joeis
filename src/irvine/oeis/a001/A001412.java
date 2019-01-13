package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001412.
 * @author Sean A. Irvine
 */
public class A001412 implements Sequence {

  // Cubic lattice
  // Coordinate of a point is (x,y,z).
  // Pack (x,y,z) into a single int with 10-bits per entry.  To avoid
  // having to worry about propagation of negatives, bias each coordinate by
  // 2^9.  Hence we can deal with lattice extent of roughly 2^9 in any
  // direction (an amount that will not be exhausted in a brute force
  // counting of paths, etc.)
  // Neighbours change one coordinate by +/- 1.
  protected static final int BITS_PER_COORDINATE = 10;
  private static final int Y_SHIFT = 2 * BITS_PER_COORDINATE;
  protected static final int MASK = (1 << BITS_PER_COORDINATE) - 1;
  protected static final int BIAS = 1 << (BITS_PER_COORDINATE - 1);
  protected static final int ORIGIN = (BIAS << (2 * BITS_PER_COORDINATE))
    | (BIAS << BITS_PER_COORDINATE)
    | BIAS;
  protected static final int X1 = 1 << Y_SHIFT;
  protected static final int Y1 = 1 << BITS_PER_COORDINATE;
  private static final int[] DELTAS = {X1, -X1, Y1, -Y1, 1, -1};

  protected static int z(final int point) {
    return point & MASK;
  }

  protected static int y(final int point) {
    return (point >> BITS_PER_COORDINATE) & MASK;
  }

  protected static int x(final int point) {
    return (point >> Y_SHIFT) & MASK;
  }

  protected int mN = -1;
  private int[] mPath = null;

  protected void setPathLength(final int n) {
    mPath = new int[n];
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
    if (n == mN) {
      return count(point);
    }
    mPath[n] = point;
    long count = 0;
    for (final int delta : DELTAS) {
      final int newPoint = point + delta;
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
