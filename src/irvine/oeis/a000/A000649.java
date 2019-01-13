package irvine.oeis.a000;

import irvine.math.z.Z;

/**
 * A000649.
 * @author Sean A. Irvine
 */
public class A000649 extends A000598 {

  @Override
  public Z next() {
    super.next();
    return RING.add(RING.pow(mG, 10, mN), RING.pow(mG.substitutePower(2, mN), 5, mN)).coeff(mN).divide(2).toZ();
  }
}

