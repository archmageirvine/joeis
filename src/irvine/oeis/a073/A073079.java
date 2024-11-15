package irvine.oeis.a073;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A073079 Generating function satisfies A(x) = exp(A(x)x + 3A(x^2)x^2/2 + A(x^3)x^3/3 + 3A(x^4)x^4/4 +...).
 * @author Sean A. Irvine
 */
public class A073079 extends Sequence0 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private Polynomial<Q> mA = RING.one();
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN > 0) {
      mA = RING.exp(RING.sum(1, mN, k -> RING.multiply(mA.substitutePower(k, mN - k), new Q((k & 1) == 0 ? 3 : 1, k)).shift(k)), mN);
    }
    return mA.coeff(mN).toZ();
  }
}
