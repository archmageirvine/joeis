package irvine.oeis.a032;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;

/**
 * A032030 Number of series-reduced planted planar trees with n leaves of 2 colors where any 2 subtrees extending from the same node are different.
 * @author Sean A. Irvine
 */
public class A032030 extends MemorySequence {

  protected static final PolynomialRingField<Q> Y_RING = new PolynomialRingField<>("y", Rationals.SINGLETON);
  protected static final PolynomialRingField<Polynomial<Q>> RING = new PolynomialRingField<>(Y_RING);

  {
    setOffset(1);
    add(null); // seq starts at 1
  }

  protected Polynomial<Polynomial<Q>> product() {
    Polynomial<Polynomial<Q>> prod = RING.one();
    for (int k = 1; k < size(); ++k) {
      final Polynomial<Polynomial<Q>> u = RING.powz(RING.onePlusXToTheN(Y_RING.x(), k), a(k), size());
      prod = RING.multiply(prod, u, size());
    }
    return RING.subtract(prod, RING.one());
  }

  @Override
  protected Z computeNext() {
    if (size() < 3) {
      return Z.TWO;
    }
    final Polynomial<Polynomial<Q>> v = product();
    return Y_RING.eval(Y_RING.serlaplace(v.coeff(size())), Q.ONE).toZ();
  }
}
