package irvine.oeis.a236;

import irvine.math.MemoryFunction1;
import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.series.RationalSeriesEnum;
import irvine.math.series.Series;
import irvine.math.series.SeriesRing;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A236396 Triangle read by rows: T(n,k) = number of rooted labeled trees with n nodes and height &lt;= k, for n &gt;= 1, 0 &lt;= k &lt;= n-1.
 * @author Sean A. Irvine
 */
public class A236396 extends Sequence1 {

  private static final SeriesRing<Q> SQ = SeriesRing.SQ;
  private final MemoryFunction1<Series<Q>> mGf = new MemoryFunction1<>() {
    @Override
    protected Series<Q> compute(final int n) {
      return n == 0 ? SQ.x() : SQ.shift(RationalSeriesEnum.EXP.s(get(n - 1)), 1);
    }
  };
  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM >= mN) {
      ++mN;
      mM = 0;
    }
    return mGf.get(mM).coeff(mN).multiply(Functions.FACTORIAL.z(mN)).toZ();
  }
}

