package irvine.oeis.a039;

import irvine.math.lattice.Lattices;
import irvine.math.lattice.ParallelWalker;
import irvine.math.lattice.SelfAvoidingCycler;
import irvine.math.lattice.SelfAvoidingWalker;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A039618 Number of 2n-step self-avoiding closed walks on first octant of 3-dimensional cubic lattice, passing through origin.
 * @author Sean A. Irvine
 */
public class A039618 extends Sequence0 {

  private int mN = -2;
  private final long mC = Lattices.Z3.neighbour(Lattices.Z3.origin(), 0);
  private final ParallelWalker mWalker = new ParallelWalker(8,
    () -> new SelfAvoidingWalker(Lattices.Z3) {
      @Override
      protected boolean isAcceptable(final long point, final int remainingSteps) {
        return super.isAcceptable(point, remainingSteps)
          && Lattices.Z3.ordinate(point, 0) >= 0
          && Lattices.Z3.ordinate(point, 1) >= 0
          && Lattices.Z3.ordinate(point, 2) >= 0
          ;
      }
    },
    () -> new SelfAvoidingCycler(Lattices.Z3, true) {
      @Override
      protected boolean isAcceptable(final long point, final int remainingSteps) {
        return super.isAcceptable(point, remainingSteps)
          && Lattices.Z3.ordinate(point, 0) >= 0
          && Lattices.Z3.ordinate(point, 1) >= 0
          && Lattices.Z3.ordinate(point, 2) >= 0
          ;
      }
    });

  @Override
  public Z next() {
    mN += 2;
    return mN == 0 ? Z.ONE : Z.valueOf(mWalker.count(mN, 3, 7, Lattices.Z3.origin(), mC)).divide2();
  }
}
