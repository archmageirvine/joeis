package irvine.oeis.a032;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A032057 Doubles (index 2+) under "BGJ" (reversible, element, labeled) transform.
 * @author Sean A. Irvine
 */
public class A032057 extends MemorySequence {

  protected static final PolynomialRingField<Q> Y_RING = new PolynomialRingField<>("y", Rationals.SINGLETON);
  protected static final PolynomialRingField<Polynomial<Q>> RING = new PolynomialRingField<>(Y_RING);
  private static final Polynomial<Polynomial<Q>> Y1 = RING.monomial(Y_RING.negate(Y_RING.oneMinusXToTheN(1)), 0);

  {
    setOffset(1);
    add(null); // seq starts at 1
  }

  protected Polynomial<Polynomial<Q>> product() {
    Polynomial<Polynomial<Q>> prod = RING.one();
    Q kf = Q.ONE;
    for (int k = 1; k < size(); ++k) {
      kf = kf.divide(k);
      final Polynomial<Q> t1 = Y_RING.monomial(kf, 1);
      final Polynomial<Polynomial<Q>> u = RING.powz(RING.onePlusXToTheN(t1, k), a(k), size());
      prod = RING.multiply(prod, u, size());
    }
    return prod;
  }

  @Override
  protected Z computeNext() {
    if (size() < 3) {
      return Z.TWO;
    }
    final Polynomial<Polynomial<Q>> v = RING.add(Y1, RING.serlaplace(product()));
    return Y_RING.eval(Y_RING.serlaplace(v.coeff(size())), Q.ONE).toZ().divide2();
  }
}
