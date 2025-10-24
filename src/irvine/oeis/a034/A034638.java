package irvine.oeis.a034;

import irvine.math.q.Q;
import irvine.math.series.Series;
import irvine.math.series.SeriesRing;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.oeis.a004.A004016;
import irvine.oeis.a007.A007332;

/**
 * A034638 Theta series of (putative) extremal 3-modular even lattice in dimension 56.
 * @author Sean A. Irvine
 */
public class A034638 extends Sequence0 {

  private int mN = -1;
  private static final SeriesRing<Q> SQ = SeriesRing.SQ;
  private final Series<Q> mThetaA2 = Series.create(new A004016());
  private final Series<Q> mDelta6 = Series.create(new A007332());
  private final Series<Q> mS = SQ.add(
    SQ.multiply(SQ.multiply(SQ.pow(mThetaA2, 4), SQ.pow(mDelta6, 4)), new Q(47880)),
    SQ.multiply(SQ.multiply(SQ.pow(mThetaA2, 10), SQ.pow(mDelta6, 3)), new Q(-77280)),
    SQ.multiply(SQ.multiply(SQ.pow(mThetaA2, 16), SQ.pow(mDelta6, 2)), new Q(7560)),
    SQ.multiply(SQ.multiply(SQ.pow(mThetaA2, 22), mDelta6), Q.valueOf(-168)),
    SQ.pow(mThetaA2, 28)
  );

  @Override
  public Z next() {
    return mS.coeff(++mN).toZ();
  }
}

