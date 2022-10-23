package irvine.oeis.a006;

import java.util.HashMap;

import irvine.math.lattice.Lattices;
import irvine.math.lattice.ParallelWalker;
import irvine.math.lattice.SelfAvoidingWalker;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.Pair;

/**
 * A006814 Related to self-avoiding walks on square lattice.
 * @author Sean A. Irvine
 */
public class A006814 extends Sequence1 {

  static final int[] DELTA_X = {-1, 1, 0, 0};
  static final int[] DELTA_Y = {0, 0, -1, 1};
  protected HashMap<Pair<Integer, Integer>, Integer> mWorkspace = new HashMap<>();

  private final long mX1 = Lattices.Z2.toPoint(1, 0);
  private int mN = 0;
  protected final ParallelWalker mWalker = getParallelWalker();

  protected ParallelWalker getParallelWalker() {
    return new ParallelWalker(8, () -> new SelfAvoidingWalker(Lattices.Z2) {
      {
        setAccumulator((walk, weight, axesMask) -> {
          preparePath(walk);
          long linearExtent = 0;
          int z = 0;
          int k = walk.length - 1;
          while (k >= 0) {
            final int x = (int) Lattices.Z2.ordinate(walk[k], 0);
            final int y = (int) Lattices.Z2.ordinate(walk[k], 1);
            int bz = updateNextStart(z, x, y);
            if (bz == z) {
              break;
            } else if (bz == z + 1) {
              ++linearExtent;
            }
            while (z < bz) {
              --k;
              if (++z < bz) {
                bz = updateNextStart(bz, (int) Lattices.Z2.ordinate(walk[k], 0), (int) Lattices.Z2.ordinate(walk[k], 1));
              }
            }
          }
          increment(linearExtent * weight);
        });
      }
    });
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

  protected int preparePath(final long[] w) {
    mWorkspace.clear();
    int cnt = 0;
    for (int k = w.length - 1; k >= 0; --k) {
      mWorkspace.put(new Pair<>((int) Lattices.Z2.ordinate(w[k], 0), (int) Lattices.Z2.ordinate(w[k], 1)), cnt++);
    }
    return cnt;
  }

  @Override
  public Z next() {
    return Z.valueOf(mWalker.count(++mN, 1, 1, Lattices.Z2.origin(), mX1));
  }
}
