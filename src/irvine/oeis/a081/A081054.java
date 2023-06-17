package irvine.oeis.a081;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A081054 Crossing matchings: linear chord diagrams with 2n nodes and n arcs in which each arc crosses another arc.
 * @author Sean A. Irvine
 */
public class A081054 extends AbstractSequence {

  /* Construct the sequence. */
  public A081054() {
    super(0);
  }

  protected static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private static final PolynomialRing<Polynomial<Z>> RING2 = new PolynomialRing<>(RING);
  protected final MemoryFactorial mF = MemoryFactorial.SINGLETON;
  private Polynomial<Z> mPsiBarCache = null;
  private int mPsiBarCacheIndex = -1;

  protected Z lambda(final int d, final int k) {
    return Binomial.binomial(2L * d + k - 1, 2L * d).multiply(mF.doubleFactorial(2 * d - 1));
  }

  private Polynomial<Polynomial<Z>> lambdaSeries(final int n) {
    // inner element is x, outer is y
    Polynomial<Polynomial<Z>> series = RING2.zero();
    for (int l = 0; l <= n; ++l) {
      final Z[] t = new Z[n + 1];
      for (int i = 0; i <= n; ++i) {
        t[i] = lambda(i, l + 1);
      }
      series = RING2.add(series, RING2.monomial(Polynomial.create(t), l));
    }
    return series;
  }

  protected Polynomial<Z> psiBarSeries(final int n) {
    // P(x) = L(x, -x * P(x))
    if (n < mPsiBarCacheIndex) {
      return mPsiBarCache;
    }
    final Polynomial<Polynomial<Z>> lamdaSeries = lambdaSeries(n);
    Polynomial<Z> s = RING.one();
    for (int k = 0; k <= n; ++k) {
      s = RING2.eval(lamdaSeries, RING.negate(s.shift(1))).truncate(n);
    }
    mPsiBarCacheIndex = n;
    mPsiBarCache = s;
    return s;
  }

  private int mN = -1;

  @Override
  public Z next() {
    return psiBarSeries(++mN).coeff(mN);
  }
}

