package irvine.oeis.a032;

import java.util.ArrayList;
import java.util.List;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A032066 Number of dyslexic rooted planar trees with n nodes where any 2 subtrees extending from the same node are different.
 * @author Sean A. Irvine
 */
public class A032066 extends MemorySequence {

  protected static final PolynomialRingField<Q> Y_RING = new PolynomialRingField<>("y", Rationals.SINGLETON);
  protected static final PolynomialRingField<Polynomial<Q>> RING = new PolynomialRingField<>(Y_RING);

  private final MemorySequence mA = new A032065();
  private final List<Z> mBfk = new ArrayList<>();

  {
    setOffset(1);
    add(null);
    mBfk.add(null);
  }

  static Polynomial<Polynomial<Q>> product(final List<Z> v) {
    Polynomial<Polynomial<Q>> prod = RING.one();
    final Polynomial<Q> t1 = Y_RING.monomial(Q.ONE, 1);
    for (int k = 1; k < v.size(); ++k) {
      final Polynomial<Polynomial<Q>> u = RING.powz(RING.onePlusXToTheN(t1, k), v.get(k), v.size());
      prod = RING.multiply(prod, u, v.size());
    }
    return prod;
  }

  static List<Z> cgk(final List<Z> v) {
    final Polynomial<Polynomial<Q>> prod = product(v);
    final List<Z> res = new ArrayList<>();
    for (final Polynomial<Q> t : prod) {
      res.add(Y_RING.eval(Y_RING.serlaplace(t.shift(-1)), Q.ONE).toZ());
    }
    return res;
  }

  @Override
  protected Z computeNext() {
    mBfk.add(mA.next());
    if (size() < 2) {
      return Z.ONE;
    }
    return cgk(mBfk).get(size() - 1);
  }
}
