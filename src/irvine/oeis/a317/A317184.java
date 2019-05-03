package irvine.oeis.a317;

import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.a018.A018193;

/**
 * A317184 Number of <code>"non-connected"</code> chord diagrams of degree n.
 * @author Sean A. Irvine
 */
public class A317184 extends A018193 {

  // After Alexander Stoimenow

  @Override
  protected Z psiTildeBar(final int d) {
    if (d == 0) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    for (int k = 0; k <= d; ++k) {
      sum = sum.signedAdd((k & 1) == 0,
        RING.multiply(
          RING.pow(RING.subtract(psiTildeBarSeries(d - 1), RING.one()), k, d),
          RING.subtract(lambda2Series(k + 1, d), k == 1 ? RING.one() : RING.zero()), d).coeff(d));
    }
    return sum;
  }

  private Polynomial<Z> mPsiTildeBarSeriesCache = null;
  private int mPsiTildeBarSeriesCacheIndex = -1;

  private Polynomial<Z> psiTildeBarSeries(final int n) {
    if (n < 0) {
      return RING.zero();
    }
    if (n > mPsiTildeBarSeriesCacheIndex) {
      final Z[] t = new Z[n + 1];
      for (int k = 0; k <= n; ++k) {
        t[k] = psiTildeBar(k);
      }
      mPsiTildeBarSeriesCache = Polynomial.create(t);
      mPsiTildeBarSeriesCacheIndex = n;
    }
    return mPsiTildeBarSeriesCache;
  }

  @Override
  protected Z xi(final int c, final int d, final int k) {
    if (k > d || k < 0) {
      return Z.ZERO;
    }
    return RING.multiply(RING.pow(RING.subtract(psiTildeBarSeries(d).substitutePower(2, d), RING.one()), k, d),
      lambdaStarSeries(c, k + 1, d), d).coeff(d);
  }

  private Polynomial<Z> xiSeries(final int c, final int k, final int n) {
    final Z[] t = new Z[n + 1];
    for (int d = 0; d <= n; ++d) {
      t[d] = xi(c, d, k);
    }
    return Polynomial.create(t);
  }

  @Override
  protected Z xiBar(final int c, final int d, final int k) {
    final Polynomial<Z> psi2 = psiTildeBarSeries(d).substitutePower(2, d);
    final Polynomial<Z> deriv = RING.diff(psi2.shift(1));
    final Polynomial<Z> a = RING.add(RING.subtract(deriv, RING.multiply(psi2, Z.TWO)), RING.one());
    return RING.multiply(a, xiSeries(c, k - 1, d), d).coeff(d);
  }

  @Override
  protected Z eta(final int c, final int d) {
    Z sum = Z.ZERO;
    for (int k = 1; k <= d; ++k) {
      sum = sum.signedAdd((k & 1) == 1, zeta(c, d, k));
    }
    return sum;
  }

  @Override
  protected Z gammaTilde(final int d, final int c) {
    if (c == 1) {
      return (d & 1) == 0 ? psiTilde(d / 2) : Z.ZERO;
    }
    return eta(c, d);
  }
}

