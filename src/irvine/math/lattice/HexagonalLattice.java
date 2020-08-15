package irvine.math.lattice;

/**
 * The hexagonal lattice. Each point has six neighbours.
 * @author Sean A. Irvine
 */
public class HexagonalLattice extends AbstractLattice {

  protected static final int BITS_PER_COORDINATE = 32;
  private static final long MASK = (1L << BITS_PER_COORDINATE) - 1;
  private static final long BIAS = 1L << (BITS_PER_COORDINATE - 1);
  protected static final long Y1 = 1L << BITS_PER_COORDINATE;
  private static final long ORIGIN = pack(0, 0);
  protected static final long[] DELTA = {2, -2, 1 + Y1, 1 - Y1, -1 + Y1, -1 - Y1};

  private static long pack(final long x, final long y) {
    return ((BIAS + y) << BITS_PER_COORDINATE) + BIAS + x;
  }

  @Override
  public int neighbourCount(final long point) {
    return 6;
  }

  @Override
  public int dimension() {
    return 2;
  }

  @Override
  public long origin() {
    return ORIGIN;
  }

  @Override
  public long ordinate(final long point, final int ordinate) {
    assert ordinate >= 0 && ordinate <= 1;
    return (point >> (ordinate * BITS_PER_COORDINATE) & MASK) - BIAS;
  }

  /**
   * Convenience method to return the <code>x</code>-coordinate of a point.
   * @param point the point
   * @return <code>x</code> coordinate
   */
  public long x(final long point) {
    return (point & MASK) - BIAS;
  }

  /**
   * Convenience method to return the <code>y</code>-coordinate of a point.
   * @param point the point
   * @return <code>y</code> coordinate
   */
  public long y(final long point) {
    return ((point >> BITS_PER_COORDINATE) & MASK) - BIAS;
  }

  /**
   * Convenience method to convert an <code>(x,y)</code> pair into a point.
   * @param x <code>x</code>-coordinate
   * @param y <code>y</code>-coordinate
   * @return point
   */
  public long toPoint(final long x, final long y) {
    return pack(x, y);
  }

  @Override
  public long neighbour(final long point, final int neighbourNumber) {
    return point + DELTA[neighbourNumber];
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
