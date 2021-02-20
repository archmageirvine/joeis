package irvine.oeis.a039;

import irvine.math.lattice.Lattices;
import irvine.math.lattice.ParallelWalker;
import irvine.math.lattice.SelfAvoidingWalker;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A039648.
 * @author Sean A. Irvine
 */
public class A039648 implements Sequence {

  private int mN = -1;
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
    });

  @Override
  public Z next() {
    return ++mN == 0 ? Z.ONE : Z.valueOf(mWalker.count(mN, 3, 7, Lattices.Z3.origin(), mC));
  }
}
