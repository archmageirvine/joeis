package irvine.oeis.a395;

import irvine.math.q.Q;
import irvine.math.series.AbstractInfiniteSeries;
import irvine.math.series.RationalSeriesEnum;
import irvine.math.series.Series;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence2;
import irvine.oeis.a000.A000040;

/**
 * A395549 allocated for David Niedbala Giraudin.
 * @author Sean A. Irvine
 */
public class A395549 extends Sequence2 {

  private final Sequence mP = new A000040().skip();

  @Override
  public Z next() {
    final Z p = mP.next();
    final long lim = p.intValueExact() - 1;
    final Series<Q> s = new AbstractInfiniteSeries<>() {
      @Override
      public Q coeff(final long n) {
        if (n < 1 || n >= lim) {
          return Q.ZERO;
        }
        return new Q(1, n * (n + 1));
      }

      @Override
      public long bound() {
        return lim;
      }
    };
    return RationalSeriesEnum.EXP.s(s).coeff(lim).mod(p);
  }
}
