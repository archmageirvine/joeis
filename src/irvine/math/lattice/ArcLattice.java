package irvine.math.lattice;

/**
 * A special two-dimensional lattice used for constructing polyarcs.
 * See A057787.
 * Every point has nine neighbours.
 * @author Sean A. Irvine
 */
class ArcLattice extends CubicLattice {

  // x and y-coordinates are usual for square lattice
  // z-coordinate is 0-3 for inner arcs, 4-7 for outer arcs

  //    5  |  4
  //      1|0
  //    ---+---
  //      2|3
  //    6  |  7

  private static final long[][] DELTAS_BY_Z = {
    {4 * Z1, 4 * Z1 - 1, Z1 - 1, 2 * Z1 - 1, 7 * Z1 - 1, 4 * Z1 - Y1, 5 * Z1 - Y1, 2 * Z1 - Y1, 3 * Z1 - Y1}, // 0
    {4 * Z1, 1 - Z1, 2 * Z1 + 1, Z1 - Y1, 2 * Z1 - Y1, 4 * Z1 + 1, 4 * Z1 - Y1, 5 * Z1 + 1, 3 * Z1 - Y1}, // 1
    {4 * Z1, Y1 - 2 * Z1, Y1 - Z1, 4 * Z1 + Y1, 5 * Z1 + Y1, 1 - 2 * Z1, 3 * Z1 + 1, 4 * Z1 + 1, Z1 + 1}, // 2
    {4 * Z1, Z1 - 1, -1 - 2 * Z1, -1 - Z1, 4 * Z1 - 1, Y1 - 3 * Z1, Y1 - 2 * Z1, Y1 + 3 * Z1, Y1 + 4 * Z1}, // 3
    {-4 * Z1, 1 - 4 * Z1, Z1 + 1, 2 * Z1 + 1, 1 - Z1, Y1 - 4 * Z1, Y1 - 3 * Z1, Y1 + 2 * Z1, Y1 + 3 * Z1}, // 4
    {-4 * Z1, -1 - Z1, -1 - 4 * Z1, -1 - 3 * Z1, 2 * Z1 - 1, Y1 - 5 * Z1, Y1 - 4 * Z1, Y1 + Z1, Y1 + 2 * Z1}, // 5
    {-4 * Z1, -1 - 2 * Z1, -1 - 5 * Z1, -1 - 4 * Z1, Z1 - 1, -Y1 - 2 * Z1, -Y1 - Z1, -Y1 - 4 * Z1, -Y1 - 3 * Z1}, // 6
    {-4 * Z1, 1 - 7 * Z1, 1 - 2 * Z1, 1 - Z1, 1 - 4 * Z1, -Y1 - 3 * Z1, -Y1 - 2 * Z1, -Y1 - 5 * Z1, -Y1 - 4 * Z1}, // 7
  };

  @Override
  public int neighbourCount(final long point) {
    return 9;
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
    return Arc.freeCanonical(animal);
  }
}
