package irvine.math.series;

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * Enumeration of specific rational power series.
 * @author Sean A. Irvine
 */
public enum RationalSeriesEnum {

  /** exp(x). */
  EXP(new AbstractInfiniteSeries<>() {
    @Override
    public Q coeff(final int n) {
      return new Q(Z.ONE, Functions.FACTORIAL.z(n));
    }
  }),
  /** Dedekind eta(x). */
  ETA(new AbstractInfiniteSeries<>() {
    private Series<Q> mEta = SeriesRing.SQ.oneMinusXToTheN(1);
    private int mK = 1;

    @Override
    public Q coeff(final int n) {
      while (n > mK) {
        mEta = SeriesRing.SQ.multiply(mEta, SeriesRing.SQ.oneMinusXToTheN(++mK));
      }
      return mEta.coeff(n);
    }
  }),
  /** log(1+x). */
  LOG1P(new AbstractInfiniteSeries<>() {
    @Override
    public Q coeff(final int n) {
      return n == 0 ? Q.ZERO : new Q(Z.NEG_ONE.pow(n + 1), n);
    }
  }),
  /** sin(x). */
  SIN(new AbstractInfiniteSeries<>() {
    @Override
    public Q coeff(final int n) {
      return (n & 1) == 0 ? Q.ZERO : new Q(Z.NEG_ONE.pow(n >>> 1), Functions.FACTORIAL.z(n));
    }
  }),
  ;
  /*
      final RingFactorial<E> f = RingFactorial.instance(mElementField);
    Polynomial<E> s = zero();
    if (!zero().equals(p)) {
      for (int k = 1; k <= n; k += 2) {
        final Polynomial<E> u = divide(pow(p, k, n), f.factorial(k));
        s = signedAdd((k & 2) == 0, s, u);
      }
    }

   */

  private final Series<Q> mSeries;

  RationalSeriesEnum(final Series<Q> series) {
    mSeries = series;
  }

  /**
   * Return the actual series.
   * @return series
   */
  public Series<Q> s() {
    return mSeries;
  }
}
