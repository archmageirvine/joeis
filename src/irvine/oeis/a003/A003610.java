package irvine.oeis.a003;

import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A003610 Symmetries in unrooted <code>(1,3)</code> trees on <code>2n</code> vertices.
 * @author Sean A. Irvine
 */
public class A003610 extends A003609 {

  private static final Q M0 = new Q(3, 2);
  private static final Q M1 = new Q(13, 3);

  {
    super.next();
  }

  @Override
  public Z next() {
    super.next(); // updates mN, mT
    final Polynomial<Q> a = RING.pow(mT, 2, mN).coeff(mN);
    final Polynomial<Q> b = RING.pow(mT, 3, mN).coeff(mN);
    final Polynomial<Q> c = innerSubstitute(mT, 2, mN).substitutePower(2, mN).coeff(mN);
    final Polynomial<Q> d = innerSubstitute(mT, 3, mN).substitutePower(3, mN).coeff(mN);
    return RING_Y.eval(a, Q.TWO).divide(Q.TWO)
      .subtract(RING_Y.eval(b, Q.TWO).divide(Q.THREE))
      .add(RING_Y.eval(c, Q.TWO).multiply(M0))
      .add(RING_Y.eval(d, Q.TWO).multiply(M1))
      .toZ();
  }
}

