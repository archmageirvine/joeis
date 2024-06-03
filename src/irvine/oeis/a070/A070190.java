package irvine.oeis.a070;

import irvine.math.function.Functions;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.polynomial.PolynomialUtils;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A070190 Expansion of e.g.f. I_0(2*x)^5 + 2*Sum_{k&gt;=1} I_k(2*x)^5, where I_n(z) are modified Bessel functions of order n.
 * @author Sean A. Irvine
 */
public class A070190 extends Sequence0 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private static final Polynomial<Q> X2 = Polynomial.create(Q.ZERO, Q.TWO);
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Polynomial<Q> sum = RING.zero();
    for (int k = 0; k <= mN; ++k) {
      final Polynomial<Q> besselI = RING.divide(RING.substitute(PolynomialUtils.besselI(k, mN - k), X2, mN - k).shift(k), Q.valueOf(Functions.FACTORIAL.z(k)));
      sum = RING.add(sum, RING.multiply(RING.pow(besselI, 5, mN), k > 0 ? Q.TWO : Q.ONE));
    }
    return RING.serlaplace(sum).coeff(mN).toZ();
  }
}
