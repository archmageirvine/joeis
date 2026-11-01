package irvine.oeis.a087;

import irvine.math.series.Series;
import irvine.math.series.SeriesRing;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A087186 Q(p)/p where p runs through the primes and Q(k) is the k-th central quadrinomial coefficient (A005190).
 * @author Sean A. Irvine
 */
public class A087186 extends A000040 {

  private static final Series<Z> Q = Series.create(1, 1, 1, 1);

  @Override
  public Z next() {
    final long p = super.next().longValueExact();
    final Series<Z> qp = SeriesRing.SZ.pow(Q, p);
    return qp.coeff(3 * p / 2).divide(p);
  }
}
