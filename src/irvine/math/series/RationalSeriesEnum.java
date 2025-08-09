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
  })
  ;

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
