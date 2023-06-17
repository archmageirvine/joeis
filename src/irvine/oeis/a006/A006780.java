package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A006780 Number of n-step spirals on cubic lattice.
 * @author Sean A. Irvine
 */
public class A006780 extends AbstractSequence {

  /** Construct the sequence. */
  public A006780() {
    super(0);
  }

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
  private static final int BIAS = 1 << (BITS_PER_COORDINATE - 1);
  private static final int MASK = (1 << BITS_PER_COORDINATE) - 1;
  private static final int ORIGIN = (BIAS << (2 * BITS_PER_COORDINATE))
    | (BIAS << BITS_PER_COORDINATE)
    | BIAS;
  private static final int X1 = 1 << Y_SHIFT;
  private static final int Y1 = 1 << BITS_PER_COORDINATE;
  private static final int[] DELTAS = {1, X1, Y1, -1, -X1, -Y1};
  private static final int[][] NEXT_STATES = {
    {0, 1},
    {0, 1, 2, 3, 5},
    {0, 1, 2, 3, 4},
    {3, 4},
    {0, 2, 3, 4, 5},
    {0, 1, 3, 4, 5},
  };

  private int mN = -1;
  private int[] mPath = null;

  protected static int z(final int point) {
    return (point & MASK) - BIAS;
  }

  protected static int y(final int point) {
    return ((point >> BITS_PER_COORDINATE) & MASK) - BIAS;
  }

  protected static int x(final int point) {
    return ((point >> Y_SHIFT) & MASK) - BIAS;
  }

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

  protected long count(final int point) {
    return 2;
  }

  private long count(final int point, final int n, final int state) {
    if (n == mN) {
      return count(point);
    }
    mPath[n] = point;
    long count = 0;
    for (final int s : NEXT_STATES[state]) {
      final int newPoint = point + DELTAS[s];
      if (!contains(newPoint, n)) {
        count += count(newPoint, n + 1, s);
      }
    }
    return count;
  }

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    mPath = new int[mN];
    setPathElement(0, ORIGIN);
    return Z.valueOf(count(ORIGIN + 1, 1, 0)).add(Z.valueOf(count(ORIGIN + X1, 1, 1))).add(Z.valueOf(count(ORIGIN + Y1, 1, 2)));
  }
}
