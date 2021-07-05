package irvine.oeis.a038;

import irvine.math.lattice.ExactContactsWalker;
import irvine.math.lattice.Lattice;
import irvine.math.lattice.Lattices;
import irvine.math.lattice.SelfAvoidingWalker;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A038729 Configurations of linear chains in a 6-dimensional hypercubic lattice.
 * @author Sean A. Irvine
 */
public class A038729 implements Sequence {

  private static final Lattice Z6 = Lattices.hypercubic(6);
  private final SelfAvoidingWalker mWalker = new ExactContactsWalker(Z6, 0);
  private final long mX1 = Z6.toPoint(0, 0, 0, 0, 0, 1);
  private int mN = 0;

  @Override
  public Z next() {
    return ++mN == 1 ? Z.valueOf(12) : Z.valueOf(mWalker.count(mN, 12, 1, Z6.origin(), mX1));
  }
}
