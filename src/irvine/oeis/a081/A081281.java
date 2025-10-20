package irvine.oeis.a081;

import java.util.ArrayList;

import irvine.math.q.Q;
import irvine.math.series.Series;
import irvine.math.series.SeriesRing;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A081281 Square array of binomial transforms of Chebyshev polynomial coefficients.
 * @author Sean A. Irvine
 */
public class A081281 extends Sequence0 {

  private static final SeriesRing<Q> SQ = SeriesRing.SQ;
  private static final Series<Q> S1 = SQ.create(Q.ONE, Q.NEG_ONE);
  private static final Series<Q> S2 = SQ.create(Q.ONE, Q.valueOf(-2));
  private static final Series<Q> S3 = SQ.create(Q.ONE, Q.valueOf(-3));
  private int mN = -1;
  private int mM = -1;
  private final ArrayList<Series<Q>> mS = new ArrayList<>();

  private Z s(final int n, final int m) {
    while (n >= mS.size()) {
      final int t = mS.size();
      mS.add(SQ.divide(SQ.multiply(S2, SQ.pow(S1, t - 1)), SQ.pow(S3, t + 1)));
    }
    return mS.get(n).coeff(m).toZ();
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return s(mN - mM, mM);
  }
}

