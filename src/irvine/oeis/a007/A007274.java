package irvine.oeis.a007;

import irvine.math.lattice.Lattices;
import irvine.math.lattice.ParallelWalker;
import irvine.math.lattice.Walker;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007274 Walks on hexagonal lattice using each point at most twice.
 * @author Sean A. Irvine
 */
public class A007274 implements Sequence {

  private final long mC = Lattices.HEXAGONAL.neighbour(Lattices.HEXAGONAL.origin(), 0);
  private final ParallelWalker mWalker = new ParallelWalker(8, () -> new Walker(Lattices.HEXAGONAL) {
    @Override
    protected boolean isAcceptable(final long point, final int remainingSteps) {
      int count = 0;
      for (int k = mWalk.length - remainingSteps - 1; k >= 0; --k) {
        if (mWalk[k] == point && ++count > 1) {
          return false;
        }
      }
      return true;
    }
  });
  private int mN = -1;

  @Override
  public Z next() {
    return ++mN == 0 ? Z.ONE : Z.valueOf(mWalker.count(mN, 6, 1, Lattices.HEXAGONAL.origin(), mC));
  }
}
