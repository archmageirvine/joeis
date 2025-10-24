package irvine.oeis.a034;

import irvine.math.q.Q;
import irvine.math.series.Series;
import irvine.math.series.SeriesRing;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.oeis.a004.A004016;
import irvine.oeis.a007.A007332;

/**
 * A034653 Theta series of (putative) extremal 3-modular even lattice in dimension 86.
 * @author Sean A. Irvine
 */
public class A034653 extends Sequence0 {

  private int mN = -1;
  private static final SeriesRing<Q> SQ = SeriesRing.SQ;
  private final Series<Q> mThetaA2 = Series.create(new A004016());
  private final Series<Q> mDelta6 = Series.create(new A007332());
  private final Series<Q> mS = SQ.add(
    SQ.multiply(SQ.multiply(mThetaA2, SQ.pow(mDelta6, 7)), new Q(-254676960)),
    SQ.multiply(SQ.multiply(SQ.pow(mThetaA2, 7), SQ.pow(mDelta6, 6)), new Q(21380976)),
    SQ.multiply(SQ.multiply(SQ.pow(mThetaA2, 13), SQ.pow(mDelta6, 5)), new Q(-46268172)),
    SQ.multiply(SQ.multiply(SQ.pow(mThetaA2, 19), SQ.pow(mDelta6, 4)), new Q(12078270)),
    SQ.multiply(SQ.multiply(SQ.pow(mThetaA2, 25), SQ.pow(mDelta6, 3)), new Q(-861720)),
    SQ.multiply(SQ.multiply(SQ.pow(mThetaA2, 31), SQ.pow(mDelta6, 2)), new Q(23220)),
    SQ.multiply(SQ.multiply(SQ.pow(mThetaA2, 37), mDelta6), Q.valueOf(-258)),
    SQ.pow(mThetaA2, 43)
  );

  @Override
  public Z next() {
    return mS.coeff(++mN).toZ();
  }
}

