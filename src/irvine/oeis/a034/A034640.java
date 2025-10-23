package irvine.oeis.a034;

import irvine.math.q.Q;
import irvine.math.series.Series;
import irvine.math.series.SeriesRing;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.oeis.a004.A004016;
import irvine.oeis.a007.A007332;

/**
 * A034652 Theta series of (putative) extremal 3-modular even lattice in dimension 60.
 * @author Sean A. Irvine
 */
public class A034640 extends Sequence0 {

  private int mN = -1;
  private static final SeriesRing<Q> SQ = SeriesRing.SQ;
  private final Series<Q> mThetaA2 = Series.create(new A004016());
  private final Series<Q> mDelta6 = Series.create(new A007332());
  private final Series<Q> mS = SQ.add(
    SQ.multiply(SQ.pow(mDelta6, 5), Q.valueOf(-1271376)),
    SQ.multiply(SQ.multiply(SQ.pow(mThetaA2, 6), SQ.pow(mDelta6, 4)), Q.valueOf(199260)),
    SQ.multiply(SQ.multiply(SQ.pow(mThetaA2, 12), SQ.pow(mDelta6, 3)), Q.valueOf(-123840)),
    SQ.multiply(SQ.multiply(SQ.pow(mThetaA2, 18), SQ.pow(mDelta6, 2)), Q.valueOf(9180)),
    SQ.multiply(SQ.multiply(SQ.pow(mThetaA2, 24), mDelta6), Q.valueOf(-180)),
    SQ.pow(mThetaA2, 30)
  );

  @Override
  public Z next() {
    return mS.coeff(++mN).toZ();
  }
}

