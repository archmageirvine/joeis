package irvine.oeis.a034;

import irvine.math.q.Q;
import irvine.math.series.Series;
import irvine.math.series.SeriesRing;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.oeis.a004.A004016;
import irvine.oeis.a007.A007332;

/**
 * A034636 Theta series of (putative) extremal 3-modular even lattice in dimension 52.
 * @author Sean A. Irvine
 */
public class A034636 extends Sequence0 {

  private int mN = -1;
  private static final SeriesRing<Q> SQ = SeriesRing.SQ;
  private final Series<Q> mThetaA2 = Series.create(new A004016());
  private final Series<Q> mDelta6 = Series.create(new A007332());
  private final Series<Q> mS = SQ.add(
    SQ.multiply(SQ.multiply(SQ.pow(mThetaA2, 2), SQ.pow(mDelta6, 4)), new Q(-16380)),
    SQ.multiply(SQ.multiply(SQ.pow(mThetaA2, 8), SQ.pow(mDelta6, 3)), new Q(-43680)),
    SQ.multiply(SQ.multiply(SQ.pow(mThetaA2, 14), SQ.pow(mDelta6, 2)), new Q(6084)),
    SQ.multiply(SQ.multiply(SQ.pow(mThetaA2, 20), mDelta6), Q.valueOf(-156)),
    SQ.pow(mThetaA2, 26)
  );

  @Override
  public Z next() {
    return mS.coeff(++mN).toZ();
  }
}

