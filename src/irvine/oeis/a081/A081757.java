package irvine.oeis.a081;

import irvine.math.q.Q;
import irvine.math.series.AbstractInfiniteSeries;
import irvine.math.series.Series;
import irvine.math.series.SeriesRing;
import irvine.oeis.gf.GfSequence;

/**
 * A081757 Number of ways to write n as i*j+i-j, 0&lt;i&lt;j&lt;=n.
 * @author Sean A. Irvine
 */
public class A081757 extends GfSequence {

  /** Construct the sequence. */
  public A081757() {
    super(1, new AbstractInfiniteSeries<>() {
      private Series<Q> mS = SeriesRing.SQ.zero();
      private int mK = 0;

      @Override
      public Q coeff(final int n) {
        while (n > mK * mK + 3 * mK) {
          mS = SeriesRing.SQ.add(mS, SeriesRing.SQ.divide(SeriesRing.SQ.monomial(Q.ONE, ++mK * mK + 3 * mK), SeriesRing.SQ.oneMinusXToTheN(mK)));
        }
        return mS.coeff(n - 1);
      }
    });
  }
}

