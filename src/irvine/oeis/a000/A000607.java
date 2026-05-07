package irvine.oeis.a000;

import irvine.factor.prime.Fast;
import irvine.math.series.AbstractInfiniteSeries;
import irvine.math.series.Series;
import irvine.math.series.SeriesRing;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A000607 Number of partitions of n into prime parts.
 * @author Sean A. Irvine
 */
public class A000607 extends Sequence0 {

  private static final SeriesRing<Z> SZ = SeriesRing.SZ;
  private long mN = -1;
  protected final Series<Z> mS = SZ.divide(SZ.one(), new AbstractInfiniteSeries<>() {
    private final Fast mPrime = new Fast();
    private long mP = 1;
    private Series<Z> mProd = SZ.one();

    @Override
    public Z coeff(final long n) {
      while (n > mP) {
        mP = mPrime.nextPrime(mP);
        mProd = SZ.multiply(mProd, SZ.oneMinusXToTheN(mP));
      }
      return mProd.coeff(n);
    }
  });

  @Override
  public Z next() {
    return mS.coeff(++mN);
  }
}

