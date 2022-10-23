package irvine.oeis.a005;

import irvine.math.group.QPolynomialRing;
import irvine.math.polynomial.QPolynomial;
import irvine.math.polynomial.ThetaFunctions;
import irvine.math.q.Q;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A005925 Theta series of diamond.
 * @author Sean A. Irvine
 */
public class A005925 extends Sequence0 {

  private static final QPolynomialRing<Z> RING = new QPolynomialRing<>(Integers.SINGLETON);

  private Q mN = Q.ONE_QUARTER.negate();

  @Override
  public Z next() {
    mN = mN.add(Q.ONE_QUARTER);
    final QPolynomial<Z> theta2 = ThetaFunctions.theta2(mN);
    final QPolynomial<Z> theta3 = ThetaFunctions.theta3(mN);
    final QPolynomial<Z> theta4 = ThetaFunctions.theta4(mN);
    final QPolynomial<Z> t = RING.add(RING.add(RING.pow(theta2, 3, mN), RING.pow(theta3, 3, mN)), RING.pow(theta4, 3, mN));
    return t.coeff(mN).divide2();
  }
}
