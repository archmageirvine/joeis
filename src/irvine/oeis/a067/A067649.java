package irvine.oeis.a067;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A067649 Numerators of power series for sqrt(1+x^2)/sqrt(1-x).
 * @author Sean A. Irvine
 */
public class A067649 extends Sequence0 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private static final Polynomial<Q> X2 = RING.x().shift(1);
  private int mN = -1;

  @Override
  public Z next() {
    return RING.coeff(RING.sqrt1p(X2, ++mN), RING.sqrt1m(RING.x(), mN), mN).num();
  }
}
