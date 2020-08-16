package irvine.oeis.a034;

import irvine.math.lattice.ParallelWalker;
import irvine.math.lattice.SelfAvoidingCycler;
import irvine.math.lattice.SelfAvoidingWalker;
import irvine.math.lattice.SquareLattice;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A034010 Number of 2n-step self avoiding closed walks on square grid, restricted to a quadrant and passing through origin.
 * @author Sean A. Irvine
 */
public class A034010 implements Sequence {

  private int mN = 0;
  private final SquareLattice mLattice = new SquareLattice();
  private final long mC = mLattice.neighbour(mLattice.origin(), 0);
  private final ParallelWalker mWalker = new ParallelWalker(8,
    () -> new SelfAvoidingWalker(mLattice) {
      @Override
      protected boolean isAcceptable(final long point, final int remainingSteps) {
        return super.isAcceptable(point, remainingSteps) && A034010.this.mLattice.x(point) >= 0 && A034010.this.mLattice.y(point) >= 0;
      }
    },
    () -> new SelfAvoidingCycler(mLattice, true) {
      @Override
      protected boolean isAcceptable(final long point, final int remainingSteps) {
        return super.isAcceptable(point, remainingSteps) && A034010.this.mLattice.x(point) >= 0 && A034010.this.mLattice.y(point) >= 0;
      }
    });

  @Override
  public Z next() {
    mN += 2;
    return Z.valueOf(mWalker.count(mN, 1, 1, mLattice.origin(), mC)).divide2();
  }
}
