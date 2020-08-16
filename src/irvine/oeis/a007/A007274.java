package irvine.oeis.a007;

import irvine.math.lattice.HexagonalLattice;
import irvine.math.lattice.ParallelWalker;
import irvine.math.lattice.Walker;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007274 Walks on hexagonal lattice using each point at most twice.
 * @author Sean A. Irvine
 */
public class A007274 implements Sequence {

  private final HexagonalLattice mHexagonalLattice = new HexagonalLattice();
  private final long mC = mHexagonalLattice.neighbour(mHexagonalLattice.origin(), 0);
  private final ParallelWalker mWalker = new ParallelWalker(8, () -> new Walker(mHexagonalLattice) {
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
    return ++mN == 0 ? Z.ONE : Z.valueOf(mWalker.count(mN, 6, 1, mHexagonalLattice.origin(), mC));
  }
}
