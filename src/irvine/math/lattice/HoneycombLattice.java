package irvine.math.lattice;

/**
 * The honeycomb lattice.
 * @author Sean A. Irvine
 */
class HoneycombLattice extends SquareLattice {

  @Override
  public int neighbourCount(final long point) {
    return 3;
  }

  @Override
  public long neighbour(final long point, final int neighbourNumber) {
    switch (neighbourNumber) {
      case 0:
        return point + 1;
      case 1:
        return point - 1;
      default:
        final long x = x(point);
        final long y = y(point);
        return point + ((2 * ((x + y) & 1) - 1) << BITS_PER_COORDINATE);
    }
  }

  @Override
  public long distanceBound(final long point) {
    final long x = Math.abs(x(point));
    final long y = Math.abs(y(point));
    return Math.max(x, y / 2);
  }
}
