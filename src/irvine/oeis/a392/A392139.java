package irvine.oeis.a392;

import irvine.math.series.Series;
import irvine.math.series.SeriesRing;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A392139 Number of ways to write n^4 as an ordered sum of n fourth powers of integers.
 * @author Sean A. Irvine
 */
public class A392139 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Series<Z> s = SeriesRing.SZ.one();
    for (int j = 1; j <= mN; ++j) {
      s = SeriesRing.SZ.add(s, SeriesRing.SZ.monomial(Z.TWO, j * j * j * j));
    }
    s = SeriesRing.SZ.pow(s, mN);
    return s.coeff(mN * mN * mN * mN);
  }
}
