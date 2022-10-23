package irvine.oeis.a050;

import irvine.math.z.DirichletSeries;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a026.A026424;

/**
 * A050332 Number of factorizations of n into distinct numbers with an odd number of prime factors.
 * @author Sean A. Irvine
 */
public class A050332 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    final Sequence seq = new A026424();
    DirichletSeries series = DirichletSeries.ONE;
    long s;
    while ((s = seq.next().intValueExact()) <= mN) {
      series = series.multiply(DirichletSeries.zetaNum(s, mN, Z.ONE), mN);
    }
    return series.coeff(mN);
  }
}
