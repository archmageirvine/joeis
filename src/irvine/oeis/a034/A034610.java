package irvine.oeis.a034;

import irvine.math.q.Q;
import irvine.math.series.Series;
import irvine.math.series.SeriesRing;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.oeis.a002.A002288;
import irvine.oeis.a004.A004011;

/**
 * A034610 Theta series of (putative) extremal 2-modular even lattice in dimension 64.
 * @author Sean A. Irvine
 */
public class A034610 extends Sequence0 {

  private int mN = -1;
  private static final SeriesRing<Q> SQ = SeriesRing.SQ;
  private final Series<Q> mThetaD4 = Series.create(new A004011());
  private final Series<Q> mDelta8 = Series.create(new A002288());
  private final Series<Q> mS = SQ.add(
    SQ.multiply(SQ.pow(mDelta8, 4), Q.valueOf(38016)),
    SQ.multiply(SQ.multiply(SQ.pow(mThetaD4, 4), SQ.pow(mDelta8, 3)), Q.valueOf(-743424)),
    SQ.multiply(SQ.multiply(SQ.pow(mThetaD4, 8), SQ.pow(mDelta8, 2)), Q.valueOf(38016)),
    SQ.multiply(SQ.multiply(SQ.pow(mThetaD4, 12), mDelta8), Q.valueOf(-384)),
    SQ.pow(mThetaD4, 16)
  );

  @Override
  public Z next() {
    return mS.coeff(++mN).toZ();
  }
}

