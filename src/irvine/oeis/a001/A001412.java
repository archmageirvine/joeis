package irvine.oeis.a001;

import irvine.math.lattice.CubicLattice;
import irvine.math.lattice.ParallelWalker;
import irvine.math.lattice.SelfAvoidingWalker;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001412 Number of <code>n-step self-avoiding</code> walks on cubic lattice.
 * @author Sean A. Irvine
 */
public class A001412 implements Sequence {

  private final CubicLattice mLattice = new CubicLattice();
  private final ParallelWalker mWalker = new ParallelWalker(8, () -> new SelfAvoidingWalker(mLattice));
  private final long mC = mLattice.neighbour(mLattice.origin(), 0);
  private int mN = -1;

  @Override
  public Z next() {
    return ++mN == 0 ? Z.ONE : Z.valueOf(mWalker.count(mN, 6, 1, mLattice.origin(), mC));
  }
}
