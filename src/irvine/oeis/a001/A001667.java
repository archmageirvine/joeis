package irvine.oeis.a001;

import irvine.math.lattice.BccLattice;
import irvine.math.lattice.ParallelWalker;
import irvine.math.lattice.SelfAvoidingCycler;
import irvine.math.lattice.SelfAvoidingWalker;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001667 2n-step polygons on b.c.c. lattice.
 * @author Sean A. Irvine
 */
public class A001667 implements Sequence {

  private int mN = 2;
  private final BccLattice mLattice = new BccLattice();
  private final long mC = mLattice.neighbour(mLattice.origin(), 0);
  private final ParallelWalker mWalker = new ParallelWalker(10,
    () -> new SelfAvoidingWalker(mLattice),
    () -> new SelfAvoidingCycler(mLattice, false));

  @Override
  public Z next() {
    mN += 2;
    return Z.valueOf(mWalker.count(mN, 8, 7, mLattice.origin(), mC));
  }
}
