package irvine.oeis.a001;

import irvine.math.lattice.FccLattice;
import irvine.math.lattice.ParallelWalker;
import irvine.math.lattice.SelfAvoidingCycler;
import irvine.math.lattice.SelfAvoidingWalker;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001337 Number of n-step polygons on f.c.c. lattice.
 * @author Sean A. Irvine
 */
public class A001337 implements Sequence {

  private int mN = 0;
  private final FccLattice mLattice = new FccLattice();
  private final long mC = mLattice.neighbour(mLattice.origin(), 0);
  private final ParallelWalker mWalker = new ParallelWalker(10,
    () -> new SelfAvoidingWalker(mLattice),
    () -> new SelfAvoidingCycler(mLattice, true));

  @Override
  public Z next() {
    return Z.valueOf(mWalker.count(++mN, 12, 7, mLattice.origin(), mC));
  }
}
