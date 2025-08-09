package irvine.oeis.a002;

import irvine.math.q.Q;
import irvine.math.series.AbstractInfiniteSeries;
import irvine.math.series.Series;
import irvine.math.series.SeriesRing;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A002073 Numerators of coefficients in an asymptotic expansion of the confluent hypergeometric function F(1-b; 2; 4b).
 * @author Sean A. Irvine
 */
public class A002073 extends Sequence0 {

  private final Series<Q> mGf = SeriesRing.SQ.reversion(SeriesRing.SQ.shift(SeriesRing.SQ.powE(new AbstractInfiniteSeries<>() {
    @Override
    public Q coeff(final int n) {
      return (n & 1) == 1 ? Q.ZERO : new Q(3, n + 3);
    }
  }, Q.ONE_THIRD), 1));
  private int mN = 0;

  protected Z select(final Q v) {
    return v.num();
  }

  @Override
  public Z next() {
    ++mN;
    return select(mGf.coeff(2 * mN - 1).multiply(2L * mN - 1));
  }
}
