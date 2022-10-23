package irvine.oeis.a129;

import irvine.math.lattice.Lattices;
import irvine.math.lattice.ParallelWalker;
import irvine.math.lattice.SelfAvoidingWalker;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A129700 Number of n-step self-avoiding paths on octant grid starting at octant origin.
 * @author Sean A. Irvine
 */
public class A129700 extends Sequence1 {

  private int mN = -1;
  private final long mC = Lattices.Z2.neighbour(Lattices.Z2.origin(), 0);
  private final ParallelWalker mWalker = new ParallelWalker(8,
    () -> new SelfAvoidingWalker(Lattices.Z2) {
      @Override
      protected boolean isAcceptable(final long point, final int remainingSteps) {
        return super.isAcceptable(point, remainingSteps)
          && Lattices.Z2.ordinate(point, 1) >= 0
          && Lattices.Z2.ordinate(point, 0) >= Lattices.Z2.ordinate(point, 1);
      }
    }
  );

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    return Z.valueOf(mWalker.count(mN, 1, 3, Lattices.Z2.origin(), mC));
  }
}
