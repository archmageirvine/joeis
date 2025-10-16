package irvine.oeis.a389;

import irvine.math.q.Q;
import irvine.math.series.Series;
import irvine.math.series.SeriesParser;
import irvine.math.series.SeriesRing;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A081210.
 * @author Sean A. Irvine
 */
public class A389749 extends Sequence0 {

  private static final SeriesRing<Q> SQ = SeriesRing.SQ;
  private static final Series<Q> S0 = SeriesParser.parse("(3-3*x)/(2*x^2-6*x+3)");
  private static final Series<Q> S1 = SeriesParser.parse("3/(2*x^2-6*x+3)");
  private static final Series<Q> S = SeriesParser.parse("((1-3*x)-sqrt(5*x^2-6*x+1))/(2*x)");
  private int mN = 0;
  private int mM = -1;

  private Q t(final int n, final int m) {
    if (m == 0) {
      return S0.coeff(n);
    }
    return SQ.multiply(S1, SQ.pow(S, m - 1)).coeff(n - 1);
  }

  protected Z select(final Q n) {
    return n.num();
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return select(t(mN, mM));
  }
}
