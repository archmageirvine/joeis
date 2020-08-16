package irvine.oeis.a006;

import java.util.HashMap;

import irvine.math.lattice.ParallelWalker;
import irvine.math.lattice.SquareLattice;
import irvine.math.lattice.SelfAvoidingWalker;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.Pair;

/**
 * A006814 Related to self-avoiding walks on square lattice.
 * @author Sean A. Irvine
 */
public class A006814 implements Sequence {

  static final int[] DELTA_X = {-1, 1, 0, 0};
  static final int[] DELTA_Y = {0, 0, -1, 1};
  protected HashMap<Pair<Integer, Integer>, Integer> mWorkspace = new HashMap<>();

  protected final SquareLattice mSquareLattice = new SquareLattice();
  private final long mX1 = mSquareLattice.toPoint(1, 0);
  private int mN = 0;
  protected final ParallelWalker mWalker = getParallelWalker();

  protected ParallelWalker getParallelWalker() {
    return new ParallelWalker(8, () -> new SelfAvoidingWalker(mSquareLattice) {
      {
        setAccumulator((walk, weight, axesMask) -> {
          preparePath(walk);
          long linearExtent = 0;
          int z = 0;
          int k = walk.length - 1;
          while (k >= 0) {
            final int x = (int) mSquareLattice.x(walk[k]);
            final int y = (int) mSquareLattice.y(walk[k]);
            int bz = updateNextStart(z, x, y);
            if (bz == z) {
              break;
            } else if (bz == z + 1) {
              ++linearExtent;
            }
            while (z < bz) {
              --k;
              if (++z < bz) {
                bz = updateNextStart(bz, (int) mSquareLattice.x(walk[k]), (int) mSquareLattice.y(walk[k]));
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
      mWorkspace.put(new Pair<>((int) mSquareLattice.x(w[k]), (int) mSquareLattice.y(w[k])), cnt++);
    }
    return cnt;
  }

  @Override
  public Z next() {
    return Z.valueOf(mWalker.count(++mN, 1, 1, mSquareLattice.origin(), mX1));
  }
}
