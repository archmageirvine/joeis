package irvine.math.lattice;

/**
 * The Kagome lattice.
 * @author Sean A. Irvine
 */
public class KagomeLattice extends SquareLattice {

  private static final long[] DELTA_EVEN = {1 + Y1, 1 - Y1, -1 + Y1, -1 - Y1};
  private static final long[] DELTA_A = {2, -2, 1 + Y1, -1 - Y1};
  private static final long[] DELTA_B = {2, -2, 1 - Y1, -1 + Y1};

  @Override
  public long neighbour(final long point, final int neighbourNumber) {
    return point + ((point & 1) == 0
      ? DELTA_EVEN[neighbourNumber]
      : ((point & 2) == ((point >> BITS_PER_COORDINATE) & 2)
      ? DELTA_A[neighbourNumber]
      : DELTA_B[neighbourNumber]));
  }

  @Override
  public long distanceBound(final long point) {
    final long x = Math.abs(x(point));
    final long y = Math.abs(y(point));
    return Math.max(y, x / 2);
  }
}
