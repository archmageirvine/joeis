package irvine.oeis.a158;

import irvine.math.series.Series;
import irvine.math.series.SeriesRing;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A158208 Triangle read by rows: p(x,n) = 2 if n = 0, Sum_{i=0..floor((n-1)/2)} binomial(n, i)*(x - 1)^i + x^n*Sum_{i=0..floor((n-1)/2)} binomial(n, i)*(1/x - 1)^i otherwise.
 * @author Sean A. Irvine
 */
public class A158208 extends Sequence0 {

  private static final SeriesRing<Z> SZ = SeriesRing.SZ;
  private int mN = -1;
  private int mM = 0;
  private Series<Z> mS = null;

  private Series<Z> sum1(final int n) {
    Series<Z> sum = SZ.one();
    for (int k = 1; k <= (n - 1) / 2; ++k) {
      sum = SZ.add(sum, SZ.multiply(SZ.pow(Series.create(-1, 1), k), Binomial.binomial(n, k)));
    }
    return sum;
  }

  private Series<Z> sum2(final int n) {
    Series<Z> sum = SZ.monomial(n);
    for (int k = 1; k <= (n - 1) / 2; ++k) {
      sum = SZ.add(sum, SZ.multiply(SZ.shift(SZ.pow(Series.create(1, -1), k), n - k), Binomial.binomial(n, k)));
    }
    return sum;
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      if (++mN == 0) {
        return Z.TWO;
      }
      mM = 0;
      mS = SZ.add(sum1(mN), sum2(mN));
    }
    return mS.coeff(mM);
  }
}
