package irvine.oeis.a032;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A032218 Number of dyslexic rooted compound windmills with n nodes where any 2 submills extending from the same node are different sizes.
 * @author Sean A. Irvine
 */
public class A032218 extends MemorySequence {

  protected static final PolynomialRingField<Q> Y_RING = new PolynomialRingField<>("y", Rationals.SINGLETON);
  protected static final PolynomialRingField<Polynomial<Q>> RING = new PolynomialRingField<>(Y_RING);
  private static final Polynomial<Polynomial<Q>> Y1 = RING.monomial(Y_RING.negate(Y_RING.oneMinusXToTheN(1)), 0);

  {
    setOffset(1);
    add(null);
  }

  protected Polynomial<Polynomial<Q>> product() {
    Polynomial<Polynomial<Q>> prod = RING.one();
    for (int k = 1; k < size(); ++k) {
      final Polynomial<Polynomial<Q>> u = RING.onePlusXToTheN(Y_RING.monomial(new Q(a(k)), 1), k);
      prod = RING.multiply(prod, u, size());
    }
    return prod;
  }

  @Override
  protected Z computeNext() {
    if (size() <= 3) {
      return Z.ONE;
    }
    final Polynomial<Polynomial<Q>> v = RING.add(Y1, product());
    final Polynomial<Q> p = v.coeff(size() - 1);
    return Y_RING.eval(Y_RING.serlaplace(p.shift(-1)), Q.ONE).add(p.coeff(1)).add(p.coeff(2)).divide(2).toZ();
  }
}
