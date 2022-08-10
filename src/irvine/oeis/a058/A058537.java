package irvine.oeis.a058;

import irvine.math.z.Z;

/**
 * A058537 McKay-Thompson series of class 18b for the Monster group.
 * @author Sean A. Irvine
 */
public class A058537 extends A058092 {

  @Override
  public Z next() {
    super.next();
    return RING.sqrt(mGf, mN).coeff(mN).toZ();
  }
}
