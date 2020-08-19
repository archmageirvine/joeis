package irvine.math.lattice;

/**
 * The two-dimensional half-Manhattan lattice.
 * @author Sean A. Irvine
 */
class HalfManhattanLattice extends SquareLattice {

  @Override
  public int neighbourCount(final long point) {
    return 3;
  }

  private long d(final long z) {
    return 1 - ((z & 1) << 1);
  }

  @Override
  public long neighbour(final long point, final int neighbourNumber) {
    return point + (neighbourNumber == 0 ? d(y(point)) : (neighbourNumber == 1 ? Y1 : -Y1));
  }
}
