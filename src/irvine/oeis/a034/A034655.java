package irvine.oeis.a034;

import irvine.math.q.Q;
import irvine.math.series.Series;
import irvine.math.series.SeriesRing;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.oeis.a004.A004016;
import irvine.oeis.a007.A007332;

/**
 * A034655 Theta series of (putative) extremal 3-modular even lattice in dimension 90.
 * @author Sean A. Irvine
 */
public class A034655 extends Sequence0 {

  private int mN = -1;
  private static final SeriesRing<Q> SQ = SeriesRing.SQ;
  private final Series<Q> mThetaA2 = Series.create(new A004016());
  private final Series<Q> mDelta6 = Series.create(new A007332());
  private final Series<Q> mS = SQ.add(
    SQ.multiply(SQ.multiply(SQ.pow(mThetaA2, 3), SQ.pow(mDelta6, 7)), new Q(-88121520)),
    SQ.multiply(SQ.multiply(SQ.pow(mThetaA2, 9), SQ.pow(mDelta6, 6)), new Q(78903720)),
    SQ.multiply(SQ.multiply(SQ.pow(mThetaA2, 15), SQ.pow(mDelta6, 5)), new Q(-89751564)),
    SQ.multiply(SQ.multiply(SQ.pow(mThetaA2, 21), SQ.pow(mDelta6, 4)), new Q(17454690)),
    SQ.multiply(SQ.multiply(SQ.pow(mThetaA2, 27), SQ.pow(mDelta6, 3)), new Q(-1060560)),
    SQ.multiply(SQ.multiply(SQ.pow(mThetaA2, 33), SQ.pow(mDelta6, 2)), new Q(25920)),
    SQ.multiply(SQ.multiply(SQ.pow(mThetaA2, 39), mDelta6), Q.valueOf(-270)),
    SQ.pow(mThetaA2, 45)
  );

  @Override
  public Z next() {
    return mS.coeff(++mN).toZ();
  }
}

