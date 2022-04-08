package irvine.math.lattice;

/**
 * The directed hexagonal lattice. Each point has two neighbours.
 * Only steps in increasing x and non-decreasing y are allowed.
 * @author Sean A. Irvine
 */
class DirectedHexagonalLattice extends HexagonalLattice {

  private static final long[] DELTAS = {2, 1 + Y1};

  @Override
  public int neighbourCount(final long point) {
    return 2;
  }

  @Override
  public long neighbour(final long point, final int neighbourNumber) {
    return point + DELTAS[neighbourNumber];
  }

  @Override
  public long distanceBound(final long point) {
    throw new UnsupportedOperationException();
  }
}
