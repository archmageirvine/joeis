package irvine.oeis.a005;

import irvine.math.q.Q;
import irvine.math.series.Series;
import irvine.math.series.SeriesRing;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A005764 Coefficients of modular function denoted G_6(tau) by Atkin.
 * @author Sean A. Irvine
 */
public class A005764 extends AbstractSequence {

  private static final SeriesRing<Q> SQ = SeriesRing.SQ;

  private final Series<Q> mG4;
  private int mN = -1;

  /** Construct the sequence. */
  public A005764() {
    super(-6);
    final Series<Q> bg2 = Series.create(new A005760());
    final Series<Q> bg4 = Series.create(new A005762());
    mG4 = SQ.multiply(bg2, bg4);
  }

  @Override
  public Z next() {
    return mG4.coeff(++mN).toZ();
  }
}
