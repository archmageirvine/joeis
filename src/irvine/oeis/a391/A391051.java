package irvine.oeis.a391;

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.series.AbstractInfiniteSeries;
import irvine.math.series.Series;
import irvine.math.series.SeriesRing;
import irvine.math.z.Z;
import irvine.oeis.gf.GfSequence;

/**
 * A391051 allocated for Ognjen Papaz.
 * @author Sean A. Irvine
 */
public class A391051 extends GfSequence {

  private static final SeriesRing<Q> SQ = SeriesRing.SQ;

  /** Construct the sequence. */
  public A391051() {
    super(0, SQ.divide(new AbstractInfiniteSeries<>() {

      private Series<Q> mS = SQ.one();
      private int mK = 0;

      @Override
      public Q coeff(final int n) {
        while (n > mK) {
          mS = SQ.multiply(mS, SQ.pow(SQ.oneMinusXToTheN(++mK), Z.ONE.subtract(Functions.PARTITIONS.l(mK + 1))));
        }
        return mS.coeff(n);
      }
    }, SQ.oneMinusXToTheN(1)));
  }
}
