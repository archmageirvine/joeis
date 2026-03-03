package irvine.oeis.a392;

import irvine.math.q.Q;
import irvine.math.series.AbstractInfiniteSeries;
import irvine.math.series.Series;
import irvine.oeis.gf.GfSequence;

/**
 * A392637 Number of planar partitions of n with strictly decreasing columns and where parts decrease by at most 1 along each row.
 * @author Sean A. Irvine
 */
public class A392637 extends GfSequence {

  /** Construct the sequence. */
  public A392637() {
    super(0, new AbstractInfiniteSeries<>() {

      private Series<Q> mS = SQ.one();
      private int mK = 0;

      @Override
      public Q coeff(final int n) {
        if (n > mK) {
          ++mK;
          mS = SQ.multiply(mS, SQ.divide(SQ.oneMinusXToTheN(6 * mK - 4), SQ.pow(SQ.oneMinusXToTheN(mK), (mK + 5) / 6)));
        }
        return mS.coeff(n);
      }
    });
  }
}
