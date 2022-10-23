package irvine.oeis.a049;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A049214 Scaled coefficients of (arctanh x)^3.
 * @author Sean A. Irvine
 */
public class A049214 extends Sequence0 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = 1;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    mN += 2;
    mF = mF.multiply(mN).multiply(mN - 1);
    return RING.pow(RING.atanh(RING.x(), mN), 3, mN).coeff(mN).multiply(mF).toZ().divide(6);
  }
}
