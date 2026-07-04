package irvine.oeis.a085;

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.series.AbstractInfiniteSeries;
import irvine.math.series.Series;
import irvine.math.series.SeriesRing;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A085642 Number of columns in the character table of the symmetric group S_n that have zero sum.
 * @author Sean A. Irvine
 */
public class A085642 extends Sequence1 {

  private static final SeriesRing<Q> SQ = SeriesRing.SQ;
  private int mN = 0;
  private final Series<Q> mS = new AbstractInfiniteSeries<>() {

    private Series<Q> mT = SQ.one();
    private long mK = 1;

    @Override
    public Q coeff(final long n) {
      while (n >= 2 * mK - 1) {
        mT = SQ.multiply(mT, SQ.divide(SQ.onePlusXToTheN(2 * mK - 1), SQ.oneMinusXToTheN(2 * mK)));
        ++mK;
      }
      return mT.coeff(n);
    }
  };

  @Override
  public Z next() {
    return Functions.PARTITIONS.z(++mN).subtract(mS.coeff(mN).toZ());
  }
}
