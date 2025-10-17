package irvine.oeis.a389;

import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.series.Series;
import irvine.math.series.SeriesParser;
import irvine.math.series.SeriesRing;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A389739 Triangle read by rows: numerators of the almost-Riordan array ( (-6*x - 3 - 3*sqrt(12*x^2 - 8*x + 1))/(8*x^2 - 3*x - 3 + (3*x - 3)*sqrt(12*x^2 - 8*x + 1)) | 6/(3*(1 - x)*sqrt(12*x^2 - 8*x + 1) - 8*x^2 + 3*x + 3), (1 - 4*x - sqrt(12*x^2 - 8*x + 1))/(2*x) ).
 * @author Sean A. Irvine
 */
public class A389739 extends Sequence0 {

  private static final SeriesRing<Q> SQ = SeriesRing.SQ;
  private static final Series<Q> R = SeriesParser.parse("sqrt(12*x^2-8*x+1)");
  private static final Series<Q> R0 = SQ.multiply(Polynomial.create("3*x-3"), R);
  private static final Series<Q> S0 = SQ.divide(SQ.subtract(Polynomial.create("-6*x-3"), SQ.multiply(R, Q.THREE)), SQ.add(Polynomial.create("8*x^2-3*x-3)"), R0));
  private static final Series<Q> R1 = SQ.multiply(Polynomial.create("3-3*x"), R);
  private static final Series<Q> S1 = SQ.divide(Polynomial.create("6"), SQ.add(R1, Polynomial.create("-8*x^2+3*x+3")));
  private static final Series<Q> S = SQ.divide(SQ.subtract(Polynomial.create("1-4*x"), R), Polynomial.create("2*x"));
  private int mN = 0;
  private int mM = -1;

  private Q t(final int n, final int m) {
    if (m == 0) {
      return S0.coeff(n);
    }
    return SQ.multiply(S1, SQ.pow(S, m - 1)).coeff(n - 1);
  }

  protected Z select(final Q n) {
    return n.num();
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return select(t(mN, mM));
  }
}
