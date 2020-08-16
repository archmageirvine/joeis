package irvine.math.lattice;

/**
 * The <code>Z^4</code> lattice.
 * @author Sean A. Irvine
 */
public class Z4Lattice extends AbstractLattice {

  // 4-dimensional lattice
  // Coordinate of a point is (x,y,z,t).
  // Pack (x,y,z,t) into a single long with 16-bits per entry.  To avoid
  // having to worry about propagation of negatives, bias each coordinate by
  // 2^15.  Hence we can deal with lattice extent of roughly 2^15 in any
  // direction (an amount that will not be exhausted in a brute force
  // counting of paths, etc.)
  // Neighbours change one coordinate by +/- 1.
  protected static final int BITS_PER_COORDINATE = 16;
  private static final int Z_SHIFT = 2 * BITS_PER_COORDINATE;
  private static final int Y_SHIFT = 3 * BITS_PER_COORDINATE;
  protected static final long MASK = (1L << BITS_PER_COORDINATE) - 1;
  protected static final long BIAS = 1L << (BITS_PER_COORDINATE - 1);
  protected static final long ORIGIN = pack(0, 0, 0, 0);
  protected static final long X1 = 1L << Z_SHIFT;
  protected static final long Y1 = 1L << Y_SHIFT;
  protected static final long Z1 = 1L << BITS_PER_COORDINATE;
  protected static final long[] DELTAS = {1, -1, X1, -X1, Y1, -Y1, Z1, -Z1};

  private static long pack(final long x, final long y, final long z, final long t) {
    return ((BIAS + z) << Z_SHIFT)
      + ((BIAS + y) << Y_SHIFT)
      + ((BIAS + x) << BITS_PER_COORDINATE)
      + BIAS + t;
  }

  @Override
  public int neighbourCount(final long point) {
    return 8;
  }

  @Override
  public int dimension() {
    return 4;
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
   * Convenience method to convert an <code>(t,x,y,z)</code> pair into a point.
   * @param t <code>t</code>-coordinate
   * @param x <code>x</code>-coordinate
   * @param y <code>y</code>-coordinate
   * @param z <code>z</code>-coordinate
   * @return point
   */
  public long toPoint(final long x, final long y, final long z, final long t) {
    return pack(x, y, z, t);
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
