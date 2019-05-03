package irvine.oeis.a000;

import irvine.math.z.Z;

/**
 * A000649 Number of alkyls <code>C_{n+15} H_{2n+10}</code> (Phenan) with n carbon atoms.
 * @author Sean A. Irvine
 */
public class A000649 extends A000598 {

  @Override
  public Z next() {
    super.next();
    return RING.add(RING.pow(mG, 10, mN), RING.pow(mG.substitutePower(2, mN), 5, mN)).coeff(mN).divide(2).toZ();
  }
}

