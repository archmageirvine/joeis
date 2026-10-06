package irvine.oeis.a028;

import irvine.math.q.Q;
import irvine.math.series.AbstractInfiniteSeries;
import irvine.math.series.Series;
import irvine.oeis.gf.GfSequence;

/**
 * A028247 Number of T-frame polyominoes with n cells.
 * @author Sean A. Irvine
 */
public class A028247 extends GfSequence {

  private static Series<Q> b(final long k) {
    return new AbstractInfiniteSeries<>() {
      private Series<Q> mSum = SQ.zero();
      private long mK = 1;
      @Override
      public Q coeff(final long n) {
        while (n >= mK && mK <= k) {
          mSum = SQ.add(mSum, SQ.divide(SQ.monomial(mK), SQ.oneMinusXToTheN(mK)));
          ++mK;
        }
        return mSum.coeff(n);
      }
    };
  }

  /** Construct the sequence. */
  public A028247() {
    super(1, new AbstractInfiniteSeries<>() {
      private Series<Q> mSum = SQ.zero();
      private long mK = 2;

      @Override
      public Q coeff(final long n) {
        while (n >= mK) {
          final Series<Q> b = b(mK - 1);
          final Series<Q> a = SQ.divide(SQ.add(SQ.square(b), SQ.substitute(b, 2)), Q.TWO);
          final Series<Q> s = SQ.multiply(SQ.divide(SQ.monomial(mK), SQ.oneMinusXToTheN(mK)), a);
          mSum = SQ.add(mSum, s);
          ++mK;
        }
        return mSum.coeff(n);
      }
    });
  }
}

