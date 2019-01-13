package irvine.oeis.a000;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A000647.
 * @author Sean A. Irvine
 */
public class A000647 extends A000598 {

  @Override
  public Z next() {
    super.next();
    return RING.add(RING.pow(mG, 8, mN), RING.multiply(RING.pow(mG.substitutePower(2, mN), 4, mN), Q.THREE)).coeff(mN).divide(4).toZ();
  }
}

