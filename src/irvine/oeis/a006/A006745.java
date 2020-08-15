package irvine.oeis.a006;

import java.util.HashSet;
import java.util.Set;

import irvine.math.lattice.ManhattanLattice;
import irvine.math.lattice.ParallelWalker;
import irvine.math.lattice.SelfAvoidingWalker;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006745 Number of indefinitely growing <code>n-step self-avoiding</code> walks on Manhattan lattice.
 * @author Sean A. Irvine
 */
public class A006745 implements Sequence {

  private final ManhattanLattice mManhattanLattice = new ManhattanLattice();
  private final ParallelWalker mWalker = new ParallelWalker(mManhattanLattice, 8, () -> new SelfAvoidingWalker(mManhattanLattice) {
    // Compute a bounding box for the walk so far
    private long[] bounds(final int remainingSteps) {
      final long[] bounds = new long[4];
      for (int k = mWalk.length - remainingSteps - 1; k >= 0; --k) {
        final long x = mLattice.ordinate(mWalk[k], 0);
        final long y = mLattice.ordinate(mWalk[k], 1);
        bounds[0] = Math.min(bounds[0], x);
        bounds[1] = Math.max(bounds[1], x);
        bounds[2] = Math.min(bounds[2], y);
        bounds[3] = Math.max(bounds[3], y);
      }
      return bounds;
    }

    private boolean isAcceptable(final Set<Long> forbidden, final long[] bounds, final long point, final int remainingSteps) {
      // Effectively this tries to extend the walk (keeping track of new points in forbidden),
      // until either we reach outside the current bounding box or until we determine it is
      // impossible to expand the path any further.
      if (contains(point, remainingSteps) || forbidden.contains(point)) {
        return false;
      }
      final long x = mLattice.ordinate(point, 0);
      final long y = mLattice.ordinate(point, 1);
      if (x < bounds[0] || x > bounds[1] || y < bounds[2] || y > bounds[3]) {
        return true; // We are passed current edge
      }
      forbidden.add(point);
      for (int k = 0; k < mLattice.neighbourCount(point); ++k) {
        if (isAcceptable(forbidden, bounds, mLattice.neighbour(point, k), remainingSteps)) {
          forbidden.remove(point);
          return true;
        }
      }
      forbidden.remove(point);
      return false;
    }

    @Override
    protected boolean isAcceptable(final long point, final int remainingSteps) {
      // We need to check it is possible to reach the current bounding box of the walk
      return isAcceptable(new HashSet<>(), bounds(remainingSteps), point, remainingSteps);
    }
  });
  private final long mC = mManhattanLattice.neighbour(mManhattanLattice.origin(), 0);
  private int mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(mWalker.count(++mN, 1, 3, mManhattanLattice.origin(), mC));
  }
}
