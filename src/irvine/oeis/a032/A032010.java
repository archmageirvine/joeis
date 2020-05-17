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
 * A032010 Number of rooted planar trees where any 2 subtrees extending from same node have a different number of nodes.
 * @author Sean A. Irvine
 */
public class A032010 extends MemorySequence {

  private static final PolynomialRingField<Q> Y_RING = new PolynomialRingField<>("y", Rationals.SINGLETON);
  private static final PolynomialRingField<Polynomial<Q>> RING = new PolynomialRingField<>(Y_RING);

  private List<Z> mAfk = new ArrayList<>();

  {
    add(null); // seq starts at 1
    mAfk.add(null);
  }

  private static Polynomial<Polynomial<Q>> product(final List<Z> v) {
    Polynomial<Polynomial<Q>> prod = RING.one();
    for (int k = 1; k < v.size(); ++k) {
      final Polynomial<Polynomial<Q>> u = RING.onePlusXToTheN(Y_RING.monomial(new Q(v.get(k)), 1), k);
      prod = RING.multiply(prod, u, v.size());
    }
    prod = RING.subtract(prod, RING.one());
    return prod;
  }

  private List<Z> afk(final List<Z> v) {
    final Polynomial<Polynomial<Q>> prod = product(v);
    final List<Z> res = new ArrayList<>();
    for (final Polynomial<Q> t : prod) {
      res.add(Y_RING.eval(Y_RING.serlaplace(t), Q.ONE).toZ());
    }
    return res;
  }

  static List<Z> cfk(final List<Z> v) {
    final Polynomial<Polynomial<Q>> prod = product(v);
    final List<Z> res = new ArrayList<>();
    for (final Polynomial<Q> t : prod) {
      res.add(Y_RING.eval(Y_RING.serlaplace(t.shift(-1)), Q.ONE).toZ());
    }
    return res;
  }

  @Override
  protected Z computeNext() {
    if (size() < 4) {
      mAfk.add(Z.ONE);
      return Z.ONE;
    }
    mAfk = afk(mAfk);
    mAfk.add(1, Z.ONE);
    return cfk(mAfk).get(size() - 1);
  }
}
