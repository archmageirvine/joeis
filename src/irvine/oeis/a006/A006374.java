package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a003.A003636;

/**
 * A006374 Number of positive definite reduced binary quadratic forms of discriminant -4*n.
 * @author Sean A. Irvine
 */
public class A006374 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    mN -= 4;
    return Z.valueOf(A003636.forms(mN).size());
  }
}
