package irvine.oeis.a034;

import irvine.math.q.Q;
import irvine.math.series.Series;
import irvine.math.series.SeriesRing;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.oeis.a004.A004016;
import irvine.oeis.a007.A007332;

/**
 * A034641 Theta series of (putative) extremal 3-modular even lattice in dimension 62.
 * @author Sean A. Irvine
 */
public class A034641 extends Sequence0 {

  private int mN = -1;
  private static final SeriesRing<Q> SQ = SeriesRing.SQ;
  private final Series<Q> mThetaA2 = Series.create(new A004016());
  private final Series<Q> mDelta6 = Series.create(new A007332());
  private final Series<Q> mS = SQ.add(
    SQ.multiply(SQ.multiply(mThetaA2, SQ.pow(mDelta6, 5)), new Q(-773388)),
    SQ.multiply(SQ.multiply(SQ.pow(mThetaA2, 7), SQ.pow(mDelta6, 4)), new Q(337590)),
    SQ.multiply(SQ.multiply(SQ.pow(mThetaA2, 13), SQ.pow(mDelta6, 3)), new Q(-152520)),
    SQ.multiply(SQ.multiply(SQ.pow(mThetaA2, 19), SQ.pow(mDelta6, 2)), new Q(10044)),
    SQ.multiply(SQ.multiply(SQ.pow(mThetaA2, 25), mDelta6), Q.valueOf(-186)),
    SQ.pow(mThetaA2, 31)
  );

  @Override
  public Z next() {
    return mS.coeff(++mN).toZ();
  }
}

