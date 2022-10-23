package irvine.oeis.a292;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A292749 Number of 6-good trees with n nodes.
 * @author Sean A. Irvine
 */
public class A292749 extends Sequence0 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private static final Polynomial<Q> C = RING.subtract(RING.exp(RING.x(), 6), RING.one());
  private int mN = 0;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    if (++mN > 1) {
      mF = mF.multiply(mN);
    }
    return RING.reversion(C, mN).coeff(mN).multiply(mF).toZ().abs();
  }
}

