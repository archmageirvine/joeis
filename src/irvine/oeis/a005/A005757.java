package irvine.oeis.a005;

import irvine.math.q.Q;
import irvine.math.series.Series;
import irvine.math.series.SeriesRing;
import irvine.math.z.Z;
import irvine.oeis.Sequence3;
import irvine.oeis.a186.A186209;

/**
 * A005757 Coefficients of modular function g_4(tau).
 * @author Sean A. Irvine
 */
public class A005757 extends Sequence3 {

  private static final SeriesRing<Q> SQ = SeriesRing.SQ;

  private final Series<Q> mG5;
  private int mN = -1;

  /** Construct the sequence. */
  public A005757() {
    final Series<Q> bg2 = Series.create(new A005760());
    final Series<Q> g5 = Series.create(new A186209());
    mG5 = SQ.multiply(bg2, g5);
  }

  @Override
  public Z next() {
    return mG5.coeff(++mN).toZ();
  }
}
