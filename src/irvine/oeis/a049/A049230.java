package irvine.oeis.a049;

import irvine.math.lattice.ExactContactsWalker;
import irvine.math.lattice.Lattices;
import irvine.math.lattice.SelfAvoidingWalker;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A049230 Configurations of linear chains in a cubic lattice.
 * @author Sean A. Irvine
 */
public class A049230 implements Sequence {

  private final SelfAvoidingWalker mWalker = new ExactContactsWalker(Lattices.Z3, 2);
  private final long mX1 = Lattices.Z3.toPoint(1, 0, 0);
  private int mN = 0;

  @Override
  public Z next() {
    return ++mN == 1 ? Z.ZERO : Z.valueOf(mWalker.count(mN, 6, 1, Lattices.Z3.origin(), mX1));
  }
}
