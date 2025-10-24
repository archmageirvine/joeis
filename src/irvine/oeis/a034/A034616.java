package irvine.oeis.a034;

import irvine.math.q.Q;
import irvine.math.series.Series;
import irvine.math.series.SeriesRing;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.oeis.a002.A002288;
import irvine.oeis.a004.A004011;

/**
 * A034616 Theta series of (putative) extremal 2-modular even lattice in dimension 88.
 * @author Sean A. Irvine
 */
public class A034616 extends Sequence0 {

  private int mN = -1;
  private static final SeriesRing<Q> SQ = SeriesRing.SQ;
  private final Series<Q> mThetaD4 = Series.create(new A004011());
  private final Series<Q> mDelta8 = Series.create(new A002288());
  private final Series<Q> mS = SQ.add(
    SQ.multiply(SQ.multiply(SQ.pow(mThetaD4, 2), SQ.pow(mDelta8, 5)), Q.valueOf(-151227648)),
    SQ.multiply(SQ.multiply(SQ.pow(mThetaD4, 6), SQ.pow(mDelta8, 4)), Q.valueOf(91024560)),
    SQ.multiply(SQ.multiply(SQ.pow(mThetaD4, 10), SQ.pow(mDelta8, 3)), Q.valueOf(-5508096)),
    SQ.multiply(SQ.multiply(SQ.pow(mThetaD4, 14), SQ.pow(mDelta8, 2)), Q.valueOf(90288)),
    SQ.multiply(SQ.multiply(SQ.pow(mThetaD4, 18), mDelta8), Q.valueOf(-528)),
    SQ.pow(mThetaD4, 22)
  );

  @Override
  public Z next() {
    return mS.coeff(++mN).toZ();
  }
}

