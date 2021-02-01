package irvine.oeis.a047;

import irvine.math.lattice.ExactContactsWalker;
import irvine.math.lattice.Lattices;
import irvine.math.lattice.SelfAvoidingWalker;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A047057 Number of configurations of linear chains in a cubic lattice.
 * @author Sean A. Irvine
 */
public class A047057 implements Sequence {

  private final SelfAvoidingWalker mWalker = new ExactContactsWalker(Lattices.Z3, 1);
  private final long mX1 = Lattices.Z3.toPoint(1, 0, 0);
  private int mN = 0;

  @Override
  public Z next() {
    return ++mN == 1 ? Z.ZERO : Z.valueOf(mWalker.count(mN, 6, 1, Lattices.Z3.origin(), mX1));
  }
}
