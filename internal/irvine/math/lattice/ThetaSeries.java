package irvine.math.lattice;

import irvine.math.api.Matrix;
import irvine.math.matrix.DefaultMatrix;
import irvine.math.q.Q;
import irvine.math.series.Series;
import irvine.math.series.SeriesRing;
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
    final int n = 84;
    final int wt = n / 2;
    final Series<Q> thetaA2 = Series.create(new A004016());
    final Series<Q> delta6 = Series.create(new A007332());
    final int m = wt / 6;
    final Matrix<Q> mat = new DefaultMatrix<>(m + 1, m + 1, Q.ZERO);
    for (int k = 0; k <= m; ++k) {
      final Series<Q> s = SQ.multiply(SQ.pow(delta6, m - k), SQ.pow(thetaA2, 6 * k));
      for (int j = 0; j <= m; ++j) {
        mat.set(j, k, s.coeff(j));
      }
    }
    System.out.println(mat);
  }
}
