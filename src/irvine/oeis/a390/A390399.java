package irvine.oeis.a390;

import irvine.math.q.Q;
import irvine.math.series.Series;
import irvine.math.series.SeriesRing;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A390399 Number of increasing interval-labeled restricted ternary trees on the label set {0,1,...,n}.
 * @author Sean A. Irvine
 */
public class A390399 extends Sequence0 {

  private static final SeriesRing<Q> SQ = SeriesRing.SQ;

  private static int delta(final int n) {
    return (n & 1) == 0 ? n / 2 : 1;
  }

  private static int alpha(final int n) {
    return (n + 1) / 2;
  }

  private int mN = -1;

  private Series<Q> gf(final int n, final int m) {
    if (m == n) {
      return SQ.one();
    }
    final Series<Q> t = SQ.multiply(SQ.monomial(Q.valueOf(alpha(m + 1)), 1), gf(n, m + 1));
    return SQ.divide(SQ.one(), SQ.subtract(SQ.subtract(SQ.one(), SQ.monomial(Q.valueOf(delta(m + 1)), 1)), t));
  }

  @Override
  public Z next() {
    return gf(++mN, 0).coeff(mN).toZ();
  }
}
