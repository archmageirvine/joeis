package irvine.oeis.a015;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.polynomial.PolynomialUtils;
import irvine.math.polynomial.ThetaFunctions;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A015665 Expansion of e.g.f. theta_3^(3/2).
 * @author Sean A. Irvine
 */
public class A015665 extends Sequence0 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -1;
  private Z mF = Z.ONE;

  protected int power() {
    return 3;
  }

  @Override
  public Z next() {
    if (++mN > 1) {
      mF = mF.multiply(mN);
    }
    final Polynomial<Q> egf = RING.sqrt(RING.pow(PolynomialUtils.zToQ(ThetaFunctions.theta3z(mN)), power(), mN), mN);
    return egf.coeff(mN).multiply(mF).toZ();
  }
}
