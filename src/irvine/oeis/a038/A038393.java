package irvine.oeis.a038;

import irvine.math.lattice.Lattices;
import irvine.math.lattice.ParallelWalker;
import irvine.math.lattice.SelfAvoidingWalker;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A038393 Number of 4n-step self-avoiding closed paths on first quadrant grid, passing through origin, symmetric about line y = x.
 * @author Sean A. Irvine
 */
public class A038393 extends Sequence0 {

  // Compute paths of length 2n such that the final point is on the line y=x
  // and no other point (except the origin) is on y=x.  Thus on reflection
  // in y=x the total cycle length will be 4n and also self-avoiding.

  private int mN = -2;
  private final long mC = Lattices.Z2.neighbour(Lattices.Z2.origin(), 0);
  private final ParallelWalker mWalker = new ParallelWalker(8,
    () -> new SelfAvoidingWalker(Lattices.Z2) {
      @Override
      protected boolean isAcceptable(final long point, final int remainingSteps) {
        if (!super.isAcceptable(point, remainingSteps)) {
          return false;
        }
        final long y = Lattices.Z2.ordinate(point, 1);
        if (y < 0) {
          return false;
        }
        final long x = Lattices.Z2.ordinate(point, 0);
        if (x <= 0) {
          return false;
        }
        return y < x;
      }
    },
    () -> new SelfAvoidingWalker(Lattices.Z2) {
      @Override
      protected boolean isAcceptable(final long point, final int remainingSteps) {
        if (!super.isAcceptable(point, remainingSteps)) {
          return false;
        }
        final long y = Lattices.Z2.ordinate(point, 1);
        if (y < 0) {
          return false;
        }
        final long x = Lattices.Z2.ordinate(point, 0);
        if (x <= 0) {
          return false;
        }
        if (remainingSteps == 1) {
          return y == x;
        }
        return y < x;
      }
    }
  );

  @Override
  public Z next() {
    mN += 2;
    if (mN == 0) {
      return Z.ONE;
    }
    return Z.valueOf(mWalker.count(mN, 1, 3, Lattices.Z2.origin(), mC));
  }
}
