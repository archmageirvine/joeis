package irvine.oeis.a336;

import irvine.math.lattice.BccLattice;
import irvine.math.lattice.NonadjacentWalker;
import irvine.math.lattice.ParallelWalker;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A336906 Number of <code>n-step self-avoiding</code> walks on the b.c.c. lattice with no non-contiguous adjacencies.
 * @author Sean A. Irvine
 */
public class A336906 implements Sequence {

  private final BccLattice mLattice = new BccLattice();
  private final ParallelWalker mWalker = new ParallelWalker(8, () -> new NonadjacentWalker(mLattice));
  private final long mC = mLattice.neighbour(mLattice.origin(), 0);
  private int mN = -1;

  @Override
  public Z next() {
    return ++mN == 0 ? Z.ONE : Z.valueOf(mWalker.count(mN, 8, 7, mLattice.origin(), mC));
  }
}
