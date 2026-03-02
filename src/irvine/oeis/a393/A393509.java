package irvine.oeis.a393;

import irvine.math.q.Q;
import irvine.math.series.AbstractInfiniteSeries;
import irvine.math.series.Series;
import irvine.math.series.SeriesRing;
import irvine.oeis.gf.GfSequence;

/**
 * A393509 Number of partitions of n having three times as many even parts as odd.
 * @author Sean A. Irvine
 */
public class A393509 extends GfSequence {

  private static final SeriesRing<Q> SQ = SeriesRing.SQ;

  /** Construct the sequence. */
  public A393509() {
    super(0, new AbstractInfiniteSeries<>() {
      private Series<Q> mSum = SQ.one();
      private Series<Q> mProd1 = SQ.one();
      private int mK = 0;

      @Override
      public Q coeff(final int n) {
        while (n > 7 * mK) {
          ++mK;
          mProd1 = SQ.multiply(mProd1, SQ.oneMinusXToTheN(2 * mK));
          mProd1 = SQ.multiply(mProd1, SQ.oneMinusXToTheN(3 * 2 * mK - 4));
          mProd1 = SQ.multiply(mProd1, SQ.oneMinusXToTheN(3 * 2 * mK - 2));
          mProd1 = SQ.multiply(mProd1, SQ.oneMinusXToTheN(3 * 2 * mK));
          final Series<Q> s = SQ.divide(SQ.one(), mProd1);
          mSum = SQ.add(mSum, SQ.shift(s, 7 * mK));
        }
        return mSum.coeff(n);
      }
    });
  }
}
