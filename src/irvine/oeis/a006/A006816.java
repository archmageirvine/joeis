package irvine.oeis.a006;

import irvine.math.TwoDimensionalWalk;
import irvine.util.Pair;

/**
 * A006816 Related to self-avoiding walks on square lattice.
 * @author Sean A. Irvine
 */
public class A006816 extends A006814 {

  @Override
  protected long count(final TwoDimensionalWalk w) {
    preparePath(w);
    long bonds = 0;
    TwoDimensionalWalk u = w;
    while (u != null) {
      final int x = u.x();
      final int y = u.y();
      for (int k = 0; k < DELTA_X.length; ++k) {
        final Pair<Integer, Integer> p = new Pair<>(x + DELTA_X[k], y + DELTA_Y[k]);
        final Integer nz = mWorkspace.get(p);
        if (nz != null) {
          ++bonds;
        }
      }
      u = u.getPrevious();
    }
    return bonds / 2;
  }
}
