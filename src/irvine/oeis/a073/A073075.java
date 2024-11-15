package irvine.oeis.a073;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A073075 Generating function satisfies A(x) = exp(2*A(x)*x + 2*A(x^3)*x^3/3 + 2*A(x^5)*x^5/5 + 2*A(x^7)*x^7/7 +...).
 * @author Sean A. Irvine
 */
public class A073075 extends Sequence0 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private Polynomial<Q> mA = RING.one();
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN > 0) {
      mA = RING.exp(RING.sum(0, mN / 2, k -> RING.multiply(mA.substitutePower(2 * k + 1, mN - 2 * k - 1), new Q(2, 2L * k + 1)).shift(2 * k + 1)), mN);
    }
    return mA.coeff(mN).toZ();
  }
}

