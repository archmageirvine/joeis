package irvine.oeis.a006;

import irvine.math.lattice.ManhattanLattice;
import irvine.math.lattice.ParallelWalker;
import irvine.math.lattice.SelfAvoidingCycler;
import irvine.math.lattice.SelfAvoidingWalker;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006781 Number of polygons of length <code>4n</code> on Manhattan lattice.
 * @author Sean A. Irvine
 */
public class A006781 implements Sequence {

  private int mN = 0;
  private final ManhattanLattice mLattice = new ManhattanLattice();
  private final long mC = mLattice.neighbour(mLattice.origin(), 0);
  private final ParallelWalker mWalker = new ParallelWalker(8,
    () -> new SelfAvoidingWalker(mLattice),
    () -> new SelfAvoidingCycler(mLattice, true));

  @Override
  public Z next() {
    return Z.valueOf(mWalker.count(4 * ++mN, 1, 3, mLattice.origin(), mC)).divide(mN);
  }
}
