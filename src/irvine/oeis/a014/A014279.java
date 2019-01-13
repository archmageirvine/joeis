package irvine.oeis.a014;

import irvine.math.z.Z;

/**
 * A014279.
 * @author Sean A. Irvine
 */
public class A014279 extends A014278 {

  @Override
  public Z next() {
    super.next();
    return RING.subtract(mB, RING.divide(RING.subtract(RING.pow(mB, 2, mN), mB.substitutePower(2, mN)), Z.TWO)).coeff(mN);
  }
}

