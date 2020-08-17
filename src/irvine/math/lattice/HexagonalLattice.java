package irvine.math.lattice;

/**
 * The hexagonal lattice. Each point has six neighbours.
 * @author Sean A. Irvine
 */
public class HexagonalLattice extends SquareLattice {

  private static final long[] DELTAS = {2, -2, 1 + Y1, 1 - Y1, -1 + Y1, -1 - Y1};

  @Override
  public int neighbourCount(final long point) {
    return 6;
  }

  @Override
  public long neighbour(final long point, final int neighbourNumber) {
    return point + DELTAS[neighbourNumber];
  }

  /**
   * Test if a pair of points are adjacent.
   * @param u first point
   * @param v second point
   * @return true iff the points are adjacent
   */
  public boolean isAdjacent(final long u, final long v) {
    final long dx = Math.abs(x(u) - x(v));
    final long dy = Math.abs(y(u) - y(v));
    return (dx == 1 && dy == 1) || (dy == 0 && dx == 2);
  }

  @Override
  public long distanceBound(final long point) {
    final long x = Math.abs(x(point));
    final long y = Math.abs(y(point));
    return Math.max(y, x / 2);
  }
}
