package irvine.oeis.a003;

import irvine.math.q.Q;
import irvine.math.series.Series;
import irvine.math.series.SeriesRing;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;
import irvine.oeis.a005.A005761;
import irvine.oeis.a186.A186209;

/**
 * A003297 Coefficients of modular function g_3(tau).
 * @author Sean A. Irvine
 */
public class A003297 extends Sequence2 {

  private static final SeriesRing<Q> SQ = SeriesRing.SQ;

  private final Series<Q> mG2;
  private int mN = -1;

  /** Construct the sequence. */
  public A003297() {
    final Series<Q> bg3 = Series.create(new A005761());
    final Series<Q> g5 = Series.create(new A186209());
    mG2 = SQ.multiply(bg3, g5);
  }

  @Override
  public Z next() {
    return mG2.coeff(++mN).toZ();
  }
}
