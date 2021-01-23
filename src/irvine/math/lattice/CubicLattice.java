package irvine.math.lattice;

/**
 * The cubic lattice.
 * @author Sean A. Irvine
 */
class CubicLattice extends AbstractLattice {

  // 3-dimensional lattice
  // Coordinate of a point is (x,y,z).
  // Pack (x,y,z) into a single long with 21-bits per entry.  To avoid
  // having to worry about propagation of negatives, bias each coordinate by
  // 2^20.  Hence we can deal with lattice extent of roughly 2^20 in any
  // direction (an amount that will not be exhausted in a brute force
  // counting of paths, etc.)
  // Neighbours change one coordinate by +/- 1.
  protected static final int BITS_PER_COORDINATE = Long.SIZE / 3;
  protected static final int Z_SHIFT = 2 * BITS_PER_COORDINATE;
  protected static final long MASK = (1L << BITS_PER_COORDINATE) - 1;
  protected static final long BIAS = 1L << (BITS_PER_COORDINATE - 1);
  protected static final long ORIGIN = pack(0, 0, 0);
  protected static final long Z1 = 1L << Z_SHIFT;
  protected static final long Y1 = 1L << BITS_PER_COORDINATE;
  private static final long[] DELTAS = {1, -1, Y1, -Y1, Z1, -Z1};

  private static long pack(final long x, final long y, final long z) {
    return ((BIAS + z) << Z_SHIFT)
      + ((BIAS + y) << BITS_PER_COORDINATE)
      + BIAS + x;
  }

  @Override
  public int neighbourCount(final long point) {
    return 6;
  }

  @Override
  public int dimension() {
    return 3;
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
    return pack(coordinates[0], coordinates[1], coordinates[2]);
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
