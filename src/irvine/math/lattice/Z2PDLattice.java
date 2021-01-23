package irvine.math.lattice;

/**
 * The two-dimensional partially directed lattice. Vertical steps can be
 * made in any direction, but horizontal steps only in the positive direction.
 * @author Sean A. Irvine
 */
class Z2PDLattice extends SquareLattice {

  private static final long[] DELTAS = {1, Y1, -Y1};

  @Override
  public int neighbourCount(final long point) {
    return 3;
  }

  @Override
  public long neighbour(final long point, final int neighbourNumber) {
    return point + DELTAS[neighbourNumber];
  }

}
