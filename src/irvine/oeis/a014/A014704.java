package irvine.oeis.a014;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.polynomial.ThetaFunctions;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A014704 Expansion of <code>((theta_2)^4+(theta_3)^4)/(Delta_24)^2</code>.
 * @author Sean A. Irvine
 */
public class A014704 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    final Polynomial<Z> theta24 = ThetaFunctions.theta2z4(mN);
    final Polynomial<Z> theta34 = RING.pow(ThetaFunctions.theta3z(mN), 4, mN);
    final Polynomial<Z> delta24 = RING.pow(ThetaFunctions.delta24z(mN + 2).shift(-2), 2, mN);
    return RING.coeff(RING.add(theta24, theta34), delta24, mN);
  }
}

