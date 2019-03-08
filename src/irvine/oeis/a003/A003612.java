package irvine.oeis.a003;

import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A003612.
 * @author Sean A. Irvine
 */
public class A003612 extends A003611 {

  // Eqn. (1.2.15) in McKeon thesis

  private static final Q M0 = new Q(3, 2);
  private static final Q M1 = new Q(13, 3);

  @Override
  public Z next() {
    super.next(); // updates mN, mT
    final Polynomial<Polynomial<Q>> t2 = innerSubstitute(mT, 2, mN).substitutePower(2, mN);
    return RING_Y.eval(mT.coeff(mN), Q.TWO)
      .add(RING_Y.eval(RING.pow(mT, 3, mN).shift(1).coeff(mN), Q.TWO).divide(6))
      .add(RING_Y.eval(RING.multiply(t2, mT, mN).shift(1).coeff(mN), Q.TWO).multiply(M0))
      .add(RING_Y.eval(t2.coeff(mN), Q.TWO).multiply(M0))
      .add(RING_Y.eval(innerSubstitute(mT, 3, mN).substitutePower(3, mN).shift(1).coeff(mN), Q.TWO).multiply(M1))
      .subtract(RING_Y.eval(RING.pow(mT, 2, mN).coeff(mN), Q.TWO).divide(2))
      .toZ();
  }
}

