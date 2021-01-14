package irvine.oeis.a038;

import irvine.math.lattice.Lattices;
import irvine.math.lattice.ParallelWalker;
import irvine.math.lattice.SelfAvoidingWalker;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A038373 Number of n-step self-avoiding paths on quadrant grid starting at quadrant origin.
 * @author Sean A. Irvine
 */
public class A038373 implements Sequence {

  private int mN = -1;
  private final long mC = Lattices.Z2.neighbour(Lattices.Z2.origin(), 0);
  private final ParallelWalker mWalker = new ParallelWalker(8,
    () -> new SelfAvoidingWalker(Lattices.Z2) {
      @Override
      protected boolean isAcceptable(final long point, final int remainingSteps) {
        return super.isAcceptable(point, remainingSteps) && Lattices.Z2.ordinate(point, 0) >= 0 && Lattices.Z2.ordinate(point, 1) >= 0;
      }
    }
  );

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    return Z.valueOf(mWalker.count(mN, 2, 3, Lattices.Z2.origin(), mC));
  }
}
