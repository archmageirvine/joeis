package irvine.oeis.a010;

import irvine.math.lattice.ParallelWalker;
import irvine.math.lattice.SelfAvoidingCycler;
import irvine.math.lattice.SelfAvoidingWalker;
import irvine.math.lattice.SquareLattice;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A010566 Number of <code>2n-step 2-dimensional</code> closed self-avoiding paths on square lattice.
 * @author Sean A. Irvine
 */
public class A010566 implements Sequence {

  private int mN = 0;
  private final SquareLattice mLattice = new SquareLattice();
  private final long mC = mLattice.neighbour(mLattice.origin(), 0);
  private final ParallelWalker mWalker = new ParallelWalker(8,
    () -> new SelfAvoidingWalker(mLattice),
    () -> new SelfAvoidingCycler(mLattice, true));

  @Override
  public Z next() {
    mN += 2;
    return Z.valueOf(mWalker.count(mN, 4, 1, mLattice.origin(), mC));
  }
}
