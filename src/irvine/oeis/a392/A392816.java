package irvine.oeis.a392;

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.series.AbstractInfiniteSeries;
import irvine.math.series.Series;
import irvine.oeis.gf.GfSequence;

/**
 * A392816 allocated for Miles Englezou.
 * @author Sean A. Irvine
 */
public class A392816 extends GfSequence {

  /** Construct the sequence. */
  public A392816() {
    super(0, SQ.divide(SQ.onePlusXToTheN(1), SQ.multiply(SQ.oneMinusXToTheN(1), new AbstractInfiniteSeries<>() {

      private Series<Q> mS = SQ.oneMinusXToTheN(1);
      private long mP = 3;

      @Override
      public Q coeff(final int n) {
        while (n >= (mP - 1) / 2) {
          mP = Functions.NEXT_PRIME.l(mP);
          mS = SQ.multiply(mS, SQ.oneMinusXToTheN((int) ((mP - 1) / 2)));
        }
        return mS.coeff(n);
      }
    })));
  }
}
