package irvine.oeis.a012;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A012869 Numerator of <code>[x^(2n+1)]</code> in the Taylor series <code>arccos(cot(x)*arcsinh(x))= x-x^3/15 +4*x^5/75 -2098*x^7/70875 +2969*x^9/141750 -35380322*x^11/2280403125 +..</code>.
 * @author Sean A. Irvine
 */
public class A012869 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -1;

  protected Z select(final Q n) {
    return n.num();
  }

  private Polynomial<Q> acos(final Polynomial<Q> f, final int n) {
    // acos(x) = asin(sqrt(1-x^2))
    // some contortions to get the sqrt to work
    final Polynomial<Q> sqrt = RING.sqrt(RING.subtract(RING.one(), RING.pow(f, 2, n + 2)), n);
    return RING.asin(sqrt, n);
  }

  @Override
  public Z next() {
    mN += 2;
    if (mN == 1) {
      return select(Q.ONE);
    }
    final Polynomial<Q> inner = RING.multiply(RING.xcot(RING.x(), mN + 2), RING.asinh(RING.x(), mN + 2), mN + 2).shift(-1);
    final Polynomial<Q> series = acos(inner, mN);
    return select(series.coeff(mN));
  }
}
