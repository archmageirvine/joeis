package irvine.oeis.a001;

import irvine.math.lattice.CubicLattice;
import irvine.math.lattice.ParallelWalker;
import irvine.math.lattice.SelfAvoidingCycler;
import irvine.math.lattice.SelfAvoidingWalker;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001413 Number of 2n-step polygons on cubic lattice.
 * @author Sean A. Irvine
 */
public class A001413 implements Sequence {

  private int mN = 0;
  private final CubicLattice mLattice = new CubicLattice();
  private final long mC = mLattice.neighbour(mLattice.origin(), 0);
  private final ParallelWalker mWalker = new ParallelWalker(8,
    () -> new SelfAvoidingWalker(mLattice),
    () -> new SelfAvoidingCycler(mLattice, true));

  @Override
  public Z next() {
    mN += 2;
    return Z.valueOf(mWalker.count(mN, 6, 1, mLattice.origin(), mC));
  }
}
