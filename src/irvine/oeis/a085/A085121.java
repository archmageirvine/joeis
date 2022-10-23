package irvine.oeis.a085;

import irvine.math.group.QPolynomialRing;
import irvine.math.polynomial.ThetaFunctions;
import irvine.math.q.Q;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A085121 Number of ways of writing n as the sum of three odd squares.
 * @author Sean A. Irvine
 */
public class A085121 extends Sequence0 {

  private static final QPolynomialRing<Z> RING = new QPolynomialRing<>(Integers.SINGLETON);
  private Q mN = Q.ONE_QUARTER.negate();

  @Override
  public Z next() {
    mN = mN.add(Q.ONE_QUARTER);
    return RING.pow(ThetaFunctions.theta2(mN), 3, mN).coeff(mN);
  }
}
