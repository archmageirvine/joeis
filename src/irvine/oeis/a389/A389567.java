package irvine.oeis.a389;

import irvine.math.MemoryFunction1;
import irvine.math.q.Q;
import irvine.math.series.RationalSeriesEnum;
import irvine.math.series.Series;
import irvine.math.series.SeriesRing;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A389567 Number of integer exponents k such that in the expansion in powers of q of (q^(-1/24) * eta(q))^k the term q^n has a zero coefficient and eta is the Dedekind eta function.
 * @author Sean A. Irvine
 */
public class A389567 extends Sequence1 {

  private int mN = 0;
  private final MemoryFunction1<Series<Q>> mE = new MemoryFunction1<>() {
    @Override
    protected Series<Q> compute(final int n) {
      return SeriesRing.SQ.pow(RationalSeriesEnum.ETA.s(), n);
    }
  };

  @Override
  public Z next() {
    ++mN;
    int cnt = 0;
    for (int k = 0; k <= 4 * mN; ++k) {
      final Q c = mE.get(k).coeff(mN);
      if (c.isZero()) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}

