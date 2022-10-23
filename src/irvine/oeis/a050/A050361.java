package irvine.oeis.a050;

import irvine.math.z.DirichletSeries;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000961;

/**
 * A050361 Number of factorizations into distinct prime powers greater than 1.
 * @author Sean A. Irvine
 */
public class A050361 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    final Sequence seq = new A000961();
    seq.next(); // skip 1
    DirichletSeries series = DirichletSeries.ONE;
    long s;
    while ((s = seq.next().intValueExact()) <= mN) {
      series = series.multiply(DirichletSeries.zetaNum(s, mN, Z.ONE), mN);
    }
    return series.coeff(mN);
  }
}
