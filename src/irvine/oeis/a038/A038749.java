package irvine.oeis.a038;

import irvine.math.lattice.ExactContactsWalker;
import irvine.math.lattice.Lattices;
import irvine.math.lattice.Walker;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A038749 Coefficients arising in the enumeration of configurations of linear chains.
 * @author Sean A. Irvine
 */
public class A038749 implements Sequence {

  private final Walker mWalker = new ExactContactsWalker(Lattices.Z3, 1) {

    private boolean containsPositiveStep(final int remainingSteps, final int ordinate) {
      for (int k = mN - remainingSteps; k >= 0; --k) {
        if (Lattices.Z3.ordinate(mWalk[k], ordinate) > 0) {
          return true;
        }
      }
      return false;
    }

    private boolean containsPositiveYStep(final int remainingSteps) {
      return containsPositiveStep(remainingSteps, 1);
    }

    private boolean containsPositiveZStep(final int remainingSteps) {
      return containsPositiveStep(remainingSteps, 2);
    }

    @Override
    protected boolean isAcceptable(final long point, final int remainingSteps) {
      if (!super.isAcceptable(point, remainingSteps)) {
        return false;
      }
      // First y step must be positive
      final long y = Lattices.Z3.ordinate(point, 1);
      if (y < 0 && !containsPositiveYStep(remainingSteps)) {
        return false;
      }
      // First z step must be positive and come after a y-step
      final long z = Lattices.Z3.ordinate(point, 2);
      if (z < 0 && !containsPositiveZStep(remainingSteps)) {
        return false;
      }
      if (z != 0) {
        // Check we have already stepped in the y direction
        if (y == 0 && !containsPositiveYStep(remainingSteps)) {
          return false;
        }
      }
      if (remainingSteps != 1) {
        return true;
      }
      // Check a step was made in the z-ordinate somewhere on the path
      return z != 0 || containsPositiveZStep(remainingSteps);
    }
  };
  private final long mX1 = Lattices.Z3.neighbour(Lattices.Z3.origin(), 0);
  private int mN = 0;

  @Override
  public Z next() {
    return ++mN == 1 ? Z.ZERO : Z.valueOf(mWalker.count(mN, 1, 7, Lattices.Z3.origin(), mX1));
  }
}
