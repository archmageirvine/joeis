package irvine.oeis.a005;

import irvine.math.q.Q;
import irvine.math.series.Series;
import irvine.math.series.SeriesRing;
import irvine.math.z.Z;
import irvine.oeis.Sequence3;
import irvine.oeis.a003.A003296;

/**
 * A005759 Coefficients of modular function g_6(tau).
 * @author Sean A. Irvine
 */
public class A005759 extends Sequence3 {

  private static final SeriesRing<Q> SQ = SeriesRing.SQ;

  private final Series<Q> mG6;
  private int mN = -1;

  /** Construct the sequence. */
  public A005759() {
    final Series<Q> bg5 = Series.create(new A005757());
    final Series<Q> g2 = Series.create(new A003296());
    mG6 = SQ.multiply(bg5, g2);
  }

  @Override
  public Z next() {
    return mG6.coeff(++mN).toZ();
  }
}
