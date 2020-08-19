package irvine.math.lattice;

/**
 * The face-centered cubic (f.c.c.) lattice.
 * @author Sean A. Irvine
 */
class FccLattice extends CubicLattice {

  // Face-centered cubic, f.c.c
  //
  // Coordinate of a point is (x,y,z).
  // Pack (x,y,z) into a single long with 21-bits per entry.  To avoid
  // having to worry about propagation of negatives, bias each coordinate by
  // 2^20.  Hence we can deal with lattice extent of roughly 2^20 in any
  // direction (an amount that will not be exhausted in a brute force
  // counting of paths, etc.)
  private static final long[] DELTAS = {
    Z1 + Y1, Z1 - Y1, -Z1 + Y1, -Z1 - Y1,
    Z1 + 1, Z1 - 1, -Z1 + 1, -Z1 - 1,
    Y1 + 1, Y1 - 1, -Y1 + 1, -Y1 - 1,
  };

  @Override
  public int neighbourCount(final long point) {
    return 12;
  }

  @Override
  public long neighbour(final long point, final int neighbourNumber) {
    return point + DELTAS[neighbourNumber];
  }

  @Override
  public long distanceBound(final long point) {
    long d = 0;
    for (int k = 0; k < dimension(); ++k) {
      d = Math.max(d, Math.abs(ordinate(point, k)));
    }
    return d;
  }
}
