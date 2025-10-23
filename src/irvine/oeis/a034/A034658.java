package irvine.oeis.a034;

import irvine.math.q.Q;
import irvine.math.series.Series;
import irvine.math.series.SeriesRing;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.oeis.a004.A004016;
import irvine.oeis.a007.A007332;

/**
 * A034658 Theta series of (putative) extremal 3-modular even lattice in dimension 96.
 * @author Sean A. Irvine
 */
public class A034658 extends Sequence0 {

  private int mN = -1;

  private static final SeriesRing<Q> SQ = SeriesRing.SQ;
  private final Series<Q> mThetaA2 = Series.create(new A004016());
  private final Series<Q> mDelta6 = Series.create(new A007332());
  private final Series<Q> mS = SQ.add(
    SQ.multiply(SQ.pow(mDelta6, 8), Q.valueOf(-7921605600L)),
    SQ.multiply(SQ.multiply(SQ.pow(mThetaA2, 6), SQ.pow(mDelta6, 7)), Q.valueOf(-75271680)),
    SQ.multiply(SQ.multiply(SQ.pow(mThetaA2, 12), SQ.pow(mDelta6, 6)), Q.valueOf(372726144)),
    SQ.multiply(SQ.multiply(SQ.pow(mThetaA2, 18), SQ.pow(mDelta6, 5)), Q.valueOf(-210325248)),
    SQ.multiply(SQ.multiply(SQ.pow(mThetaA2, 24), SQ.pow(mDelta6, 4)), Q.valueOf(28576800)),
    SQ.multiply(SQ.multiply(SQ.pow(mThetaA2, 30), SQ.pow(mDelta6, 3)), Q.valueOf(-1411200)),
    SQ.multiply(SQ.multiply(SQ.pow(mThetaA2, 36), SQ.pow(mDelta6, 2)), Q.valueOf(30240)),
    SQ.multiply(SQ.multiply(SQ.pow(mThetaA2, 42), mDelta6), Q.valueOf(-288)),
    SQ.pow(mThetaA2, 48)
  );

  @Override
  public Z next() {
    return mS.coeff(++mN).toZ();
  }
}

