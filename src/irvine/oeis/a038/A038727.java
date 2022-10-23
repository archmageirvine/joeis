package irvine.oeis.a038;

import irvine.math.lattice.ExactContactsWalker;
import irvine.math.lattice.Lattices;
import irvine.math.lattice.SelfAvoidingWalker;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A038727 Configurations of linear chains in a 5-dimensional hypercubic lattice.
 * @author Sean A. Irvine
 */
public class A038727 extends Sequence1 {

  // Making this one parallel is harder because seed paths have relaxed constraints
  private final SelfAvoidingWalker mWalker = new ExactContactsWalker(Lattices.Z5, 1);
  private final long mX1 = Lattices.Z5.toPoint(1, 0, 0, 0, 0);
  private int mN = 0;

  @Override
  public Z next() {
    return ++mN == 1 ? Z.ZERO : Z.valueOf(mWalker.count(mN, 10, 1, Lattices.Z5.origin(), mX1));
  }
}
