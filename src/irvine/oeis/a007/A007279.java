package irvine.oeis.a007;

import irvine.math.function.Functions;
import irvine.math.series.AbstractInfiniteSeries;
import irvine.math.series.Series;
import irvine.math.series.SeriesRing;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence0;

/**
 * A007279 Number of partitions of n into partition numbers.
 * @author Sean A. Irvine
 */
public class A007279 extends Sequence0 implements DirectSequence {

  private static final SeriesRing<Z> SZ = SeriesRing.SZ;
  private int mN = -1;
  private final Series<Z> mSeries = new AbstractInfiniteSeries<>() {
    private Series<Z> mS = SZ.one();
    private long mK = 1;

    @Override
    public Z coeff(final long n) {
      while (Functions.PARTITIONS.l(mK) <= n) {
        mS = SZ.divide(mS, SZ.oneMinusXToTheN(Functions.PARTITIONS.l(mK)));
        ++mK;
      }
      return mS.coeff(n);
    }
  };

  @Override
  public Z next() {
    return mSeries.coeff(++mN);
  }

  @Override
  public Z a(final Z n) {
    return mSeries.coeff(n.longValueExact());
  }

  @Override
  public Z a(final long n) {
    return mSeries.coeff(n);
  }
}
