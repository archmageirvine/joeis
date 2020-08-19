package irvine.math.lattice;

/**
 * Diamond lattice. Actually not a true lattice!
 * @author Sean A. Irvine
 */
class DiamondLattice extends Z4Lattice {

  private static final long[] DELTAS = {1, X1, Y1, Z1};

  @Override
  public int neighbourCount(final long point) {
    return 4;
  }

  @Override
  public int dimension() {
    return 4;
  }

  private long sgn(long point) {
    long s = 0;
    for (int k = 0; k < dimension(); ++k) {
      s += (point & MASK) - BIAS;
      point >>>= BITS_PER_COORDINATE;
    }
    return 1 - 2 * s;
  }

  @Override
  public long neighbour(final long point, final int neighbourNumber) {
    return point + sgn(point) * DELTAS[neighbourNumber];
  }
}
