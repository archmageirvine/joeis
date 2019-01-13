package irvine.oeis.a000;

import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A000648.
 * @author Sean A. Irvine
 */
public class A000648 extends A000598 {

  // A(x) = (r(x)^10+r(x)^2*r(x^2)^4+2*r(x^2)^5)/4

  @Override
  public Z next() {
    super.next();
    final Polynomial<Q> mgs = mG.substitutePower(2, mN);
    return RING.add(RING.add(RING.pow(mG, 10, mN), RING.multiply(RING.pow(mgs, 4, mN), RING.pow(mG, 2, mN))), RING.multiply(RING.pow(mgs, 5, mN), Q.TWO)).coeff(mN).divide(4).toZ();
  }
}

