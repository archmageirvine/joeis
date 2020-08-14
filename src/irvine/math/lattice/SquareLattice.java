package irvine.math.lattice;

/**
 * The square (or quadratic) lattice.  Also base class for other two-dimensional
 * lattices.
 * @author Sean A. Irvine
 */
public class SquareLattice extends AbstractLattice {

  protected static final int BITS_PER_COORDINATE = 32;
  private static final long MASK = (1L << BITS_PER_COORDINATE) - 1;
  private static final long BIAS = 1L << (BITS_PER_COORDINATE - 1);
  protected static final long Y1 = 1L << BITS_PER_COORDINATE;
  private static final long ORIGIN = pack(0, 0);
  protected static final long[] DELTA = {1, -1, Y1, -Y1};

  private static long pack(final long x, final long y) {
    return ((BIAS + y) << BITS_PER_COORDINATE) + BIAS + x;
  }

  @Override
  public int neighbourCount(final long point) {
    return 4;
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
}
