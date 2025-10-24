package irvine.oeis.a034;

import irvine.math.q.Q;
import irvine.math.series.Series;
import irvine.math.series.SeriesRing;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.oeis.a004.A004016;
import irvine.oeis.a007.A007332;

/**
 * A034647 Theta series of (putative) extremal 3-modular even lattice in dimension 74.
 * @author Sean A. Irvine
 */
public class A034647 extends Sequence0 {

  private int mN = -1;
  private static final SeriesRing<Q> SQ = SeriesRing.SQ;
  private final Series<Q> mThetaA2 = Series.create(new A004016());
  private final Series<Q> mDelta6 = Series.create(new A007332());
  private final Series<Q> mS = SQ.add(
    SQ.multiply(SQ.multiply(mThetaA2, SQ.pow(mDelta6, 6)), new Q(-13818168)),
    SQ.multiply(SQ.multiply(SQ.pow(mThetaA2, 7), SQ.pow(mDelta6, 5)), new Q(-2961036)),
    SQ.multiply(SQ.multiply(SQ.pow(mThetaA2, 13), SQ.pow(mDelta6, 4)), new Q(3024306)),
    SQ.multiply(SQ.multiply(SQ.pow(mThetaA2, 19), SQ.pow(mDelta6, 3)), new Q(-413808)),
    SQ.multiply(SQ.multiply(SQ.pow(mThetaA2, 25), SQ.pow(mDelta6, 2)), new Q(15984)),
    SQ.multiply(SQ.multiply(SQ.pow(mThetaA2, 31), mDelta6), Q.valueOf(-222)),
    SQ.pow(mThetaA2, 37)
  );

  @Override
  public Z next() {
    return mS.coeff(++mN).toZ();
  }
}

