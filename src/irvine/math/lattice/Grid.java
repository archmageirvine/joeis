package irvine.math.lattice;

/**
 * A finite rectangular subset of the plane.
 * @author Sean A. Irvine
 */
class Grid extends SquareLattice {

  private final long mX;
  private final long mY;

  Grid(final long x, final long y) {
    mX = x;
    mY = y;
  }

  @Override
  public int neighbourCount(final long point) {
    final long x = ordinate(point, 0);
    final long y = ordinate(point, 1);
    int n = 4;
    if (x == 0) {
      --n;
    }
    if (x == mX - 1) {
      --n;
    }
    if (y == 0) {
      --n;
    }
    if (y == mY - 1) {
      --n;
    }
    return n;
  }

  @Override
  public long neighbour(final long point, final int neighbourNumber) {
    if (neighbourCount(point) == 4) {
      return super.neighbour(point, neighbourNumber);
    }
    for (int k = 0, j = -1; j < neighbourNumber; ++k) {
      final long pt = super.neighbour(point, k);
      final long x = ordinate(pt, 0);
      if (x >= 0 && x < mX) {
        final long y = ordinate(pt, 1);
        if (y >= 0 && y < mY && ++j == neighbourNumber) {
          return pt;
        }
      }
    }
    throw new RuntimeException();
  }
}
