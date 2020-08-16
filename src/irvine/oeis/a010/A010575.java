package irvine.oeis.a010;

import irvine.math.lattice.ParallelWalker;
import irvine.math.lattice.SelfAvoidingWalker;
import irvine.math.lattice.Z4Lattice;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A010575 Number of <code>n-step self-avoiding</code> walks on 4-d cubic lattice.
 * @author Sean A. Irvine
 */
public class A010575 implements Sequence {

  private final Z4Lattice mLattice = new Z4Lattice();
  private final ParallelWalker mWalker = new ParallelWalker(8, () -> new SelfAvoidingWalker(mLattice));
  private final long mC = mLattice.neighbour(mLattice.origin(), 0);
  private int mN = -1;

  @Override
  public Z next() {
    return ++mN == 0 ? Z.ONE : Z.valueOf(mWalker.count(mN, 8, 1, mLattice.origin(), mC));
  }
}
