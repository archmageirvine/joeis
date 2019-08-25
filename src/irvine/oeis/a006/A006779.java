package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006779.
 * @author Sean A. Irvine
 */
public class A006779 implements Sequence {

  // Cf. A001412.
  // Cubic lattice
  // Coordinate of a point is (x,y,z).
  // Pack (x,y,z) into a single int with 10-bits per entry.  To avoid
  // having to worry about propagation of negatives, bias each coordinate by
  // 2^9.  Hence we can deal with lattice extent of roughly 2^9 in any
  // direction (an amount that will not be exhausted in a brute force
  // counting of paths, etc.)
  // Neighbours change one coordinate by +/- 1.
  private static final int BITS_PER_COORDINATE = 10;
  private static final int Y_SHIFT = 2 * BITS_PER_COORDINATE;
  //private static final int MASK = (1 << BITS_PER_COORDINATE) - 1;
  private static final int BIAS = 1 << (BITS_PER_COORDINATE - 1);
  private static final int ORIGIN = (BIAS << (2 * BITS_PER_COORDINATE))
    | (BIAS << BITS_PER_COORDINATE)
    | BIAS;
  private static final int X1 = 1 << Y_SHIFT;
  private static final int Y1 = 1 << BITS_PER_COORDINATE;
  private static final int[] DELTAS = {1, X1, Y1, -1, -X1, -Y1};

  private int mN = -1;
  private int[] mPath = null;

  private void setPathElement(final int pos, final int value) {
    mPath[pos] = value;
  }

  private boolean contains(final int point, final int n) {
    for (int k = 0; k <= n; ++k) {
      if (mPath[k] == point) {
        return true;
      }
    }
    return false;
  }

  private boolean check(final int point, final int n) {
    return !contains(point, n);
  }

  protected int model(final int theta) {
    return 3;
  }

  private long count(final int point, final int n, final int theta) {
    if (n == mN) {
      return 6;
    }
    mPath[n] = point;
    long count = 0;
    int limit = theta + model(theta);
    if (limit >= DELTAS.length) {
      limit -= DELTAS.length;
    }
    int t = theta;
    do {
      final int newPoint = point + DELTAS[t];
      if (check(newPoint, n)) {
        count += count(newPoint, n + 1, t);
      }
      if (++t == DELTAS.length) {
        t = 0; // mod
      }
    } while (t != limit);
    return count;
  }

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    mPath = new int[mN];
    setPathElement(0, ORIGIN);
    return Z.valueOf(count(ORIGIN + 1, 1, 0));
  }
}
