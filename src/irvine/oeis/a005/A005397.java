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
  private final KagomeLattice mKagomeLattice = new KagomeLattice();
  private final long mC = mKagomeLattice.neighbour(mKagomeLattice.origin(), 0);
  private final ParallelWalker mWalker = new ParallelWalker(8,
    () -> new SelfAvoidingWalker(mKagomeLattice),
    () -> new SelfAvoidingCycler(mKagomeLattice, true));

  @Override
  public Z next() {
    return Z.valueOf(mWalker.count(++mN, 4, 3, mKagomeLattice.origin(), mC));
  }
}
