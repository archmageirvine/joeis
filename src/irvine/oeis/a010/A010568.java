package irvine.oeis.a010;

import irvine.math.lattice.ParallelWalker;
import irvine.math.lattice.SelfAvoidingCycler;
import irvine.math.lattice.SelfAvoidingWalker;
import irvine.math.lattice.Z4Lattice;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A010568 <code>2n-step 4-dimensional</code> closed paths on 4-d cubic lattice.
 * @author Sean A. Irvine
 */
public class A010568 implements Sequence {

  private int mN = 0;
  private final Z4Lattice mLattice = new Z4Lattice();
  private final long mC = mLattice.neighbour(mLattice.origin(), 0);
  private final ParallelWalker mWalker = new ParallelWalker(8,
    () -> new SelfAvoidingWalker(mLattice),
    () -> new SelfAvoidingCycler(mLattice, false));

  @Override
  public Z next() {
    mN += 2;
    return Z.valueOf(mWalker.count(mN, 8, 1, mLattice.origin(), mC));
  }
}
