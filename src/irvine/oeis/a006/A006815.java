package irvine.oeis.a006;

import java.util.Arrays;

import irvine.math.lattice.ParallelWalker;
import irvine.math.lattice.SelfAvoidingWalker;
import irvine.util.Pair;

/**
 * A006815 Related to self-avoiding walks on square lattice.
 * @author Sean A. Irvine
 */
public class A006815 extends A006814 {

  // Diverges from existing OEIS entry at a(9), not clear which is wrong

  @Override
  protected ParallelWalker getParallelWalker() {
    return new ParallelWalker(() -> new SelfAvoidingWalker(mSquareLattice) {
      private int[] mPath = new int[0];
      {
        setAccumulator((walk, weight, axesMask) -> {
          final int length = preparePath(walk);
          if (length > mPath.length) {
            mPath = new int[length];
          }
          // Essentially a shortest path calculation
          Arrays.fill(mPath, 1, mPath.length, Integer.MAX_VALUE);
          assert mPath[0] == 0;
          int z = 0;
          for (int j = walk.length - 1; j >= 0; --j) {
            final int x = (int) mSquareLattice.x(walk[j]);
            final int y = (int) mSquareLattice.y(walk[j]);
            for (int k = 0; k < DELTA_X.length; ++k) {
              final Pair<Integer, Integer> p = new Pair<>(x + DELTA_X[k], y + DELTA_Y[k]);
              final Integer nz = mWorkspace.get(p);
              if (nz != null && nz > z) {
                mPath[nz] = Math.min(mPath[nz], mPath[z] + 1);
              }
            }
            ++z;
          }
          assert z == length;
          increment(mPath[z - 1] * weight);
        });
      }
    }, mSquareLattice, 8);
  }
}
