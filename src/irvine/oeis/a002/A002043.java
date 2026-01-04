package irvine.oeis.a002;

import irvine.math.q.Q;
import irvine.math.series.AbstractInfiniteSeries;
import irvine.math.series.Series;
import irvine.math.series.SeriesRing;
import irvine.oeis.gf.GfSequence;

/**
 * A002043 Solid partitions.
 * @author Sean A. Irvine
 */
public class A002043 extends GfSequence {

  private static final SeriesRing<Q> SQ = SeriesRing.SQ;

  protected A002043(final int m) {
    super(m, SQ.multiply(SQ.subtract(SQ.divide(SQ.one(), SQ.pow(SQ.oneMinusXToTheN(m), m * (m + 1L) / 2)), SQ.one()),
      SQ.divide(SQ.one(),
      new AbstractInfiniteSeries<>() {
        private Series<Q> mS = SQ.one();
        private int mR = m + 1;

        @Override
        public Q coeff(final int n) {
          while (n >= mR) {
            mS = SQ.multiply(mS, SQ.pow(SQ.oneMinusXToTheN(mR), mR * (mR + 1L) / 2));
            ++mR;
          }
          return mS.coeff(n);
        }
      }
      ))
    );
  }

  /** Construct the sequence. */
  public A002043() {
    this(2);
  }
}
