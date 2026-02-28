package irvine.oeis.a393;

import irvine.math.q.Q;
import irvine.math.series.AbstractInfiniteSeries;
import irvine.math.series.Series;
import irvine.oeis.gf.GfSequence;

/**
 * A393637 allocated for Stanislav Sykora.
 * @author Sean A. Irvine
 */
public class A393637 extends GfSequence {

  /** Construct the sequence. */
  public A393637() {
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
