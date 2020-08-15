package irvine.oeis.a001;

import irvine.math.lattice.HexagonalLattice;
import irvine.math.lattice.ParallelWalker;
import irvine.math.lattice.SelfAvoidingCycler;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001335 Number of n-step polygons on hexagonal lattice.
 * @author Sean A. Irvine
 */
public class A001335 implements Sequence {

  private int mN = -1;
  private final HexagonalLattice mHexagonalLattice = new HexagonalLattice();
  private final long mC = mHexagonalLattice.neighbour(mHexagonalLattice.origin(), 0);

  // todo parallel walker for self-avoiding cycles needs different walker for the seeds
  // todo actually this is a general problemm perhaps provide a two arg constructor to deal with this

  private final ParallelWalker mWalker = new ParallelWalker(() -> new SelfAvoidingCycler(mHexagonalLattice, true), mHexagonalLattice, 8);

  @Override
  public Z next() {
    return ++mN == 0 ? Z.ONE: Z.valueOf(mWalker.count(mN, 6, 1, mHexagonalLattice.origin(), mC));
  }
}
