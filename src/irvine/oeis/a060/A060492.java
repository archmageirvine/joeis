package irvine.oeis.a060;

import java.util.Arrays;

import irvine.math.function.Functions;
import irvine.math.group.DegreeLimitedPolynomialRingField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence3;

/**
 * A060492 Triangle T(n,k) of k-block ordered tricoverings of an unlabeled n-set (n &gt;= 3, k = 4..2n).
 * @author Sean A. Irvine
 */
public class A060492 extends Sequence3 {

  // After Andrew Howroyd

  private int mN = 2;
  private int mM = 4;
  private Polynomial<Polynomial<Q>> mGf = null;

  private Polynomial<Polynomial<Q>> t(final int n) {
    final int m = 2 * n;
    final DegreeLimitedPolynomialRingField<Q> inner = new DegreeLimitedPolynomialRingField<>("y", Rationals.SINGLETON, n);
    final PolynomialRingField<Polynomial<Q>> ring = new PolynomialRingField<>(inner);
    final Polynomial<Q> a = inner.series(inner.x(), inner.multiply(inner.oneMinusXToTheN(1), Q.THREE), n);
    final Polynomial<Polynomial<Q>> exp = ring.exp(ring.create(Arrays.asList(inner.zero(), Polynomial.create(Q.NEG_ONE), Polynomial.create(Q.HALF), a)), m);
    Polynomial<Polynomial<Q>> sum = ring.zero();
    for (int k = 0; k <= m; ++k) {
      final Polynomial<Q> b = inner.series(inner.one(), inner.pow(inner.oneMinusXToTheN(1), Binomial.binomial(k, 3).intValueExact(), m), m);
      final Polynomial<Q> c = inner.series(inner.one(), inner.multiply(inner.pow(inner.oneMinusXToTheN(1), k, m), Q.TWO), m);
      final Polynomial<Polynomial<Q>> e = ring.exp(ring.monomial(inner.negate(c), 2), m);
      sum = ring.add(sum, ring.multiply(ring.multiply(e, b), inner.monomial(new Q(Z.ONE, Functions.FACTORIAL.z(k)), 0)).shift(k));
    }
    return ring.serlaplace(ring.multiply(exp, sum, m));
  }

  @Override
  public Z next() {
    if (++mM > 2 * mN) {
      mGf = t(++mN);
      mM = 4;
    }
    return mGf.get(mM).get(mN).toZ();
  }
}
