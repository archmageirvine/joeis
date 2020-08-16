package irvine.oeis.a002;

import irvine.math.lattice.BccLattice;
import irvine.math.lattice.ParallelWalker;
import irvine.math.lattice.SelfAvoidingWalker;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002903 Number of <code>n-step self-avoiding</code> walks on b.c.c. lattice.
 * @author Sean A. Irvine
 */
public class A002903 implements Sequence {

  private final BccLattice mLattice = new BccLattice();
  private final ParallelWalker mWalker = new ParallelWalker(8, () -> new SelfAvoidingWalker(mLattice));
  private final long mC = mLattice.neighbour(mLattice.origin(), 0);
  private int mN = -1;

  @Override
  public Z next() {
    return ++mN == 0 ? Z.ONE : Z.valueOf(mWalker.count(mN, 4, 7, mLattice.origin(), mC));
  }
}
