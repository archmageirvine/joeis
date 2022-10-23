package irvine.oeis.a034;

import irvine.math.lattice.Lattices;
import irvine.math.lattice.ParallelWalker;
import irvine.math.lattice.SelfAvoidingCycler;
import irvine.math.lattice.SelfAvoidingWalker;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A034010 Number of 2n-step self avoiding closed walks on square grid, restricted to a quadrant and passing through origin.
 * @author Sean A. Irvine
 */
public class A034010 extends Sequence1 {

  private int mN = 0;
  private final long mC = Lattices.Z2.neighbour(Lattices.Z2.origin(), 0);
  private final ParallelWalker mWalker = new ParallelWalker(8,
    () -> new SelfAvoidingWalker(Lattices.Z2) {
      @Override
      protected boolean isAcceptable(final long point, final int remainingSteps) {
        return super.isAcceptable(point, remainingSteps) && Lattices.Z2.ordinate(point, 0) >= 0 && Lattices.Z2.ordinate(point, 1) >= 0;
      }
    },
    () -> new SelfAvoidingCycler(Lattices.Z2, true) {
      @Override
      protected boolean isAcceptable(final long point, final int remainingSteps) {
        return super.isAcceptable(point, remainingSteps) && Lattices.Z2.ordinate(point, 0) >= 0 && Lattices.Z2.ordinate(point, 1) >= 0;
      }
    });

  @Override
  public Z next() {
    mN += 2;
    return Z.valueOf(mWalker.count(mN, 1, 1, Lattices.Z2.origin(), mC)).divide2();
  }
}
