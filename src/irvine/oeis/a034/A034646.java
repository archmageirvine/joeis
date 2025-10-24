package irvine.oeis.a034;

import irvine.math.q.Q;
import irvine.math.series.Series;
import irvine.math.series.SeriesRing;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.oeis.a004.A004016;
import irvine.oeis.a007.A007332;

/**
 * A034646 Theta series of (putative) extremal 3-modular even lattice in dimension 72.
 * @author Sean A. Irvine
 */
public class A034646 extends Sequence0 {

  private int mN = -1;
  private static final SeriesRing<Q> SQ = SeriesRing.SQ;
  private final Series<Q> mThetaA2 = Series.create(new A004016());
  private final Series<Q> mDelta6 = Series.create(new A007332());
  private final Series<Q> mS = SQ.add(
    SQ.multiply(SQ.pow(mDelta6, 6), Q.valueOf(-23050656)),
    SQ.multiply(SQ.multiply(SQ.pow(mThetaA2, 6), SQ.pow(mDelta6, 5)), Q.valueOf(-1586304)),
    SQ.multiply(SQ.multiply(SQ.pow(mThetaA2, 12), SQ.pow(mDelta6, 4)), Q.valueOf(2264760)),
    SQ.multiply(SQ.multiply(SQ.pow(mThetaA2, 18), SQ.pow(mDelta6, 3)), Q.valueOf(-358560)),
    SQ.multiply(SQ.multiply(SQ.pow(mThetaA2, 24), SQ.pow(mDelta6, 2)), Q.valueOf(14904)),
    SQ.multiply(SQ.multiply(SQ.pow(mThetaA2, 30), mDelta6), Q.valueOf(-216)),
    SQ.pow(mThetaA2, 36)
  );

  @Override
  public Z next() {
    return mS.coeff(++mN).toZ();
  }
}

