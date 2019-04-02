package irvine.oeis.a006;

import java.util.Arrays;

import irvine.math.TwoDimensionalWalk;
import irvine.util.Pair;

/**
 * A006815 Related to self-avoiding walks on square lattice.
 * @author Sean A. Irvine
 */
public class A006815 extends A006814 {

  // Diverges from existing OEIS entry at a(9), not clear which is wrong

  private int[] mPath = new int[0];

  @Override
  protected long linearExtent(final TwoDimensionalWalk w) {
    final int length = preparePath(w);
    if (length > mPath.length) {
      mPath = new int[length];
    }
    // Essentially a shortest path calculation
    Arrays.fill(mPath, 1, mPath.length, Integer.MAX_VALUE);
    assert mPath[0] == 0;
    int z = 0;
    TwoDimensionalWalk u = w;
    while (u != null) {
      final int x = u.x();
      final int y = u.y();
      for (int k = 0; k < DELTA_X.length; ++k) {
        final Pair<Integer, Integer> p = new Pair<>(x + DELTA_X[k], y + DELTA_Y[k]);
        final Integer nz = mWorkspace.get(p);
        if (nz != null && nz > z) {
          mPath[nz] = Math.min(mPath[nz], mPath[z] + 1);
        }
      }
      u = u.getPrevious();
      ++z;
    }
    assert z == length;
    return mPath[z - 1];
  }
}
