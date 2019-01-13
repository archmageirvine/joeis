package irvine.oeis.a008;

import irvine.math.group.QPolynomialRing;
import irvine.math.polynomial.QPolynomial;
import irvine.math.polynomial.ThetaFunctions;
import irvine.math.q.Q;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A008665.
 * @author Sean A. Irvine
 */
public class A008665 implements Sequence {

  private static final QPolynomialRing<Z> RING = new QPolynomialRing<>(Integers.SINGLETON);
  private static final Q QUARTER = Q.ONE_QUARTER;
  private Q mN = QUARTER.negate();

  protected int copies() {
    return 2;
  }

  @Override
  public Z next() {
    mN = mN.add(QUARTER);
    final QPolynomial<Z> t1 = RING.pow(ThetaFunctions.theta2(mN), 3, mN);
    final QPolynomial<Z> t2 = RING.pow(ThetaFunctions.theta3(mN), 3, mN);
    return RING.pow(RING.add(t1, t2), copies(), mN).coeff(mN);
  }
}
