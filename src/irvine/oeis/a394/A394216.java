package irvine.oeis.a394;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.polynomial.PolynomialUtils;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A394216 allocated for Yury Belousov.
 * @author Sean A. Irvine
 */
public class A394216 extends Sequence0 {

  private static final PolynomialRingField<Z> INNER = new PolynomialRingField<>("t", IntegerField.SINGLETON);
  private static final PolynomialRingField<Polynomial<Z>> RING = new PolynomialRingField<>(INNER);
  private static final Polynomial<Polynomial<Z>> TWO = RING.monomial(INNER.monomial(Z.TWO, 0), 0);
  private static final Polynomial<Polynomial<Z>> ONE_PLUS_T = RING.monomial(INNER.onePlusXToTheN(1), 0);

  private int mN = -1;
  private int mM = 0;

  private Polynomial<Z> oneMinusTPowMinus(final long k, final long maxT) {
    // (1 - t)^(-k)
    final Polynomial<Z> res = INNER.empty();
    for (long j = 0; j <= maxT; ++j) {
      res.add(Binomial.binomial(k + j - 1, j));
    }
    return res;
  }

  private Polynomial<Polynomial<Z>> sOdd(final Polynomial<Polynomial<Z>> p, final int maxX, final int maxT) {
    Polynomial<Polynomial<Z>> result = RING.zero();
    for (long m = 0; 2 * m + 1 <= maxX; ++m) {
      final Polynomial<Z> coeff = INNER.multiply(oneMinusTPowMinus(2 * m + 2, maxT), Z.TWO);
      final Polynomial<Polynomial<Z>> term = RING.multiply(RING.pow(p, 2L * m + 1), coeff);
      result = RING.add(result, term);
    }
    // subtract 2*p
    result = RING.subtract(result, RING.multiply(p, TWO));
    return PolynomialUtils.deepTruncate(result, maxX, maxT);
  }

  private Polynomial<Polynomial<Z>> sEven(final Polynomial<Polynomial<Z>> p, final int maxX, final int maxT) {
    Polynomial<Polynomial<Z>> result = RING.zero();
    for (int m = 0; 2 * m <= maxX; ++m) {
      final Polynomial<Z> coeff = oneMinusTPowMinus(2L * m + 1, maxT);
      final Polynomial<Polynomial<Z>> term = RING.multiply(RING.pow(p, 2L * m), coeff);
      result = RING.add(result, term);
    }
    // subtract (1 + t)
    result = RING.subtract(result, ONE_PLUS_T);
    return PolynomialUtils.deepTruncate(result, maxX, maxT);
  }

  private Z t(final int n, final int k) {
    final int maxX = n - k;
    Polynomial<Polynomial<Z>> lam = RING.zero();
    for (int i = 0; i < n + 2; ++i) {
      final Polynomial<Polynomial<Z>> halfLam = RING.divide(lam, Polynomial.create(Z.TWO));
      lam = sOdd(RING.add(RING.x(), halfLam), maxX, k);
    }
    final Polynomial<Polynomial<Z>> halfLam = RING.divide(lam, Polynomial.create(Z.TWO));
    final Polynomial<Polynomial<Z>> p = RING.add(RING.x(), halfLam);
    final Polynomial<Polynomial<Z>> result = RING.add(RING.add(RING.add(lam, sEven(p, maxX, k)), RING.x()), ONE_PLUS_T);
    if (maxX <= result.degree()) {
      final Polynomial<Z> c = result.coeff(maxX);
      if (k <= c.degree()) {
        return c.coeff(k);
      }
    }
    return Z.ZERO;
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return t(mN, mM);
  }
}
