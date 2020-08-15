package irvine.oeis.a006;

import irvine.math.lattice.ParallelWalker;
import irvine.math.lattice.SelfAvoidingWalker;
import irvine.util.Pair;

/**
 * A006816 Related to self-avoiding walks on square lattice.
 * @author Sean A. Irvine
 */
public class A006816 extends A006814 {

  @Override
  protected ParallelWalker getParallelWalker() {
    return new ParallelWalker(mSquareLattice, 8, () -> new SelfAvoidingWalker(mSquareLattice) {
      {
        setAccumulator((walk, weight, axesMask) -> {
          preparePath(walk);
          long bonds = 0;
          for (int j = walk.length - 1; j >= 0; --j) {
            final int x = (int) mSquareLattice.x(walk[j]);
            final int y = (int) mSquareLattice.y(walk[j]);
            for (int k = 0; k < DELTA_X.length; ++k) {
              final Pair<Integer, Integer> p = new Pair<>(x + DELTA_X[k], y + DELTA_Y[k]);
              final Integer nz = mWorkspace.get(p);
              if (nz != null) {
                ++bonds;
              }
            }
          }
          increment(weight * bonds / 2);
        });
      }
    });
  }
}
