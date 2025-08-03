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

  private RationalSeriesFactory() {
  }

  /** exp(x) */
  public static final Series<Q> EXP = n -> new Q(Z.ONE, Functions.FACTORIAL.z(n));

}
