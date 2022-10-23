package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A006776 Number of n-step spirals on hexagonal lattice.
 * @author Sean A. Irvine
 */
public class A006776 extends Sequence1 {

  // Walks on hexagonal/triangular lattice
  // Coordinate of a point is (x,y).
  // The six neighbours of (x,y) in order are (x+2,y), (x+1,y+1), (x-1,y+1),
  // (x-2,y), (x-1,y-1), (x+1,y-1).
  // To avoid having to worry about propagation of negatives, bias each
  // coordinate by 0x8000.  Hence, we can deal with lattice extent of roughly
  // 2^15 in any direction (an amount that will not be exhausted in a brute
  // force counting of paths, etc.)
  // Cf. A001334
  private static final int BITS_PER_COORDINATE = 16;
  private static final int BIAS = 1 << (BITS_PER_COORDINATE - 1);
  private static final int ORIGIN = c(0, 0);
  private static final int[] DELTAS = {2 << BITS_PER_COORDINATE,
    (1 << BITS_PER_COORDINATE) + 1,
    ((-1) << BITS_PER_COORDINATE) + 1,
    (-2) << BITS_PER_COORDINATE,
    ((-1) << BITS_PER_COORDINATE) - 1,
    (1 << BITS_PER_COORDINATE) - 1,
  };

  private static int c(final int x, final int y) {
    return ((BIAS + x) << BITS_PER_COORDINATE) + BIAS + y;
  }

  protected int mN = 0;
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

  protected int model() {
    return 3;
  }

  private long count(final int point, final int n, final int theta) {
    mPath[n] = point;
    if (n == mN) {
      return 1;
    }
    long count = 0;
    int limit = theta + model();
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
    mPath = new int[++mN + 1];
    setPathElement(0, ORIGIN);
    return Z.valueOf(count(ORIGIN + DELTAS[0], 1, 0));
  }
}
