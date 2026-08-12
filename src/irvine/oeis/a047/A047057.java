package irvine.oeis.a047;

import irvine.math.lattice.ExactContactsWalker;
import irvine.math.lattice.Lattices;
import irvine.math.lattice.SelfAvoidingWalker;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A047057 Number of n-step self-avoiding walks on the simple cubic lattice having exactly 1 pair of nonconsecutive vertices that are adjacent in the lattice.
 * @author Sean A. Irvine
 */
public class A047057 extends Sequence1 {

  private final SelfAvoidingWalker mWalker = new ExactContactsWalker(Lattices.Z3, 1);
  private final long mX1 = Lattices.Z3.toPoint(1, 0, 0);
  private int mN = 0;

  @Override
  public Z next() {
    return ++mN == 1 ? Z.ZERO : Z.valueOf(mWalker.count(mN, 6, 1, Lattices.Z3.origin(), mX1));
  }
}
