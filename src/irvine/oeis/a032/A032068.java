package irvine.oeis.a032;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A032068 Number of series-reduced dyslexic planted planar trees with n leaves of 2 colors where any 2 subtrees extending from the same node are different.
 * @author Sean A. Irvine
 */
public class A032068 extends MemorySequence {

  protected static final PolynomialRingField<Q> Y_RING = new PolynomialRingField<>("y", Rationals.SINGLETON);
  protected static final PolynomialRingField<Polynomial<Q>> RING = new PolynomialRingField<>(Y_RING);
  protected static final Polynomial<Polynomial<Q>> Y1 = RING.monomial(Y_RING.negate(Y_RING.oneMinusXToTheN(1)), 0);

  {
    setOffset(1);
    add(null);
  }

  protected Polynomial<Polynomial<Q>> product() {
    Polynomial<Polynomial<Q>> prod = RING.one();
    final Polynomial<Q> t1 = Y_RING.monomial(Q.ONE, 1);
    for (int k = 1; k < size(); ++k) {
      final Polynomial<Polynomial<Q>> u = RING.powz(RING.onePlusXToTheN(t1, k), a(k), size());
      prod = RING.multiply(prod, u, size());
    }
    return prod;
  }

  @Override
  protected Z computeNext() {
    if (size() < 2) {
      return Z.TWO;
    }
    final Polynomial<Polynomial<Q>> v = RING.add(Y1, product());
    return Y_RING.eval(Y_RING.serlaplace(v.coeff(size())), Q.ONE).toZ().divide2();
  }
}
