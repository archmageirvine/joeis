package irvine.oeis.a173;

import irvine.math.TwoDimensionalWalk;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A173380 Number of n-step walks on square lattice (no points repeated, no adjacent points unless consecutive in path).
 * @author Sean A. Irvine
 */
public class A173380 implements Sequence {

  private static final int[] DELTA_X = {1, -1, 0, 0};
  private static final int[] DELTA_Y = {0, 0, 1, -1};
  private int mN = -1;
  private long mCount = 0;

  private boolean isOk(final TwoDimensionalWalk walk, final int nx, final int ny) {
    int nnc = - 1; // -1 for where we are coming from
    for (int e = 0; e < DELTA_X.length; ++e) {
      if (walk.contains(nx + DELTA_X[e], ny + DELTA_Y[e]) && ++nnc > 0) {
        return false;
      }
    }
    return true;
  }

  // recursively generate acceptable walks
  private void count(final TwoDimensionalWalk walk, final int remaining) {
    if (remaining == 0) {
      ++mCount;
      return;
    }
    final int x = walk.x();
    final int y = walk.y();
    for (int d = 0; d < DELTA_X.length; ++d) {
      final int nx = x + DELTA_X[d];
      final int ny = y + DELTA_Y[d];
      if (!walk.contains(nx, ny) && isOk(walk, nx, ny)) {
        count(new TwoDimensionalWalk(nx, ny, walk), remaining - 1);
      }
    }
  }

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    mCount = 0;
    count(new TwoDimensionalWalk(1, 0, new TwoDimensionalWalk(0, 0, null)), mN - 1);
    return Z.valueOf(mCount).multiply(4);
  }
}
