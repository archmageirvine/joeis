package irvine.oeis.a060;

import java.util.Arrays;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.group.DegreeLimitedPolynomialRingField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A060517 Triangle T(n,k) of series-reduced (or homeomorphically irreducible) graphs with loops on n labeled nodes and with k edges, k=0..binomial(n+1,2).
 * @author Sean A. Irvine
 */
public class A060517 extends Sequence0 {

  protected static final PolynomialRingField<Q> INNER = new PolynomialRingField<>("y", Rationals.SINGLETON);
  private static final PolynomialRingField<Polynomial<Q>> RING = new PolynomialRingField<>(INNER);
  private static final Polynomial<Polynomial<Q>> OPYX = RING.onePlusXToTheN(INNER.x(), 1); // 1 + x * y
  private static final Polynomial<Q> Y1 = INNER.onePlusXToTheN(1);
  private static final MemoryFactorial F = MemoryFactorial.SINGLETON;
  private Polynomial<Polynomial<Q>> mEgf = RING.one();
  private int mN = 0;
  private int mM = -1;

  protected Polynomial<Polynomial<Q>> t(final int n) {
    final int m = n * (n + 1) / 2;
    final DegreeLimitedPolynomialRingField<Q> inner = new DegreeLimitedPolynomialRingField<>("y", Rationals.SINGLETON, m);
    final PolynomialRingField<Polynomial<Q>> ring = new PolynomialRingField<>(inner);
    final Polynomial<Polynomial<Q>> sqrt = ring.series(ring.one(), ring.sqrt1p(ring.monomial(inner.x(), 1), n), n);
    final Polynomial<Polynomial<Q>> exp = ring.exp(ring.create(Arrays.asList(inner.zero(), inner.monomial(Q.HALF.negate(), 1), inner.monomial(Q.ONE_QUARTER.negate(), 2))), n);
    final Polynomial<Polynomial<Q>> se = ring.multiply(sqrt, exp, n);
    // sum((1 + y)^binomial(k + 1, 2) * exp( - y^2 * x * k^2/(2 * (1 + y * x)) + y^2 * x * k/2) * x^k/k!,k=0..n)
    Polynomial<Polynomial<Q>> sum = ring.zero();
    for (int k = 0; k <= n; ++k) {
      final Polynomial<Polynomial<Q>> f = ring.series(ring.monomial(inner.monomial(new Q((long) k * k, 2), 2), 1), OPYX, n - k); // (k^2/2)y^2x / (1+xy)
      final Polynomial<Polynomial<Q>> g = ring.monomial(inner.monomial(new Q(k, 2), 2), 1); // (k/2)y^2x
      final Polynomial<Polynomial<Q>> e = ring.exp(ring.subtract(g, f), n - k);
      final Polynomial<Polynomial<Q>> a = ring.multiply(e, inner.pow(Y1, (long) k * (k + 1) / 2));
      final Q invkf = new Q(Z.ONE, F.factorial(k)); // 1/k!
      final Polynomial<Polynomial<Q>> c = ring.multiply(a.shift(k), inner.monomial(invkf, 0));
      sum = ring.add(sum, c);
    }
    return ring.multiply(se, sum, n);
  }

  @Override
  public Z next() {
    if (++mM > mN * (mN + 1) / 2) {
      ++mN;
      mM = 0;
      mEgf = t(mN);
    }
    return mEgf.coeff(mN).coeff(mM).multiply(F.factorial(mN)).toZ();
  }
}
