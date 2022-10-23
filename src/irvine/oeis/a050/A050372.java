package irvine.oeis.a050;

import irvine.math.z.DirichletSeries;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a002.A002808;

/**
 * A050372 Number of ways to factor n into distinct composite factors.
 * @author Sean A. Irvine
 */
public class A050372 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    final Sequence composites = new A002808();
    DirichletSeries series = DirichletSeries.ONE;
    long s;
    while ((s = composites.next().intValueExact()) <= mN) {
      series = series.multiply(DirichletSeries.zetaNum(s, mN, Z.ONE), mN);
    }
    return series.coeff(mN);
  }
}
