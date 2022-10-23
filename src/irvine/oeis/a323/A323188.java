package irvine.oeis.a323;

import irvine.math.lattice.Lattices;
import irvine.math.lattice.ParallelWalker;
import irvine.math.lattice.SelfAvoidingWalker;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A323188 Number of n-step mirror-symmetrical self-avoiding walks on the square lattice.
 * @author Sean A. Irvine
 */
public class A323188 extends Sequence1 {

  private final long mX1 = Lattices.Z2.toPoint(1, 0);

  protected final ParallelWalker mNonnegX = new ParallelWalker(8, () -> new SelfAvoidingWalker(Lattices.Z2) {
    @Override
    protected boolean isAcceptable(final long point, final int remainingSteps) {
      if (Lattices.Z2.ordinate(point, 0) < 0 || !super.isAcceptable(point, remainingSteps)) {
        return false;
      }
      if (Lattices.Z2.ordinate(point, 1) < 0) {
        // y-step, if first y-step this must be positive
        for (int k = mWalk.length - remainingSteps - 1; k >= 0; --k) {
          if (Lattices.Z2.ordinate(mWalk[k], 1) > 0) {
            return true; // Already have y = 1 step
          }
        }
        return false; // cannot do y-1
      }
      return true;
    }
  });

  protected final ParallelWalker mBelowDiag = new ParallelWalker(8, () -> new SelfAvoidingWalker(Lattices.Z2) {
    @Override
    protected boolean isAcceptable(final long point, final int remainingSteps) {
      return Lattices.Z2.ordinate(point, 1) < Lattices.Z2.ordinate(point, 0) && super.isAcceptable(point, remainingSteps);
    }
  });

  private int mN = 0;

  @Override
  public Z next() {
    return (++mN & 1) == 0
      ? Z.valueOf(mNonnegX.count((mN - 2) / 2, 8, -1, Lattices.Z2.origin()) - 4).add(mBelowDiag.count(mN / 2, 8, -1, Lattices.Z2.origin(), mX1))
      : Z.valueOf(mNonnegX.count((mN - 1) / 2, 8, -1, Lattices.Z2.origin()) - 4);
  }
}
