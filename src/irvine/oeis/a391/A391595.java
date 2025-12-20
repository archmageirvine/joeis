package irvine.oeis.a391;

import irvine.math.MemoryFunction1;
import irvine.math.q.Q;
import irvine.math.series.AbstractInfiniteSeries;
import irvine.math.series.Series;
import irvine.math.series.SeriesRing;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A391595 allocated for John Tyler Rascoe.
 * @author Sean A. Irvine
 */
public class A391595 extends Sequence0 {

  private static final SeriesRing<Q> SQ = SeriesRing.SQ;
  private int mN = -1;

  private Series<Q> b(final int k, final int j) {
    return SQ.divide(SQ.subtract(SQ.monomial(k), SQ.monomial(k * j)), SQ.oneMinusXToTheN(k * j));
  }

  private final MemoryFunction1<Series<Q>> mC = new MemoryFunction1<>() {
    @Override
    protected Series<Q> compute(final int j) {
      return new AbstractInfiniteSeries<>() {
        private Series<Q> mS = SQ.zero();
        private int mK = 0;

        @Override
        public Q coeff(final int n) {
          while (n > mK) {
            ++mK;
            mS = SQ.add(mS, b(mK, j));
          }
          return SQ.divide(mS, SQ.subtract(SQ.one(), mS)).coeff(n);
        }
      };
    }
  };

  private final Series<Q> mA = new AbstractInfiniteSeries<>() {

    private Series<Q> mS = SQ.one();
    private int mK = 0;

    @Override
    public Q coeff(final int n) {
      while (n > mK) {
        ++mK;
        final Series<Q> i2 = SQ.square(SQ.subtract(SQ.monomial(mK), SQ.one()));
        final Series<Q> sk = new AbstractInfiniteSeries<>() {
          private final int mI = mK;
          private Series<Q> mSK = SQ.zero();
          private int mJ = 0;
          @Override
          public Q coeff(final int m) {
            while (m > mI * mJ) {
              ++mJ;
              final Series<Q> cjxs = SQ.square(SQ.add(mC.get(mJ), SQ.one()));
              final Series<Q> den = SQ.square(SQ.subtract(SQ.monomial(mI * mJ), SQ.one()));
              final Series<Q> d = SQ.divide(SQ.multiply(cjxs, i2), den);
              mSK = SQ.add(mSK, SQ.shift(d, mI * mJ));
            }
            return mSK.coeff(m);
          }
        };
        mS = SQ.add(mS, sk);
      }
      return mS.coeff(n);
    }
  };

  @Override
  public Z next() {
    return mA.coeff(++mN).toZ();
  }
}
