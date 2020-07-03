package irvine.oeis.a033;

import irvine.math.TwoDimensionalWalk;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A033155 Configurations of linear chains for a square lattice.
 * @author Sean A. Irvine
 */
public class A033155 implements Sequence {

  private static final int[] DELTA_X = {1, -1, 0, 0};
  private static final int[] DELTA_Y = {0, 0, 1, -1};
  private int mN = 0;
  private long mCount = 0;

  protected int numContacts() {
    return 1;
  }

  // recursively generate acceptable walks
  private void count(final TwoDimensionalWalk walk, final int numNearestNeighbourContacts, final int remaining) {
    if (remaining == 0) {
      if (numNearestNeighbourContacts == numContacts()) {
        ++mCount;
      }
      return;
    }
    final int x = walk.x();
    final int y = walk.y();
    for (int d = 0; d < DELTA_X.length; ++d) {
      final int nx = x + DELTA_X[d];
      final int ny = y + DELTA_Y[d];
      if (!walk.contains(nx, ny)) {
        // For this new point, how many other adjacent points are already in the walk?
        int nnc = numNearestNeighbourContacts - 1; // -1 for where we are coming from
        for (int e = 0; e < DELTA_X.length; ++e) {
          if (walk.contains(nx + DELTA_X[e], ny + DELTA_Y[e])) {
            ++nnc;
          }
        }
        if (nnc <= numContacts()) {
          count(new TwoDimensionalWalk(nx, ny, walk), nnc, remaining - 1);
        }
      }
    }
  }

  @Override
  public Z next() {
    mCount = 0;
    count(new TwoDimensionalWalk(1, 0, new TwoDimensionalWalk(0, 0, null)), 0, ++mN - 1);
    return Z.valueOf(mCount).multiply(4);
  }
}
