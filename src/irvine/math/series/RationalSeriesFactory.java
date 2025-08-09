package irvine.math.series;

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * Specific rational power series.
 * @author Sean A. Irvine
 */
public final class RationalSeriesFactory {

  // todo make as an enum to reflect in SeriesParser?
  // todo move Dedekind Eta here
  // todo make lambda for infinite?

  private RationalSeriesFactory() {
  }

  /** exp(x) */
  public static final Series<Q> EXP = new Series<Q>() {
    @Override
    public Q coeff(final int n) {
      return new Q(Z.ONE, Functions.FACTORIAL.z(n));
    }

    @Override
    public int bound() {
      return Integer.MAX_VALUE;
    }
  };
}
