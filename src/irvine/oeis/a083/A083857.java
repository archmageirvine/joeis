package irvine.oeis.a083;

import java.util.ArrayList;

import irvine.math.series.Series;
import irvine.math.series.SeriesRing;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A083857 Square array T(n,k) of binomial transforms of generalized Fibonacci numbers, read by ascending antidiagonals, with n, k &gt;= 0.
 * @author Sean A. Irvine
 */
public class A083857 extends Sequence0 {

  private static final SeriesRing<Z> SZ = SeriesRing.SZ;
  private int mN = 0;
  private int mM = -1;
  private final ArrayList<Series<Z>> mRows = new ArrayList<>();

  private Z t(final int n, final int m) {
    while (n >= mRows.size()) {
      mRows.add(SZ.divide(SZ.x(), SZ.create(Z.ONE, Z.valueOf(-3), Z.valueOf(2 - n))));
    }
    return mRows.get(n).coeff(m);
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return t(mN - mM, mM);
  }
}
