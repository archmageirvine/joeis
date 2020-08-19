package irvine.math.lattice;

/**
 * The two-dimensional Manhattan lattice.
 * @author Sean A. Irvine
 */
class ManhattanLattice extends SquareLattice {

  @Override
  public int neighbourCount(final long point) {
    return 2;
  }

  private long d(final long z) {
    return 1 - ((z & 1) << 1);
  }

  @Override
  public long neighbour(final long point, final int neighbourNumber) {
    return point + (neighbourNumber == 0 ? d(y(point)) : d(x(point)) << BITS_PER_COORDINATE);
  }
}
