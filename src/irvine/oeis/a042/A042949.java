package irvine.oeis.a042;

import irvine.math.lattice.ExactContactsWalker;
import irvine.math.lattice.Lattices;
import irvine.math.lattice.SelfAvoidingWalker;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A042949 Configurations of linear chains in a 4-dimensional hypercubic lattice.
 * @author Sean A. Irvine
 */
public class A042949 extends Sequence1 {

  private final SelfAvoidingWalker mWalker = new ExactContactsWalker(Lattices.Z4, 1);
  private final long mX1 = Lattices.Z4.toPoint(1, 0, 0, 0);
  private int mN = 0;

  @Override
  public Z next() {
    return ++mN == 1 ? Z.ZERO : Z.valueOf(mWalker.count(mN, 8, 1, Lattices.Z4.origin(), mX1));
  }
}
