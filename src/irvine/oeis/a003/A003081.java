package irvine.oeis.a003;

import irvine.math.z.Z;

/**
 * A003081.
 * @author Sean A. Irvine
 */
public class A003081 extends A003080 {

  @Override
  public Z next() {
    super.next();
    return A003080.RING.add(mB, RING.divide(RING.subtract(mB.substitutePower(3, mN), RING.pow(mB, 3)), Z.THREE)).coeff(mN);
  }
}

