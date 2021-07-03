package irvine.oeis.a048;

import irvine.math.lattice.Lattices;
import irvine.math.lattice.ParallelWalker;
import irvine.math.lattice.SelfAvoidingWalker;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A048738 Number of self-avoiding walks on square lattice rotated by Pi/4, with wedge angle Pi/2.
 * @author Sean A. Irvine
 */
public class A048738 implements Sequence {

  private int mN = -1;
  private final long mC = Lattices.Z2.neighbour(Lattices.Z2.origin(), 0);
  private final ParallelWalker mWalker = new ParallelWalker(8,
    () -> new SelfAvoidingWalker(Lattices.Z2) {
      @Override
      protected boolean isAcceptable(final long point, final int remainingSteps) {
        if (!super.isAcceptable(point, remainingSteps)) {
          return false;
        }
        final long x = Lattices.Z2.ordinate(point, 0);
        final long y = Lattices.Z2.ordinate(point, 1);
        return x >= 0 && y <= x && y >= -x;
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
