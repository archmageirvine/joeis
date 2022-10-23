package irvine.oeis.a029;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.polynomial.ThetaFunctions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A029769 Expansion of eta(q^2)^12 / theta_3(q)^3 in powers of q.
 * @author Sean A. Irvine
 */
public class A029769 extends Sequence1 {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    final Polynomial<Z> eta = RING.pow(RING.eta(RING.x(), mN / 2).substitutePower(2, mN), 12, mN);
    final Polynomial<Z> theta3 = RING.pow(ThetaFunctions.theta3z(mN), 3, mN);
    return RING.coeff(eta, theta3, mN);
  }
}
