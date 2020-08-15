package irvine.oeis.a033;

import irvine.math.lattice.ExactContactsWalker;
import irvine.math.lattice.SquareLattice;
import irvine.math.lattice.SelfAvoidingWalker;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A033323 Configurations of linear chains in a square lattice.
 * @author Sean A. Irvine
 */
public class A033323 implements Sequence {

  private final SquareLattice mSquareLattice = new SquareLattice();
  // Making this one parallel is harder because seed paths have relaxed constraints
  private final SelfAvoidingWalker mWalker = new ExactContactsWalker(mSquareLattice, 2);
  private final long mX1 = mSquareLattice.toPoint(1, 0);
  private int mN = 0;

  @Override
  public Z next() {
    return ++mN == 1 ? Z.ZERO : Z.valueOf(mWalker.count(mN, 4, 1, mSquareLattice.origin(), mX1));
  }
}
