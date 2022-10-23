package irvine.oeis.a008;

import irvine.math.group.QPolynomialRing;
import irvine.math.polynomial.QPolynomial;
import irvine.math.polynomial.ThetaFunctions;
import irvine.math.q.Q;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A008655 Theta series of direct sum of 4 copies of hexagonal lattice.
 * @author Sean A. Irvine
 */
public class A008655 extends Sequence0 {

  private static final QPolynomialRing<Z> RING = new QPolynomialRing<>(Integers.SINGLETON);
  private Q mN = Q.NEG_ONE;

  protected int copies() {
    return 4;
  }

  @Override
  public Z next() {
    mN = mN.add(Q.ONE);
    final QPolynomial<Z> t3 = ThetaFunctions.theta3(mN);
    final QPolynomial<Z> t33 = t3.substitutePower(3);
    final QPolynomial<Z> t2 = ThetaFunctions.theta2(mN);
    final QPolynomial<Z> t23 = t2.substitutePower(3);
    final QPolynomial<Z> s = RING.add(RING.multiply(t3, t33, mN), RING.multiply(t2, t23, mN));
    return RING.pow(s, copies(), mN).coeff(mN);
  }
}
