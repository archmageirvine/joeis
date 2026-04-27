package irvine.oeis.a395;

import irvine.math.q.Q;
import irvine.math.series.Hypergeometric;
import irvine.math.series.Series;
import irvine.math.series.SeriesRing;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A395287 a(n) = 27^n * [z^n] 2F1(1/3, 1/3; 1; z)^3.
 * @author Sean A. Irvine
 */
public class A395287 extends Sequence0 {

  private static final SeriesRing<Q> SQ = SeriesRing.SQ;
  private final Series<Q> mS = SQ.pow(Hypergeometric.s(new Q[] {Q.ONE_THIRD, Q.ONE_THIRD}, new Q[] {Q.ONE}, SQ.x()), 3);
  private long mN = -1;
  private Z mZ27 = Z.ONE;

  @Override
  public Z next() {
    if (++mN > 0) {
      mZ27 = mZ27.multiply(27);
    }
    return mS.coeff(mN).multiply(mZ27).toZ();
  }
}

