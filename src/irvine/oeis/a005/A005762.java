package irvine.oeis.a005;

import irvine.math.q.Q;
import irvine.math.series.Series;
import irvine.math.series.SeriesRing;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A005762 Coefficients of modular function G_4(tau).
 * @author Sean A. Irvine
 */
public class A005762 extends AbstractSequence {

  private static final SeriesRing<Q> SQ = SeriesRing.SQ;

  private final Series<Q> mG4;
  private int mN = -1;

  /** Construct the sequence. */
  public A005762() {
    super(-4);
    final Series<Q> bg2 = Series.create(new A005760());
    final Series<Q> bg3 = Series.create(new A005761());
    mG4 = SQ.subtract(SQ.square(bg2), SQ.shift(SQ.multiply(bg3, Q.valueOf(11)), 1));
  }

  @Override
  public Z next() {
    return mG4.coeff(++mN).toZ();
  }
}
