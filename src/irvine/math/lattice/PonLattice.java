package irvine.math.lattice;

/**
 * A special two-dimensional lattice used for constructing polypons.
 * See A057784.
 * There are hexagons divided into six isosceles triangles.
 * Every point has three neighbours.
 * @author Sean A. Irvine
 */
class PonLattice extends CubicLattice {

  // x-coordinate is hexagon coordinate in horizontal direction
  // y-coordinate is hexagon coordinate in axis inclined 60 degrees to horizontal
  // z-coordinate is 0-5 for specific triangle within hexagon

  //     4     5
  //       1 2
  //        0
  //        3

  private static final long[][] DELTAS_BY_Z = {
    // Three inner triangles do not lead to changes of the hexagon
    {Z1, 2 * Z1, 3 * Z1},                  // 0 -> 1, 2, 3
    {-Z1, Z1, 3 * Z1},                     // 1 -> 0, 2, 4
    {-2 * Z1, -Z1, 3 * Z1},                // 2 -> 0, 1, 5
    {-3 * Z1, 2 * Z1 - Y1, 1 - Y1 + Z1},   // 3 -> 0, 5, 4
    {-3 * Z1, Y1 - Z1 - 1, Z1 - 1},        // 4 -> 1, 3, 5
    {-3 * Z1, Y1 - 2 * Z1, 1 - Z1},        // 5 -> 2, 3, 4
  };

  @Override
  public int neighbourCount(final long point) {
    return 3;
  }

  @Override
  public long neighbour(final long point, final int neighbourNumber) {
    return point + DELTAS_BY_Z[(int) ordinate(point, 2)][neighbourNumber];
  }

  @Override
  public long distanceBound(final long point) {
    throw new UnsupportedOperationException();
  }

  @Override
  public Animal freeCanonical(final Animal animal) {
    return Pon.freeCanonical(animal);
  }
}
