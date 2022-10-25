package irvine.oeis.a032;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A032235 Number of dyslexic rooted compound windmills with n nodes where any 2 submills extending from the same node are different.
 * @author Sean A. Irvine
 */
public class A032235 extends MemorySequence {

  protected static final PolynomialRingField<Q> Y_RING = new PolynomialRingField<>("y", Rationals.SINGLETON);
  protected static final PolynomialRingField<Polynomial<Q>> RING = new PolynomialRingField<>(Y_RING);
  protected static final Polynomial<Polynomial<Q>> Y1 = RING.monomial(Y_RING.negate(Y_RING.oneMinusXToTheN(1)), 0);
  protected static final Polynomial<Q> T = Y_RING.monomial(Q.ONE, 1);

  {
    setOffset(1);
    add(null);
  }

  protected Polynomial<Polynomial<Q>> product() {
    Polynomial<Polynomial<Q>> prod = RING.one();
    for (int k = 1; k < size(); ++k) {
      final Polynomial<Polynomial<Q>> u = RING.powz(RING.onePlusXToTheN(T, k), a(k), size());
      prod = RING.multiply(prod, u, size());
    }
    return RING.subtract(prod, RING.one());
  }

  protected Z start() {
    return Z.ONE;
  }

  @Override
  protected Z computeNext() {
    if (size() <= 2) {
      return start();
    }
    final Polynomial<Polynomial<Q>> v = RING.add(Y1, product());
    final Polynomial<Q> p = v.coeff(size() - 1);
    return Y_RING.eval(Y_RING.serlaplace(p.shift(-1)), Q.ONE).add(p.coeff(1)).add(p.coeff(2)).divide(2).toZ();
  }
}
