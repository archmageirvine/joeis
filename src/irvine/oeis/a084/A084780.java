package irvine.oeis.a084;

import irvine.math.series.Series;
import irvine.math.series.SeriesRing;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A084780 a(n) = sum of absolute-valued coefficients of (1+3*x-x^2)^n.
 * @author Sean A. Irvine
 */
public class A084780 extends Sequence0 {

  private static final Series<Z> S = SeriesRing.SZ.create(Z.ONE, Z.THREE, Z.NEG_ONE);
  private long mN = -1;

  @Override
  public Z next() {
    final Series<Z> s = SeriesRing.SZ.pow(S, ++mN);
    Z sum = Z.ZERO;
    for (long k = 0; k <= 2 * mN; ++k) {
      sum = sum.add(s.coeff(k).abs());
    }
    return sum;
  }
}
