package irvine.math.lattice;

/**
 * Londsdaleite.
 * @author Sean A. Irvine
 */
class Lonsdaleite extends CubicLattice {

  @Override
  public int neighbourCount(final long point) {
    return 4;
  }

  @Override
  public long neighbour(final long point, final int neighbourNumber) {
    switch (neighbourNumber) {
      case 0:
        return point + 1;
      case 1:
        return point - 1;
      case 2:
        final long x2 = ordinate(point, 0);
        final long y2 = ordinate(point, 1);
        return point + ((2 * ((x2 + y2) & 1) - 1) << BITS_PER_COORDINATE);
      default:
        final long x3 = ordinate(point, 0);
        final long y3 = ordinate(point, 1);
        final long z3 = ordinate(point, 2);
        return point + ((2 * ((x3 + y3 + z3) & 1) - 1) << Z_SHIFT);
    }
  }

  @Override
  public long distanceBound(final long point) {
    final long x = Math.abs(ordinate(point, 0));
    final long y = Math.abs(ordinate(point, 1));
    final long z = Math.abs(ordinate(point, 2));
    return Math.max(Math.max(x, y / 2), z / 2);
  }
}
