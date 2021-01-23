package irvine.math.lattice;

/**
 * The <code>Z^5</code> lattice.
 * @author Sean A. Irvine
 */
class Z5Lattice extends AbstractLattice {

  // 5-dimensional lattice
  // Coordinate of a point is (t,u,x,y,z).
  // Pack (t,u,x,y,z) into a single long with 12-bits per entry.  To avoid
  // having to worry about propagation of negatives, bias each coordinate by
  // 2^11.  Hence we can deal with lattice extent of roughly 2^11 in any
  // direction (an amount that will not be exhausted in a brute force
  // counting of paths, etc.)
  // Neighbours change one coordinate by +/- 1.
  protected static final int BITS_PER_COORDINATE = Long.SIZE / 5;
  protected static final int Z_SHIFT = 4 * BITS_PER_COORDINATE;
  protected static final int Y_SHIFT = 3 * BITS_PER_COORDINATE;
  protected static final int X_SHIFT = 2 * BITS_PER_COORDINATE;
  protected static final long MASK = (1L << BITS_PER_COORDINATE) - 1;
  protected static final long BIAS = 1L << (BITS_PER_COORDINATE - 1);
  protected static final long ORIGIN = pack(0, 0, 0, 0, 0);
  protected static final long Z1 = 1L << Z_SHIFT;
  protected static final long Y1 = 1L << Y_SHIFT;
  protected static final long X1 = 1L << X_SHIFT;
  protected static final long U1 = 1L << BITS_PER_COORDINATE;
  private static final long[] DELTAS = {1, -1, U1, -U1, X1, -X1, Y1, -Y1, Z1, -Z1};

  private static long pack(final long t, final long u, final long x, final long y, final long z) {
    return ((BIAS + z) << Z_SHIFT)
      + ((BIAS + y) << Y_SHIFT)
      + ((BIAS + x) << X_SHIFT)
      + ((BIAS + u) << BITS_PER_COORDINATE)
      + BIAS + t;
  }

  @Override
  public int neighbourCount(final long point) {
    return 10;
  }

  @Override
  public int dimension() {
    return 5;
  }

  @Override
  public long origin() {
    return ORIGIN;
  }

  @Override
  public long ordinate(final long point, final int ordinate) {
    assert ordinate >= 0 && ordinate < dimension();
    return (point >> (ordinate * BITS_PER_COORDINATE) & MASK) - BIAS;
  }

  @Override
  public long toPoint(final long... coordinates) {
    return pack(coordinates[0], coordinates[1], coordinates[2], coordinates[3], coordinates[4]);
  }

  @Override
  public long neighbour(final long point, final int neighbourNumber) {
    return point + DELTAS[neighbourNumber];
  }

  @Override
  public long distanceBound(final long point) {
    long d = 0;
    for (int k = 0; k < dimension(); ++k) {
      d += Math.abs(ordinate(point, k));
    }
    return d;
  }
}
