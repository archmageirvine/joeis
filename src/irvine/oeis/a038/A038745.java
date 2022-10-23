package irvine.oeis.a038;

import irvine.math.lattice.ExactContactsWalker;
import irvine.math.lattice.Lattice;
import irvine.math.lattice.Lattices;
import irvine.math.lattice.SelfAvoidingWalker;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A038745 Configurations of linear chains in a 6-dimensional hypercubic lattice.
 * @author Sean A. Irvine
 */
public class A038745 extends Sequence1 {

  private static final Lattice Z6 = Lattices.hypercubic(6);
  // Making this one parallel is harder because seed paths have relaxed constraints
  private final SelfAvoidingWalker mWalker = new ExactContactsWalker(Z6, 1);
  private final long mX1 = Z6.toPoint(0, 0, 0, 0, 0, 1);
  private int mN = 0;

  @Override
  public Z next() {
    return ++mN == 1 ? Z.ZERO : Z.valueOf(mWalker.count(mN, 12, 1, Z6.origin(), mX1));
  }
}
