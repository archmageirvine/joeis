package irvine.oeis.a038;

import irvine.math.lattice.NonadjacentWalker;
import irvine.math.lattice.ParallelWalker;
import irvine.math.lattice.Z5Lattice;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A038726 The number of <code>n-step self-avoiding</code> walks in a 5-dimensional hypercubic lattice with no non-contiguous adjacencies.
 * @author Sean A. Irvine
 */
public class A038726 implements Sequence {

  private final Z5Lattice mLattice = new Z5Lattice();
  private final ParallelWalker mWalker = new ParallelWalker(8, () -> new NonadjacentWalker(mLattice));
  private final long mC = mLattice.neighbour(mLattice.origin(), 0);
  private int mN = -1;

  @Override
  public Z next() {
    return ++mN == 0 ? Z.ONE : Z.valueOf(mWalker.count(mN, 10, 1, mLattice.origin(), mC));
  }
}
