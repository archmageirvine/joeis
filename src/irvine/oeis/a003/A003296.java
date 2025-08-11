package irvine.oeis.a003;

import irvine.math.q.Q;
import irvine.math.series.Series;
import irvine.math.series.SeriesRing;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a005.A005762;
import irvine.oeis.a186.A186209;

/**
 * A003296 Coefficients of modular function g_2(tau).
 * @author Sean A. Irvine
 */
public class A003296 extends Sequence1 {

  private static final SeriesRing<Q> SQ = SeriesRing.SQ;

  private final Series<Q> mG2;
  private int mN = -1;

  /** Construct the sequence. */
  public A003296() {
    final Series<Q> bg4 = Series.create(new A005762());
    final Series<Q> g5 = Series.create(new A186209());
    mG2 = SQ.multiply(bg4, g5);
  }

  @Override
  public Z next() {
    return mG2.coeff(++mN).toZ();
  }
}
