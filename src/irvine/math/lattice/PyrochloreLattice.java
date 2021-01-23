package irvine.math.lattice;

/**
 * Pyrochlore lattice. Dual of diamond.
 * @author Sean A. Irvine
 */
class PyrochloreLattice extends Z4Lattice {

  private static final long[][] DELTAS = {
    {Z1, -X1 + Z1, 2 * Z1, -1 + 2 * Z1, 3 * Z1, -Y1 + 3 * Z1},
    {Z1, -1 + X1 + Z1, 2 * Z1, X1 - Y1 + 2 * Z1, -Z1, X1 - Z1},
    {Z1, 1 - Y1 + Z1, - 2 * Z1, 1 - 2 * Z1, -Z1, 1 - X1 - Z1},
    {-3 * Z1, Y1 - 3 * Z1, -2 * Z1, -X1 + Y1 - 2 * Z1, -Z1, -1 + Y1 - Z1},
  };

  @Override
  public int neighbourCount(final long point) {
    return 6;
  }

  @Override
  public int dimension() {
    return 4;
  }

  @Override
  public long neighbour(final long point, final int neighbourNumber) {
    return point + DELTAS[(int) ordinate(point, 3)][neighbourNumber];
  }
}
