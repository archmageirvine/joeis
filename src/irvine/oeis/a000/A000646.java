package irvine.oeis.a000;

import irvine.math.z.Z;

/**
 * A000646.
 * @author Sean A. Irvine
 */
public class A000646 extends A000598 {

  @Override
  public Z next() {
    super.next();
    return RING.pow(mG, 2, mN).coeff(mN).toZ();
  }
}

