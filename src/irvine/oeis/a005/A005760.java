package irvine.oeis.a005;

import irvine.math.q.Q;
import irvine.math.series.Series;
import irvine.math.series.SeriesRing;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a003.A003295;
import irvine.oeis.a186.A186210;

/**
 * A005760 Coefficients of modular function G_2(tau).
 * @author Sean A. Irvine
 */
public class A005760 extends AbstractSequence {

  private static final SeriesRing<Q> SQ = SeriesRing.SQ;
  private static final Q Q121 = Q.valueOf(121);

  private final Series<Q> mG2;
  private int mN = -1;

  /** Construct the sequence. */
  public A005760() {
    super(-2);
    final Series<Q> bg5 = Series.create(new A186210());
    final Series<Q> b = Series.create(new A003295());
    final Series<Q> b2 = SQ.square(b);
    final Series<Q> num = SQ.add(bg5, SQ.monomial(new Q(-1331), 5), SQ.shift(SQ.multiply(b, Q121), 4), SQ.shift(SQ.multiply(b2, Q121), 3));
    final Series<Q> den = SQ.multiply(b, SQ.add(b2, SQ.shift(b, 1), SQ.monomial(new Q(-22), 2)));
    mG2 = SQ.divide(num, den);
  }

  @Override
  public Z next() {
    return mG2.coeff(++mN).toZ();
  }
}
