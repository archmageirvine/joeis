package irvine.oeis.a005;

import irvine.math.lattice.KagomeLattice;
import irvine.math.lattice.ParallelWalker;
import irvine.math.lattice.SelfAvoidingCycler;
import irvine.math.lattice.SelfAvoidingWalker;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005397 Number of n-step polygons on Kagome lattice.
 * @author Sean A. Irvine
 */
public class A005397 implements Sequence {

  private int mN = 2;
  private final KagomeLattice mLattice = new KagomeLattice();
  private final long mC = mLattice.neighbour(mLattice.origin(), 0);
  private final ParallelWalker mWalker = new ParallelWalker(8,
    () -> new SelfAvoidingWalker(mLattice),
    () -> new SelfAvoidingCycler(mLattice, true));

  @Override
  public Z next() {
    return Z.valueOf(mWalker.count(++mN, 4, 3, mLattice.origin(), mC));
  }
}
