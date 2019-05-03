package irvine.oeis.a008;

import irvine.math.group.QPolynomialRing;
import irvine.math.polynomial.ThetaFunctions;
import irvine.math.q.Q;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A008436 Theta series of <code>{D_9}^{+}</code> packing.
 * @author Sean A. Irvine
 */
public class A008436 implements Sequence {

  private static final QPolynomialRing<Z> RING = new QPolynomialRing<>(Integers.SINGLETON);
  private Q mN = Q.ONE_QUARTER.negate();

  @Override
  public Z next() {
    mN = mN.add(Q.ONE_QUARTER);
    return RING.pow(ThetaFunctions.theta2(mN), 9, mN).coeff(mN)
      .add(RING.pow(ThetaFunctions.theta3(mN), 9, mN).coeff(mN))
      .add(RING.pow(ThetaFunctions.theta4(mN), 9, mN).coeff(mN))
      .divide2();
  }
}
