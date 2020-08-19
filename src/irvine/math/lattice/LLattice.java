package irvine.math.lattice;

/**
 * The two-dimensional L lattice.
 * @author Sean A. Irvine
 */
class LLattice extends SquareLattice {

  // Each step is perpendicular to the previous step

  @Override
  public int neighbourCount(final long point) {
    return 2;
  }

  @Override
  public long neighbour(final long point, final int neighbourNumber) {
    final long d = (point + (point >> BITS_PER_COORDINATE)) & 1;
    final long e = 1 - (neighbourNumber << 1); // i.e., 0 -> 1, 1 -> -1
    return point + (d == 0 ? e : e * Y1);
  }
}
