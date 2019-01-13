package irvine.oeis.a008;

import irvine.math.group.QPolynomialRing;
import irvine.math.polynomial.ThetaFunctions;
import irvine.math.q.Q;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A008434.
 * @author Sean A. Irvine
 */
public class A008434 implements Sequence {

  private static final QPolynomialRing<Z> RING = new QPolynomialRing<>(Integers.SINGLETON);
  private Q mN = Q.HALF.negate();

  @Override
  public Z next() {
    mN = mN.add(Q.HALF);
    return RING.pow(ThetaFunctions.theta2(mN), 6, mN).coeff(mN)
      .add(RING.pow(ThetaFunctions.theta3(mN), 6, mN).coeff(mN))
      .add(RING.pow(ThetaFunctions.theta4(mN), 6, mN).coeff(mN))
      .divide2();
  }
}
