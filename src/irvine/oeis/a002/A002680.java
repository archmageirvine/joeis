package irvine.oeis.a002;

import java.util.Collections;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A002680 Denominators of coefficients of polynomials arising from Chebyshev quadrature.
 * @author Sean A. Irvine
 */
public class A002680 extends Sequence0 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);

  private int mN = -1;

  private Polynomial<Q> s(final int n) {
    final Polynomial<Q> log2 = RING.log1p(RING.negate(RING.x()), n + 1);
    final Polynomial<Q> p1 = RING.subtract(log2, RING.shift(log2, -1));
    final Polynomial<Q> log1 = RING.log1p(RING.x(), n + 1);
    final Polynomial<Q> p2 = RING.add(log1, RING.shift(log1, -1));
    final Polynomial<Q> sum = RING.subtract(RING.add(p1, p2), RING.create(Collections.singletonList(Q.TWO)));
    return RING.exp(RING.multiply(sum, new Q(n, 2)), n);
  }

  private Z lcm(final Polynomial<Q> p) {
    Z lcm = Z.ONE;
    for (int k = 0; k <= p.degree(); ++k) {
      lcm = lcm.lcm(p.coeff(k).den());
    }
    return lcm;
  }

  @Override
  public Z next() {
    final Polynomial<Q> s = s(++mN);
    //System.out.println(s);
    return lcm(s);
  }
}
