package irvine.oeis.a079;

import java.util.ArrayList;
import java.util.List;

import irvine.math.series.AbstractInfiniteSeries;
import irvine.math.series.Series;
import irvine.math.series.SeriesRing;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A079499 Total number of parts in all partitions of n into distinct odd parts.
 * @author Sean A. Irvine
 */
public class A079499 extends Sequence0 {

  private static final SeriesRing<Z> SZ = SeriesRing.SZ;
  private int mN = -1;
  private final Series<Z> mS = new AbstractInfiniteSeries<>() {
    private Series<Z> mProd = SZ.one();
    private final List<Series<Z>> mSums = new ArrayList<>();
    private int mK = 0;

    @Override
    public Z coeff(final int n) {
      while (n * n > mK) {
        mProd = SZ.multiply(mProd, SZ.oneMinusXToTheN(2 * ++mK));
        mSums.add(SZ.divide(SZ.monomial(Z.valueOf(mK), mK * mK), mProd));
      }
      return Integers.SINGLETON.sum(0, mSums.size() - 1, k -> mSums.get(k).coeff(n));
    }
  };

  @Override
  public Z next() {
    return mS.coeff(++mN);
  }
}
