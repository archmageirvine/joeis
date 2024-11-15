package irvine.oeis.a073;

import irvine.math.function.Functions;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A073063 G.f. satisfies: A(x) = exp( Sum_{n&gt;=1} L(n)*A(x^n)*x^n/n ) where L(n) = n-th Lucas number.
 * @author Sean A. Irvine
 */
public class A073063 extends Sequence0 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private Polynomial<Q> mA = RING.one();
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN > 0) {
      mA = RING.exp(RING.sum(1, mN, k -> RING.multiply(mA.substitutePower(k, mN - k), new Q(Functions.LUCAS.z(k), k)).shift(k)), mN);
    }
    return mA.coeff(mN).toZ();
  }
}
