package irvine.oeis.a032;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A032023 "AGK" (ordered, elements, unlabeled) transform of 2,2,2,2...
 * @author Sean A. Irvine
 */
public class A032023 extends Sequence1 {

  // AGK

  protected static final PolynomialRingField<Q> Y_RING = new PolynomialRingField<>("y", Rationals.SINGLETON);
  protected static final PolynomialRingField<Polynomial<Q>> RING = new PolynomialRingField<>(Y_RING);

  private int mN = 0;

  protected Polynomial<Polynomial<Q>> product(final int n) {
    Polynomial<Polynomial<Q>> prod = RING.one();
    for (int k = 1; k <= n; ++k) {
      final Polynomial<Polynomial<Q>> u = RING.pow(RING.onePlusXToTheN(Y_RING.x(), k), 2, n);
      prod = RING.multiply(prod, u, n);
    }
    return RING.subtract(prod, RING.one());
  }

  @Override
  public Z next() {
    final Polynomial<Polynomial<Q>> v = product(++mN);
    return Y_RING.eval(Y_RING.serlaplace(v.coeff(mN)), Q.ONE).toZ();
  }
}
