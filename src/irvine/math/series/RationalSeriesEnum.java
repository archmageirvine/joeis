package irvine.math.series;

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.z.Binomial;
import irvine.math.z.Z;

/**
 * Enumeration of specific rational power series.
 * @author Sean A. Irvine
 */
public enum RationalSeriesEnum {

  // Note: Because SeriesParser uses reflection to find these functions, the names should
  // match common use (up to case). This means for example we use ELLIPTICK rather than
  // ELLIPTIC_K.

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
  /** asin(x). */
  ASIN(new AbstractInfiniteSeries<>() {
    @Override
    public Q coeff(final int n) {
      return (n & 1) == 0 ? Q.ZERO : new Q(Binomial.binomial(n - 1, n / 2), Z.valueOf(n).shiftLeft(n - 1));
    }
  }),
  /** acos(x) - Pi/2. */
  ACOS1(SeriesRing.SQ.negate(ASIN.s())),
  /** atan(x). */
  ATAN(new AbstractInfiniteSeries<>() {
    @Override
    public Q coeff(final int n) {
      return (n & 1) == 0 ? Q.ZERO : new Q(((n / 2) & 1) == 0 ? 1 : -1, n);
    }
  }),
  /** sinh(x). */
  SINH(new AbstractInfiniteSeries<>() {
    @Override
    public Q coeff(final int n) {
      return (n & 1) == 0 ? Q.ZERO : new Q(1, Functions.FACTORIAL.z(n));
    }
  }),
  /** cosh(x). */
  COSH(new AbstractInfiniteSeries<>() {
    @Override
    public Q coeff(final int n) {
      return (n & 1) == 1 ? Q.ZERO : new Q(1, Functions.FACTORIAL.z(n));
    }
  }),
  /** tanh(x). */
  TANH(SeriesRing.SQ.divide(SINH.s(), COSH.s())),
  /** sech(x). */
  SECH(SeriesRing.SQ.divide(SeriesRing.SQ.one(), COSH.s())),
  /** x * csch(x). */
  XCSCH(SeriesRing.SQ.divide(SeriesRing.SQ.x(), SINH.s())),
  /** x * coth(x). */
  XCOTH(SeriesRing.SQ.divide(SeriesRing.SQ.x(), TANH.s())),
  /** asinh(x). */
  ASINH(new AbstractInfiniteSeries<>() {
    @Override
    public Q coeff(final int n) {
      return (n & 1) == 0 ? Q.ZERO : new Q(Binomial.binomial(n - 1, n / 2).multiply(Z.NEG_ONE.pow(n / 2)), Z.valueOf(n).shiftLeft(n - 1));
    }
  }),
  /** atanh(x). */
  ATANH(new AbstractInfiniteSeries<>() {
    @Override
    public Q coeff(final int n) {
      return (n & 1) == 0 ? Q.ZERO : new Q(1, n);
    }
  }),
  /** LambertW(x). */
  LAMBERTW(new AbstractInfiniteSeries<>() {
    @Override
    public Q coeff(final int n) {
      return new Q(Z.NEG_ONE.pow(n + 1).multiply(Z.valueOf(n).pow(n - 1)), Functions.FACTORIAL.z(n));
    }
  }),
  /** elliptic K(x) multiplied by 2/Pi. */
  ELLIPTICK(new AbstractInfiniteSeries<>() {
    @Override
    public Q coeff(final int n) {
      return (n & 1) == 0 ? new Q(Functions.FACTORIAL.z(n), Functions.FACTORIAL.z(n / 2).square().shiftLeft(n)).square() : Q.ZERO;
    }
  }),
  /** elliptic E(x) multiplied by 2/Pi. */
  ELLIPTICE(new AbstractInfiniteSeries<>() {
    @Override
    public Q coeff(final int n) {
      return (n & 1) == 0 ? new Q(Functions.FACTORIAL.z(n), Functions.FACTORIAL.z(n / 2).square().shiftLeft(n)).square().divide(1 - n) : Q.ZERO;
    }
  }),
  /** elliptic D(x) multiplied by 1/Pi. */
  ELLIPTICD(new AbstractInfiniteSeries<>() {
    @Override
    public Q coeff(final int n) {
      final int m = n + 2;
      return (n & 1) == 0 ? new Q(Functions.FACTORIAL.z(m), Functions.FACTORIAL.z(m / 2).square().shiftLeft(m)).square().multiply(m / 2).divide(m - 1) : Q.ZERO;
    }
  }),
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

  /**
   * Return the series substituted with another series.
   * @return series
   */
  public Series<Q> s(final Series<Q> t) {
    return SeriesRing.SQ.substitute(mSeries, t);
  }
}
