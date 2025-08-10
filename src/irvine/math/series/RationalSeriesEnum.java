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
  /** cos(x). */
  COS(new AbstractInfiniteSeries<>() {
    @Override
    public Q coeff(final int n) {
      return (n & 1) == 1 ? Q.ZERO : new Q(Z.NEG_ONE.pow(n >>> 1), Functions.FACTORIAL.z(n));
    }
  }),
  /** tan(x). */
  TAN(SeriesRing.SQ.divide(SIN.s(), COS.s())),
  /** sec(x). */
  SEC(SeriesRing.SQ.divide(SeriesRing.SQ.one(), COS.s())),
  /** x * csc(x). */
  XCSC(SeriesRing.SQ.divide(SeriesRing.SQ.x(), SIN.s())),
  /** x * cot(x). */
  XCOT(SeriesRing.SQ.divide(SeriesRing.SQ.x(), TAN.s())),
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
