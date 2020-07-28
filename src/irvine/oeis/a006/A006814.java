package irvine.oeis.a006;

import java.util.HashMap;

import irvine.math.TwoDimensionalWalk;
import irvine.oeis.a001.A001411;
import irvine.util.Pair;

/**
 * A006814 Related to self-avoiding walks on square lattice.
 * @author Sean A. Irvine
 */
public class A006814 extends A001411 {

  static final int[] DELTA_X = {-1, 1, 0, 0};
  static final int[] DELTA_Y = {0, 0, -1, 1};
  protected HashMap<Pair<Integer, Integer>, Integer> mWorkspace = new HashMap<>();

  {
    super.next(); // skip 0th term
  }

  protected int updateNextStart(final int z, final int x, final int y) {
    // For the given (x,y), return the highest reachable node of the walk,
    // using edges or bridges, given that we can already reach z.
    int bz = z;
    for (int k = 0; k < DELTA_X.length; ++k) {
      final Pair<Integer, Integer> p = new Pair<>(x + DELTA_X[k], y + DELTA_Y[k]);
      final Integer nz = mWorkspace.get(p);
      if (nz != null && nz > bz) {
        bz = nz;
      }
    }
    return bz;
  }

  protected int preparePath(final TwoDimensionalWalk w) {
    mWorkspace.clear();
    TwoDimensionalWalk u = w;
    int cnt = 0;
    while (u != null) {
      mWorkspace.put(new Pair<>(u.x(), u.y()), cnt++);
      u = u.getPrevious();
    }
    return cnt;
  }

  protected long count(final TwoDimensionalWalk w) {
    preparePath(w);
    long linearExtent = 0;
    int z = 0;
    TwoDimensionalWalk u = w;
    while (u != null) {
      final int x = u.x();
      final int y = u.y();
      int bz = updateNextStart(z, x, y);
      if (bz == z) {
        break;
      } else if (bz == z + 1) {
        ++linearExtent;
      }
      while (z < bz) {
        u = u.getPrevious();
        if (++z < bz) {
          bz = updateNextStart(bz, u.x(), u.y());
        }
      }
    }
    return linearExtent;
  }
}
