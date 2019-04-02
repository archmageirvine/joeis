package irvine.oeis.a008;

import irvine.math.group.QPolynomialRing;
import irvine.math.polynomial.ThetaFunctions;
import irvine.math.q.Q;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A008453 Number of ways of writing n as a sum of 11 squares.
 * @author Sean A. Irvine
 */
public class A008453 implements Sequence {

  private static final QPolynomialRing<Z> RING = new QPolynomialRing<>(Integers.SINGLETON);
  private Q mN = Q.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(Q.ONE);
    return RING.pow(ThetaFunctions.theta3(mN), 11, mN).coeff(mN);
  }
}
