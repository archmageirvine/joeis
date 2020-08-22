package irvine.oeis.a032;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A032027 Number of planted planar trees (n+1 nodes) where any 2 subtrees extending from the same node are different.
 * @author Sean A. Irvine
 */
public class A032027 extends MemorySequence {

  protected static final PolynomialRingField<Q> Y_RING = new PolynomialRingField<>("y", Rationals.SINGLETON);
  protected static final PolynomialRingField<Polynomial<Q>> RING = new PolynomialRingField<>(Y_RING);

  {
    add(null); // seq starts at 1
  }

  protected Polynomial<Polynomial<Q>> product() {
    Polynomial<Polynomial<Q>> prod = RING.one();
    for (int k = 1; k < size(); ++k) {
      final Polynomial<Polynomial<Q>> u = RING.powz(RING.onePlusXToTheN(Y_RING.x(), k), get(k), size());
      prod = RING.multiply(prod, u, size());
    }
    return RING.subtract(prod, RING.one());
  }

  protected int shift() {
    return 1;
  }

  @Override
  protected Z computeNext() {
    if (size() < 3) {
      return Z.ONE;
    }
    final Polynomial<Polynomial<Q>> v = product();
    return Y_RING.eval(Y_RING.serlaplace(v.coeff(size() - shift())), Q.ONE).toZ();
  }
}
