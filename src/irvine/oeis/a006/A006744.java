package irvine.oeis.a006;

import irvine.math.lattice.ManhattanLattice;
import irvine.math.lattice.ParallelWalker;
import irvine.math.lattice.SelfAvoidingWalker;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006744 Number of <code>n-step self-avoiding</code> walks on a Manhattan lattice.
 * @author Sean A. Irvine
 */
public class A006744 implements Sequence {

  private final ManhattanLattice mManhattanLattice = new ManhattanLattice();
  private final ParallelWalker mWalker = new ParallelWalker(8, () -> new SelfAvoidingWalker(mManhattanLattice));
  private final long mX1 = mManhattanLattice.toPoint(1, 0);
  private int mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(mWalker.count(++mN, 1, 3, mManhattanLattice.origin(), mX1));
  }
}
