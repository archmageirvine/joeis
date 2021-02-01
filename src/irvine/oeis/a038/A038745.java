package irvine.oeis.a038;

import irvine.math.lattice.ExactContactsWalker;
import irvine.math.lattice.Lattices;
import irvine.math.lattice.SelfAvoidingWalker;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A038745 Configurations of linear chains in a 6-dimensional hypercubic lattice.
 * @author Sean A. Irvine
 */
public class A038745 implements Sequence {

  // Making this one parallel is harder because seed paths have relaxed constraints
  private final SelfAvoidingWalker mWalker = new ExactContactsWalker(Lattices.Z6, 1);
  private final long mX1 = Lattices.Z6.toPoint(1, 0, 0, 0, 0, 0);
  private int mN = 0;

  @Override
  public Z next() {
    return ++mN == 1 ? Z.ZERO : Z.valueOf(mWalker.count(mN, 12, 1, Lattices.Z6.origin(), mX1));
  }
}
