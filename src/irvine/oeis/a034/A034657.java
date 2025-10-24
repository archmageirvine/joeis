package irvine.oeis.a034;

import irvine.math.q.Q;
import irvine.math.series.Series;
import irvine.math.series.SeriesRing;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.oeis.a004.A004016;
import irvine.oeis.a007.A007332;

/**
 * A034657 Theta series of (putative) extremal 3-modular even lattice in dimension 94.
 * @author Sean A. Irvine
 */
public class A034657 extends Sequence0 {

  private int mN = -1;
  private static final SeriesRing<Q> SQ = SeriesRing.SQ;
  private final Series<Q> mThetaA2 = Series.create(new A004016());
  private final Series<Q> mDelta6 = Series.create(new A007332());
  private final Series<Q> mS = SQ.add(
    SQ.multiply(SQ.multiply(SQ.pow(mThetaA2, 5), SQ.pow(mDelta6, 7)), new Q(-50110272)),
    SQ.multiply(SQ.multiply(SQ.pow(mThetaA2, 11), SQ.pow(mDelta6, 6)), new Q(231479136)),
    SQ.multiply(SQ.multiply(SQ.pow(mThetaA2, 17), SQ.pow(mDelta6, 5)), new Q(-160924428)),
    SQ.multiply(SQ.multiply(SQ.pow(mThetaA2, 23), SQ.pow(mDelta6, 4)), new Q(24416406)),
    SQ.multiply(SQ.multiply(SQ.pow(mThetaA2, 29), SQ.pow(mDelta6, 3)), new Q(-1287048)),
    SQ.multiply(SQ.multiply(SQ.pow(mThetaA2, 35), SQ.pow(mDelta6, 2)), new Q(28764)),
    SQ.multiply(SQ.multiply(SQ.pow(mThetaA2, 41), mDelta6), Q.valueOf(-282)),
    SQ.pow(mThetaA2, 47)
  );

  @Override
  public Z next() {
    return mS.coeff(++mN).toZ();
  }
}

