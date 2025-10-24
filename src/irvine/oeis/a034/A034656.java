package irvine.oeis.a034;

import irvine.math.q.Q;
import irvine.math.series.Series;
import irvine.math.series.SeriesRing;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.oeis.a004.A004016;
import irvine.oeis.a007.A007332;

/**
 * A034656 Theta series of (putative) extremal 3-modular even lattice in dimension 92.
 * @author Sean A. Irvine
 */
public class A034656 extends Sequence0 {

  private int mN = -1;
  private static final SeriesRing<Q> SQ = SeriesRing.SQ;
  private final Series<Q> mThetaA2 = Series.create(new A004016());
  private final Series<Q> mDelta6 = Series.create(new A007332());
  private final Series<Q> mS = SQ.add(
    SQ.multiply(SQ.multiply(SQ.pow(mThetaA2, 4), SQ.pow(mDelta6, 7)), new Q(-56277504)),
    SQ.multiply(SQ.multiply(SQ.pow(mThetaA2, 10), SQ.pow(mDelta6, 6)), new Q(138269376)),
    SQ.multiply(SQ.multiply(SQ.pow(mThetaA2, 16), SQ.pow(mDelta6, 5)), new Q(-121229136)),
    SQ.multiply(SQ.multiply(SQ.pow(mThetaA2, 22), SQ.pow(mDelta6, 4)), new Q(20720700)),
    SQ.multiply(SQ.multiply(SQ.pow(mThetaA2, 28), SQ.pow(mDelta6, 3)), new Q(-1170240)),
    SQ.multiply(SQ.multiply(SQ.pow(mThetaA2, 34), SQ.pow(mDelta6, 2)), new Q(27324)),
    SQ.multiply(SQ.multiply(SQ.pow(mThetaA2, 40), mDelta6), Q.valueOf(-276)),
    SQ.pow(mThetaA2, 46)
  );

  @Override
  public Z next() {
    return mS.coeff(++mN).toZ();
  }
}

