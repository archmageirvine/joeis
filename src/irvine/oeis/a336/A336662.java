package irvine.oeis.a336;

import irvine.math.lattice.ManhattanLattice;
import irvine.math.lattice.ParallelWalker;
import irvine.math.lattice.SquareLattice;
import irvine.math.lattice.Walker;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A336662 Number of <code>n-step self-avoiding</code> walks on the Manhattan lattice with no non-contiguous adjacencies.
 * @author Sean A. Irvine
 */
public class A336662 implements Sequence {

  private final ManhattanLattice mManhattanLattice = new ManhattanLattice();
  private final SquareLattice mSquareLattice = new SquareLattice();
  private final ParallelWalker mWalker = new ParallelWalker(() -> new Walker(mManhattanLattice) {
    // This is a little special.  Although walk steps are on the Manhattan lattice,
    // we need to use the square lattice to test adjacency.
    @Override
    protected boolean isAcceptable(final long point, final int remainingSteps) {
      if (!super.isAcceptable(point, remainingSteps)) {
        return false;
      }
      int neighbourCount = - 1; // -1 for where we are coming from
      for (int k = 0; k < mSquareLattice.neighbourCount(point); ++k) {
        if (!super.isAcceptable(mSquareLattice.neighbour(point, k), remainingSteps) && ++neighbourCount > 0) {
          return false;
        }
      }
      return true;
    }
  }, mManhattanLattice, 8);
  private final long mX1 = mManhattanLattice.toPoint(1, 0);
  private int mN = -1;

  @Override
  public Z next() {
    return ++mN == 0 ? Z.ONE : Z.valueOf(mWalker.count(mN, 2, 3, mManhattanLattice.origin(), mX1));
  }
}
