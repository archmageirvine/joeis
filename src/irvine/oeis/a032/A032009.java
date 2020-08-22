package irvine.oeis.a032;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A032009 Number of planted planar trees (n+1 nodes) where any 2 subtrees extending from the same node have a different number of nodes.
 * @author Sean A. Irvine
 */
public class A032009 extends MemorySequence {

  protected static final PolynomialRingField<Q> Y_RING = new PolynomialRingField<>("y", Rationals.SINGLETON);
  private static final PolynomialRingField<Polynomial<Q>> RING = new PolynomialRingField<>(Y_RING);

  {
    add(null); // seq starts at 1
  }

  protected Polynomial<Polynomial<Q>> product() {
    Polynomial<Polynomial<Q>> prod = RING.one();
    for (int k = 1; k < size(); ++k) {
      final Q kf2 = new Q(get(k));
      final Polynomial<Q> t1 = Y_RING.monomial(kf2, 1);
      final Polynomial<Polynomial<Q>> u = RING.onePlusXToTheN(t1, k);
      prod = RING.multiply(prod, u, size());
    }
    return prod;
  }

  @Override
  protected Z computeNext() {
    if (size() < 2) {
      return Z.ONE;
    }
    final Polynomial<Polynomial<Q>> v = product();
    return Y_RING.eval(Y_RING.serlaplace(v.coeff(size() - 1)), Q.ONE).toZ();
  }
}
