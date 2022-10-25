package irvine.oeis.a032;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A032213 Shifts left under "DFJ" (bracelet, size, labeled) transform.
 * @author Sean A. Irvine
 */
public class A032213 extends MemorySequence {

  protected static final PolynomialRingField<Q> Y_RING = new PolynomialRingField<>("y", Rationals.SINGLETON);
  protected static final PolynomialRingField<Polynomial<Q>> RING = new PolynomialRingField<>(Y_RING);
  protected static final Polynomial<Polynomial<Q>> Y1 = RING.monomial(Y_RING.negate(Y_RING.oneMinusXToTheN(1)), 0);

  {
    setOffset(1);
    add(null);
  }

  protected Polynomial<Polynomial<Q>> product() {
    Polynomial<Polynomial<Q>> prod = RING.one();
    Q f = Q.ONE;
    for (int k = 1; k < size(); ++k) {
      f = f.divide(new Q(k));
      final Polynomial<Polynomial<Q>> u = RING.onePlusXToTheN(Y_RING.monomial(f.multiply(get(k)), 1), k);
      prod = RING.multiply(prod, u, size());
    }
    return prod;
  }

  @Override
  protected Z computeNext() {
    if (size() <= 2) {
      return Z.ONE;
    }
    final Polynomial<Polynomial<Q>> v = RING.add(Y1, RING.serlaplace(product()));
    final Polynomial<Q> p = v.coeff(size() - 1);
    return Y_RING.eval(Y_RING.serlaplace(p.shift(-1)), Q.ONE).add(p.coeff(1)).add(p.coeff(2)).toZ().divide2();
  }
}
