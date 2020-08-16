package irvine.oeis.a010;

import irvine.math.lattice.ParallelWalker;
import irvine.math.lattice.SelfAvoidingCycler;
import irvine.math.lattice.SelfAvoidingWalker;
import irvine.math.lattice.Z5Lattice;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A010569 <code>2n-step 5-dimensional</code> closed paths on 5-d cubic lattice.
 * @author Sean A. Irvine
 */
public class A010569 implements Sequence {

  private int mN = 0;
  private final Z5Lattice mLattice = new Z5Lattice();
  private final long mC = mLattice.neighbour(mLattice.origin(), 0);
  private final ParallelWalker mWalker = new ParallelWalker(8,
    () -> new SelfAvoidingWalker(mLattice),
    () -> new SelfAvoidingCycler(mLattice, false));

  @Override
  public Z next() {
    mN += 2;
    return Z.valueOf(mWalker.count(mN, 10, 1, mLattice.origin(), mC));
  }
}
