package irvine.oeis.a056;

import irvine.math.cr.CR;
import irvine.math.z.Z;

/**
 * A056581 Nearest integer to 1/(A056580(n) - exp(sqrt(n)*Pi)).
 * @author Sean A. Irvine
 */
public class A056581 extends A056580 {

  {
    super.next(); // skip 0
  }

  @Override
  public int getOffset() {
    return 1;
  }

  @Override
  public Z next() {
    return CR.valueOf(super.next()).subtract(CR.PI.multiply(CR.valueOf(mN).sqrt()).exp()).inverse().round();
  }
}
