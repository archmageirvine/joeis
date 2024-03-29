package irvine.oeis.a014;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.polynomial.ThetaFunctions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A014703 Expansion of ((theta_2)^4+(theta_3)^4)/Delta_24.
 * @author Sean A. Irvine
 */
public class A014703 extends Sequence0 {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    final Polynomial<Z> theta24 = ThetaFunctions.theta2z4(mN);
    final Polynomial<Z> theta34 = RING.pow(ThetaFunctions.theta3z(mN), 4, mN);
    final Polynomial<Z> delta24 = ThetaFunctions.delta24z(mN + 2).shift(-2);
    return RING.coeff(RING.add(theta24, theta34), delta24, mN);
  }
}

