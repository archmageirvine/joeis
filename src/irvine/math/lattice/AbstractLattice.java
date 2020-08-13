package irvine.math.lattice;

/**
 * Common functionality for lattices.
 * @author Sean A. Irvine
 */
public abstract class AbstractLattice implements Lattice {

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
}
