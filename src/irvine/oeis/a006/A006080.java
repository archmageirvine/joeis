package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.a003.A003239;

/**
 * A006080 Number of rooted projective plane trees with n nodes.
 * @author Sean A. Irvine
 */
public class A006080 extends A003239 {

  /** Construct the sequence. */
  public A006080() {
    super(1);
  }

  @Override
  public Z next() {
    return Z.ONE.max(super.next().divide2().add(Z.ONE.shiftLeft(mN - 2)));
  }
}

