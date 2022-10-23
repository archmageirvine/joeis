package irvine.oeis.a033;

import irvine.math.lattice.ExactContactsWalker;
import irvine.math.lattice.Lattices;
import irvine.math.lattice.SelfAvoidingWalker;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A033323 Configurations of linear chains in a square lattice.
 * @author Sean A. Irvine
 */
public class A033323 extends Sequence1 {

  private final SelfAvoidingWalker mWalker = new ExactContactsWalker(Lattices.Z2, 2);
  private final long mX1 = Lattices.Z2.toPoint(1, 0);
  private int mN = 0;

  @Override
  public Z next() {
    return ++mN == 1 ? Z.ZERO : Z.valueOf(mWalker.count(mN, 4, 1, Lattices.Z2.origin(), mX1));
  }
}
