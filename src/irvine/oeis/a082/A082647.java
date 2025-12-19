package irvine.oeis.a082;

import irvine.math.q.Q;
import irvine.math.series.AbstractInfiniteSeries;
import irvine.math.series.Series;
import irvine.math.series.SeriesRing;
import irvine.oeis.gf.GfSequence;

/**
 * A082647 Number of ways n can be expressed as the sum of d consecutive positive integers where d&gt;0 is a divisor of n.
 * @author Sean A. Irvine
 */
public class A082647 extends GfSequence {

  private static final SeriesRing<Q> SQ = SeriesRing.SQ;

  /** Construct the sequence. */
  public A082647() {
    super(1, new AbstractInfiniteSeries<>() {

      private Series<Q> mS = SQ.zero();
      private int mK = 0;

      @Override
      public Q coeff(final int n) {
        while (n >= mK * (2 * mK - 1)) {
          ++mK;
          mS = SQ.add(mS, SQ.divide(SQ.monomial(Q.ONE, mK * (2 * mK - 1)), SQ.oneMinusXToTheN(2 * mK - 1)));
        }
        return mS.coeff(n);
      }
    });
  }
}
