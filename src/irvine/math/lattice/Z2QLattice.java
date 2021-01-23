package irvine.math.lattice;

/**
 * The square lattice allowing diagonal movement.
 * @author Sean A. Irvine
 */
class Z2QLattice extends SquareLattice {

  private static final long[] DELTAS = {1, -1, Y1, -Y1, 1 + Y1, 1 - Y1, -1 + Y1, -1 - Y1};

  @Override
  public int neighbourCount(final long point) {
    return 8;
  }

  @Override
  public long neighbour(final long point, final int neighbourNumber) {
    return point + DELTAS[neighbourNumber];
  }
}
