package irvine.oeis.a010;

import irvine.math.lattice.ParallelWalker;
import irvine.math.lattice.SelfAvoidingCycler;
import irvine.math.lattice.SelfAvoidingWalker;
import irvine.math.lattice.Z6Lattice;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A010570 <code>2n-step 6-dimensional</code> closed paths on 6-d cubic lattice.
 * @author Sean A. Irvine
 */
public class A010570 implements Sequence {

  private int mN = 0;
  private final Z6Lattice mLattice = new Z6Lattice();
  private final long mC = mLattice.neighbour(mLattice.origin(), 0);
  private final ParallelWalker mWalker = new ParallelWalker(8,
    () -> new SelfAvoidingWalker(mLattice),
    () -> new SelfAvoidingCycler(mLattice, false));

  @Override
  public Z next() {
    mN += 2;
    return Z.valueOf(mWalker.count(mN, 12, 1, mLattice.origin(), mC));
  }
}
