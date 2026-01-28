package irvine.math.lattice;

import irvine.math.api.Matrix;
import irvine.math.matrix.DefaultMatrix;
import irvine.math.q.Q;
import irvine.math.series.Series;
import irvine.math.series.SeriesRing;
import irvine.oeis.a002.A002288;
import irvine.oeis.a004.A004011;
import irvine.oeis.a004.A004016;
import irvine.oeis.a007.A007332;

/**
 * Some code to work out Theta series A034652.
 * @author Sean A. Irvine
 */
public final class ThetaSeries {

  private ThetaSeries() { }

  private static final SeriesRing<Q> SQ = SeriesRing.SQ;

  /**
   * Noddy for testing.
   * @param args ignored
   */
  public static void main(final String[] args) {
    final int n = Integer.parseInt(args[0]);
    final int l = args.length > 1 ? Integer.parseInt(args[1]) : 3;
    final int wt = n / 2;
    final int d = l == 3 ? 6 : 8;
    final int a = l == 3 ? 1 : 2;
    final Series<Q> theta = l == 3 ? Series.create(new A004016()) : Series.create(new A004011());
    final Series<Q> delta = l == 3 ? Series.create(new A007332()) : Series.create(new A002288());
    final int m = wt / d;
    final Matrix<Q> mat = new DefaultMatrix<>(m + 1, m + 1, Q.ZERO);
    for (int k = 0; k <= wt / d; ++k) {
      final Series<Q> s = SQ.multiply(SQ.pow(delta, k), SQ.pow(theta, (wt - (long) k * d) / a));
      for (int j = 0; j <= m; ++j) {
        mat.set(j, k, s.coeff(j));
      }
    }
    System.out.println(mat.toString().replace(' ', ',').replace("][", "],["));
  }
}
