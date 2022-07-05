package irvine.math.lattice;

/**
 * Common functionality for lattices.
 * @author Sean A. Irvine
 */
public abstract class AbstractLattice implements Lattice {

  @Override
  public int bitsPerCoordinate() {
    return Long.SIZE / dimension();
  }

  @Override
  public long norm(final long point) {
    long norm = 0;
    for (int k = 0; k < dimension(); ++k) {
      final long v = ordinate(point, k);
      norm += v * v;
    }
    return norm;
  }

  @Override
  public String toString(final long point) {
    final StringBuilder sb = new StringBuilder("(");
    for (int k = 0; k < dimension(); ++k) {
      if (k != 0) {
        sb.append(',');
      }
      sb.append(ordinate(point, k));
    }
    sb.append(')');
    return sb.toString();
  }

  @Override
  public long[] neighbours(final long point) {
    final long[] neighbours = new long[neighbourCount(point)];
    for (int k = 0; k < neighbours.length; ++k) {
      neighbours[k] = neighbour(point, k);
    }
    return neighbours;
  }

  @Override
  public boolean isAdjacent(final long u, final long v) {
    for (int k = 0; k < neighbourCount(u); ++k) {
      if (neighbour(u, k) == v) {
        return true;
      }
    }
    return false;
  }

  @Override
  public boolean isAdjacentToOrigin(final long point) {
    return isAdjacent(point, origin());
  }

  @Override
  public Animal freeCanonical(final Animal animal) {
    throw new UnsupportedOperationException();
  }
}
