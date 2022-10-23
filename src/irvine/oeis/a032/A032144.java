package irvine.oeis.a032;

import java.util.Arrays;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A032144 Number of ways to partition n labeled elements into pie slices of different sizes.
 * @author Sean A. Irvine
 */
public class A032144 extends Sequence0 {

  protected static final PolynomialRingField<Q> Y_RING = new PolynomialRingField<>("y", Rationals.SINGLETON);
  protected static final PolynomialRingField<Polynomial<Q>> RING = new PolynomialRingField<>(Y_RING);
  private static final Polynomial<Polynomial<Q>> C = RING.monomial(Y_RING.create(Arrays.asList(Q.NEG_ONE, Q.ONE)), 0);

  private int mN = -1;

  protected Polynomial<Polynomial<Q>> product(final int n) {
    Polynomial<Polynomial<Q>> prod = RING.one();
    Q kf = Q.ONE;
    for (int k = 1; k <= n; ++k) {
      kf = kf.divide(k);
      final Polynomial<Q> t1 = Y_RING.monomial(kf, 1);
      final Polynomial<Polynomial<Q>> u = RING.onePlusXToTheN(t1, k);
      prod = RING.multiply(prod, u, n);
    }
    return prod;
  }

  @Override
  public Z next() {
    final Polynomial<Polynomial<Q>> v = RING.add(C, RING.serlaplace(product(++mN)));
    return Y_RING.eval(Y_RING.serlaplace(v.coeff(mN).shift(-1)), Q.ONE).toZ();
  }
}
