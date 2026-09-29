package irvine.oeis.a086;

import irvine.math.series.AbstractInfiniteSeries;
import irvine.math.series.Series;
import irvine.math.series.SeriesRing;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A086743 Numbers n such that the coefficient of x^n equals 0 in Product_{k&gt;=1} (1 - x^(3^k)).
 * @author Sean A. Irvine
 */
public class A086743 extends Sequence1 {

  private final Series<Z> mSeries = new AbstractInfiniteSeries<>() {
    private Series<Z> mS = SeriesRing.SZ.one();
    private long mK = 3;

    @Override
    public Z coeff(final long n) {
      while (n >= mK) {
        mS = SeriesRing.SZ.multiply(mS, SeriesRing.SZ.oneMinusXToTheN(mK));
        mK *= 3;
      }
      return mS.coeff(n);
    }
  };
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (mSeries.coeff(++mN).isZero()) {
        return Z.valueOf(mN);
      }
    }
  }
}
