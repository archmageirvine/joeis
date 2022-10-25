package irvine.oeis.a060;

import java.util.Arrays;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.group.DegreeLimitedPolynomialRingField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A060092 Triangle T(n,k) of k-block ordered bicoverings of an unlabeled n-set, n &gt;= 2, k = 3..n+floor(n/2).
 * @author Sean A. Irvine
 */
public class A060092 extends Sequence2 {

  // After Andrew Howroyd

  private static final PolynomialRingField<Q> INNER = new PolynomialRingField<>("y", Rationals.SINGLETON);
  private static final Polynomial<Q> Y1 = Polynomial.create(Q.ONE, Q.NEG_ONE);
  private static final Polynomial<Q> Y2 = INNER.multiply(Y1, Q.TWO);
  protected static final MemoryFactorial F = MemoryFactorial.SINGLETON;

  private Polynomial<Polynomial<Q>> sum(final PolynomialRingField<Q> inner, final PolynomialRingField<Polynomial<Q>> ring, final int n, final int m) {
    final Polynomial<Q> series = inner.series(inner.one(), Y1, m);
    Polynomial<Polynomial<Q>> sum = ring.zero();
    for (int j = 0; j <= n; ++j) {
      sum = ring.add(sum, ring.monomial(inner.divide(inner.pow(series, (long) j * (j - 1) / 2), new Q(F.factorial(j))), j));
    }
    return sum;
  }

  private Polynomial<Polynomial<Q>> exp(final PolynomialRingField<Q> inner, final PolynomialRingField<Polynomial<Q>> ring, final int n, final int m) {
    final Polynomial<Polynomial<Q>> f = ring.create(Arrays.asList(
      inner.zero(),
      inner.negate(inner.one()),
      inner.negate(inner.series(inner.one(), Y2, m - 1).shift(1))
    ));
    return ring.exp(f, n);
  }

  private Polynomial<Polynomial<Q>> egfCompute(final int n, final int m) {
    final DegreeLimitedPolynomialRingField<Q> inner = new DegreeLimitedPolynomialRingField<>("y", Rationals.SINGLETON, m);
    final PolynomialRingField<Polynomial<Q>> ring = new PolynomialRingField<>(inner);
    return ring.multiply(exp(inner, ring, n, m), sum(inner, ring, n, m), n);
  }

  private Polynomial<Polynomial<Q>> mEgf = null;
  private int mCachedN = -1;
  private int mCachedM = -1;

  protected Polynomial<Polynomial<Q>> egf(final int n, final int m) {
    if (n > mCachedN || m > mCachedM) {
      mEgf = egfCompute(n, m);
      mCachedN = n;
      mCachedM = m;
    }
    return mEgf;
  }

  private int mN = 1;
  private int mM = 3;

  @Override
  public Z next() {
    if (++mM > mN + mN / 2) {
      ++mN;
      mM = 3;
    }
    return egf(mM, mN + mN / 2).coeff(mM).coeff(mN).multiply(F.factorial(mM)).toZ();
  }
}
