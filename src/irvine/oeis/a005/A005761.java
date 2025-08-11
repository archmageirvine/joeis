package irvine.oeis.a005;

import irvine.math.q.Q;
import irvine.math.series.Series;
import irvine.math.series.SeriesRing;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a003.A003295;

/**
 * A005761 Coefficients of modular function G_3(tau).
 * @author Sean A. Irvine
 */
public class A005761 extends AbstractSequence {

  private static final SeriesRing<Q> SQ = SeriesRing.SQ;

  private final Series<Q> mG3;
  private int mN = -1;

  /** Construct the sequence. */
  public A005761() {
    super(-3);
    final Series<Q> bg2 = Series.create(new A005760()); // offset -3
    final Series<Q> b = Series.create(new A003295());
    mG3 = SQ.add(SQ.multiply(bg2, b), SQ.monomial(new Q(-121), 3));
  }

  @Override
  public Z next() {
    return mG3.coeff(++mN).toZ();
  }
}
