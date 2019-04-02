package irvine.oeis.a000;

import irvine.math.z.Z;

/**
 * A000650 Number of alkyls S C_{n+4} H_{2n+4} with n carbon atoms.
 * @author Sean A. Irvine
 */
public class A000650 extends A000598 {

  @Override
  public Z next() {
    super.next();
    return RING.add(RING.pow(mG, 4, mN), RING.pow(mG.substitutePower(2, mN), 2, mN)).coeff(mN).divide(2).toZ();
  }
}

