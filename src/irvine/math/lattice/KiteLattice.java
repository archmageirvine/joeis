package irvine.math.lattice;

/**
 * A special two-dimensional lattice used for constructing polykites.
 * See A057786.
 * This is the dual of hexagonal lattice with a larger triangular lattice overlaid.
 * Every point has four neighbours.
 * @author Sean A. Irvine
 */
class KiteLattice extends CubicLattice {

  // x-coordinate is hexagon coordinate in horizontal direction
  // y-coordinate is hexagon coordinate in axis inclined 60 degrees to horizontal
  // z-coordinate is 0-5 for specific triangle within hexagon, with 0 at the
  // bottom and number clockwise within the hexagon

  //      3
  //    2   4
  //    1   5
  //      0

  private static final long[][] DELTAS_BY_Z = {
    {Z1, 5 * Z1, 4 * Z1 - Y1, 2 * Z1 - Y1 + 1},     // 0 -> 1, 5, 4, 2
    {Z1, -Z1, 4 * Z1 - 1, 2 * Z1 - Y1},             // 1 -> 2, 0, 5, 3
    {Z1, -Z1, 2 * Z1 - 1, Y1 - 2 * Z1 - 1},         // 2 -> 1, 3, 4, 0
    {Z1, -Z1, 2 * Z1 - 1 + Y1, Y1 - 2 * Z1},        // 3 -> 2, 4, 5, 1
    {Z1, -Z1, Y1 - 4 * Z1, 1 - 2 * Z1},             // 4 -> 3, 5, 0, 2
    {-5 * Z1, -Z1, 1 - 4 * Z1, 1 - Y1 - 2 * Z1},    // 5 -> 0, 4, 1, 3
  };

  @Override
  public int neighbourCount(final long point) {
    return 4;
  }

  @Override
  public long neighbour(final long point, final int neighbourNumber) {
    return point + DELTAS_BY_Z[(int) ordinate(point, 2)][neighbourNumber];
  }

  @Override
  public long distanceBound(final long point) {
    throw new UnsupportedOperationException();
  }
}
