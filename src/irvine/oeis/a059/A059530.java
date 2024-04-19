package irvine.oeis.a059;

import java.util.Arrays;

import irvine.math.factorial.MemoryFactorial;
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
 * A059530 Triangle T(n,k) of k-block T_0-tricoverings of an n-set, n &gt;= 3, k = 0..2*n.
 * @author Sean A. Irvine
 */
public class A059530 extends Sequence3 {

  protected static final MemoryFactorial F = MemoryFactorial.SINGLETON;
  private static final Q NEG_HALF = new Q(-1, 2);
  private int mN = 2;
  private int mM = 4;
  private Polynomial<Polynomial<Q>> mEgf = null;

  protected Polynomial<Polynomial<Q>> get(final int n, final int m) {
    final DegreeLimitedPolynomialRingField<Q> inner = new DegreeLimitedPolynomialRingField<>("y", Rationals.SINGLETON, n + 1);
    final PolynomialRingField<Polynomial<Q>> ring = new PolynomialRingField<>(inner);
    Polynomial<Polynomial<Q>> sum = ring.zero();
    for (int k = 0; k <= 2 * n; ++k) {
      final Polynomial<Q> t = inner.pow(inner.onePlusXToTheN(1), Binomial.binomial(k, 3).longValueExact());
      final Polynomial<Q> u = inner.multiply(inner.pow(inner.onePlusXToTheN(1), k), NEG_HALF);
      final Polynomial<Q> f = inner.monomial(new Q(Z.ONE, Functions.FACTORIAL.z(k)), 0);
      final Polynomial<Polynomial<Q>> exp = ring.exp(ring.monomial(u, 2), m);
      final Polynomial<Polynomial<Q>> s = ring.multiply(ring.multiply(exp, t), f).shift(k);
      sum = ring.add(sum, s);
    }
    final Polynomial<Polynomial<Q>> v = ring.create(Arrays.asList(
      inner.zero(),
      Polynomial.create(Q.NEG_ONE),
      Polynomial.create(Q.HALF),
      Polynomial.create(Q.ZERO, Q.ONE_THIRD)
    ));
    return ring.multiply(sum, ring.exp(v, m), m);
  }

  @Override
  public Z next() {
    if (++mM > 2 * mN) {
      ++mN;
      mM = 0;
      mEgf = get(mN, 2 * mN);
    }
    return mEgf.coeff(mM).coeff(mN).multiply(Functions.FACTORIAL.z(mN)).toZ();
  }
}
