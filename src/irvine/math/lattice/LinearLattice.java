package irvine.math.lattice;

/**
 * The line.
 * @author Sean A. Irvine
 */
class LinearLattice extends AbstractLattice {

  private static final long BIAS = 1L << 63;
  private static final long ORIGIN = pack(0);
  private static final long[] DELTAS = {1, -1};

  private static long pack(final long x) {
    return BIAS + x;
  }

  @Override
  public int neighbourCount(final long point) {
    return 2;
  }

  @Override
  public int dimension() {
    return 1;
  }

  @Override
  public long origin() {
    return ORIGIN;
  }

  @Override
  public long ordinate(final long point, final int ordinate) {
    assert ordinate == 0;
    return point;
  }

  /**
   * Convenience method to return the <code>x</code>-coordinate of a point.
   * @param point the point
   * @return <code>x</code> coordinate
   */
  long x(final long point) {
    return point - BIAS;
  }

  @Override
  public long toPoint(final long... coordinates) {
    assert coordinates.length == 1;
    return pack(coordinates[0]);
  }

  @Override
  public long neighbour(final long point, final int neighbourNumber) {
    return point + DELTAS[neighbourNumber];
  }

  @Override
  public long distanceBound(final long point) {
    return Math.abs(x(point));
  }
}
