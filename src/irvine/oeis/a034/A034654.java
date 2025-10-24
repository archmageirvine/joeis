package irvine.oeis.a034;

import irvine.math.q.Q;
import irvine.math.series.Series;
import irvine.math.series.SeriesRing;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.oeis.a004.A004016;
import irvine.oeis.a007.A007332;

/**
 * A034654 Theta series of (putative) extremal 3-modular even lattice in dimension 88.
 * @author Sean A. Irvine
 */
public class A034654 extends Sequence0 {

  private int mN = -1;
  private static final SeriesRing<Q> SQ = SeriesRing.SQ;
  private final Series<Q> mThetaA2 = Series.create(new A004016());
  private final Series<Q> mDelta6 = Series.create(new A007332());
  private final Series<Q> mS = SQ.add(
    SQ.multiply(SQ.multiply(SQ.pow(mThetaA2, 2), SQ.pow(mDelta6, 7)), new Q(-149897088)),
    SQ.multiply(SQ.multiply(SQ.pow(mThetaA2, 8), SQ.pow(mDelta6, 6)), new Q(42600096)),
    SQ.multiply(SQ.multiply(SQ.pow(mThetaA2, 14), SQ.pow(mDelta6, 5)), new Q(-65159424)),
    SQ.multiply(SQ.multiply(SQ.pow(mThetaA2, 20), SQ.pow(mDelta6, 4)), new Q(14584680)),
    SQ.multiply(SQ.multiply(SQ.pow(mThetaA2, 26), SQ.pow(mDelta6, 3)), new Q(-957792)),
    SQ.multiply(SQ.multiply(SQ.pow(mThetaA2, 32), SQ.pow(mDelta6, 2)), new Q(24552)),
    SQ.multiply(SQ.multiply(SQ.pow(mThetaA2, 38), mDelta6), Q.valueOf(-264)),
    SQ.pow(mThetaA2, 44)
  );

  @Override
  public Z next() {
    return mS.coeff(++mN).toZ();
  }
}

