package irvine.oeis.a336;

import irvine.math.lattice.HoneycombLattice;
import irvine.math.lattice.NonadjacentWalker;
import irvine.math.lattice.ParallelWalker;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A336758 Number of <code>n-step self-avoiding</code> walks on the honeycomb lattice with no non-contiguous adjacencies.
 * @author Sean A. Irvine
 */
public class A336758 implements Sequence {

  private final HoneycombLattice mLattice = new HoneycombLattice();
  private final ParallelWalker mWalker = new ParallelWalker(mLattice, 8, () -> new NonadjacentWalker(mLattice));
  private final long mC = mLattice.neighbour(mLattice.origin(), 0);
  private int mN = -1;

  @Override
  public Z next() {
    return ++mN == 0 ? Z.ONE : Z.valueOf(mWalker.count(mN, 3, 3, mLattice.origin(), mC));
  }
}
