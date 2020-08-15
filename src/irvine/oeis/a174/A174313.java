package irvine.oeis.a174;

import irvine.math.lattice.HexagonalLattice;
import irvine.math.lattice.NonadjacentWalker;
import irvine.math.lattice.ParallelWalker;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A174313 Number of n-step walks on hexagonal lattice (no points repeated, no adjacent points unless consecutive in path).
 * @author Sean A. Irvine
 */
public class A174313 implements Sequence {

  private final HexagonalLattice mHexagonalLattice = new HexagonalLattice();
  private final ParallelWalker mWalker = new ParallelWalker(() -> new NonadjacentWalker(mHexagonalLattice), mHexagonalLattice, 8);
  private final long mC = mHexagonalLattice.neighbour(mHexagonalLattice.origin(), 0);
  private int mN = -1;

  @Override
  public Z next() {
    return ++mN == 0 ? Z.ONE : Z.valueOf(mWalker.count(mN, 6, 1, mHexagonalLattice.origin(), mC));
  }
}
