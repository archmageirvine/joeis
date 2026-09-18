package irvine.oeis.a055;

import irvine.math.predicate.Predicates;
import irvine.math.series.AbstractInfiniteSeries;
import irvine.math.series.Series;
import irvine.math.series.SeriesRing;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A055410 Number of points in Z^4 of norm &lt;= n.
 * @author Sean A. Irvine
 */
public class A055410 extends Sequence0 {

  private int mM = -3;
  private int mN = 1;

  private final Series<Z> mS;

  protected A055410(final int exponent) {
    final Series<Z> theta3 = new AbstractInfiniteSeries<>() {
      @Override
      public Z coeff(final long n) {
        return n == 0 ? Z.ONE : Predicates.SQUARE.is(n) ? Z.TWO : Z.ZERO;
      }
    };
    mS = SeriesRing.SZ.divide(SeriesRing.SZ.pow(theta3, exponent), SeriesRing.SZ.create(Z.ONE, Z.NEG_ONE));
  }

  /** Construct the sequence. */
  public A055410() {
    this(4);
  }

  @Override
  public Z next() {
    mM += 2;
    mN += mM;
    return mS.coeff(mN);
  }
}
