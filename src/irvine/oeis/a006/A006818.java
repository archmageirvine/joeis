package irvine.oeis.a006;

import irvine.math.lattice.HexagonalLattice;
import irvine.math.lattice.ParallelWalker;
import irvine.math.lattice.Trailer;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006818 Trails of length n on hexagonal lattice.
 * @author Sean A. Irvine
 */
public class A006818 implements Sequence {

  private final HexagonalLattice mHexagonalLattice = new HexagonalLattice();
  private final long mC = mHexagonalLattice.neighbour(mHexagonalLattice.origin(), 0);
  private final ParallelWalker mWalker = new ParallelWalker(mHexagonalLattice, 8, () -> new Trailer(mHexagonalLattice));
  private int mN = -1;

  @Override
  public Z next() {
    return ++mN == 0 ? Z.ONE : Z.valueOf(mWalker.count(mN, 6, 1, mHexagonalLattice.origin(), mC));
  }
}
