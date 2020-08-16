package irvine.oeis.a001;

import irvine.math.lattice.HoneycombLattice;
import irvine.math.lattice.ParallelWalker;
import irvine.math.lattice.SelfAvoidingWalker;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001668 Number of <code>self-avoiding n-step</code> walks on honeycomb lattice.
 * @author Sean A. Irvine
 */
public class A001668 implements Sequence {

  private final HoneycombLattice mLattice = new HoneycombLattice();
  private final ParallelWalker mWalker = new ParallelWalker(8, () -> new SelfAvoidingWalker(mLattice));
  private final long mC = mLattice.neighbour(mLattice.origin(), 0);
  private int mN = -1;

  @Override
  public Z next() {
    return ++mN == 0 ? Z.ONE : Z.valueOf(mWalker.count(mN, 3, 3, mLattice.origin(), mC));
  }
}
