package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006777 Number of n-step spirals on hexagonal lattice.
 * @author Sean A. Irvine
 */
public class A006777 implements Sequence {

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
  private int[] mU = null;

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

  private boolean check(final int point, final int n, final int k) {
    return !contains(point, n) && isSingle(k - 1);
  }

  private boolean isSingle(final int k) {
    return k < 4 || mU[k - 4] + mU[k - 3] < mU[k - 1] + mU[k];
  }

  protected int model() {
    return 2;
  }

  private long count(final int point, final int n, final int theta, final int u, final int k) {
    mPath[n] = point;
    if (n == mN) {
      mU[k] = u;
      return isSingle(k) ? 1 : 0;
    }
    long count = 0;
    int limit = theta + model();
    if (limit >= DELTAS.length) {
      limit -= DELTAS.length;
    }
    int t = theta;
    do {
      final int newPoint = point + DELTAS[t];
      if (check(newPoint, n, k)) {
        if (t == theta) {
          count += count(newPoint, n + 1, t, u + 1, k);
        } else {
          mU[k] = u;
          count += count(newPoint, n + 1, t, 1, k + 1);
        }
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
    mU = new int[mPath.length];
    setPathElement(0, ORIGIN);
    return Z.valueOf(count(ORIGIN + DELTAS[0], 1, 0, 1, 1));
  }
}
