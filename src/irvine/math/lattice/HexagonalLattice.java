package irvine.math.lattice;

/**
 * The hexagonal lattice. Each point has six neighbours.
 * @author Sean A. Irvine
 */
class HexagonalLattice extends SquareLattice {

  private static final long[] DELTAS = {2, -2, 1 + Y1, 1 - Y1, -1 + Y1, -1 - Y1};

  @Override
  public int neighbourCount(final long point) {
    return 6;
  }

  @Override
  public long neighbour(final long point, final int neighbourNumber) {
    return point + DELTAS[neighbourNumber];
  }

  @Override
  public long distanceBound(final long point) {
    final long x = Math.abs(x(point));
    final long y = Math.abs(y(point));
    return Math.max(y, x / 2);
  }
}
