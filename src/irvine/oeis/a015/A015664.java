package irvine.oeis.a015;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.polynomial.PolynomialUtils;
import irvine.math.polynomial.ThetaFunctions;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A015664 Expansion of e.g.f. <code>theta_3^(1/2)</code>.
 * @author Sean A. Irvine
 */
public class A015664 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -1;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    if (++mN > 1) {
      mF = mF.multiply(mN);
    }
    final Polynomial<Q> egf = RING.sqrt(PolynomialUtils.zToQ(ThetaFunctions.theta3z(mN)), mN);
    return egf.coeff(mN).multiply(mF).toZ();
  }
}
