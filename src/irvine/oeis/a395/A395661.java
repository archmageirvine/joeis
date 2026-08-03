package irvine.oeis.a395;

import irvine.math.q.Q;
import irvine.math.series.Series;
import irvine.math.series.SeriesRing;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.oeis.a001.A001190;

/**
 * A395661 allocated for Noah A Rosenberg.
 * @author Sean A. Irvine
 */
public class A395661 extends Sequence0 {

  private static final SeriesRing<Q> SQ = SeriesRing.SQ;
  private final Series<Q> mA = Series.create(new A001190());
  private final Series<Q> mB = build(mA);
  private long mN = -1;

  private static Series<Q> build(final Series<Q> a) {
    final Series<Q> a1 = SQ.subtract(SQ.one(), a);
    final Series<Q> ax2 = SQ.substitute(a, 2);
    final Series<Q> t1 = SQ.divide(SQ.pow(a, 3), SQ.multiply(SQ.pow(a1, 3), Q.TWO));
    final Series<Q> t2 = SQ.multiply(SQ.divide(SQ.multiply(a, ax2), SQ.multiply(a1, SQ.subtract(SQ.one(), ax2))), Q.HALF);
    final Series<Q> t3 = SQ.square(SQ.divide(a, a1));
    return SQ.add(t1, t2, t3);
  }

  @Override
  public Z next() {
    return mB.coeff(++mN).toZ();
  }
}
