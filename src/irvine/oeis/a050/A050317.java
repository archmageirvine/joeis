package irvine.oeis.a050;

import irvine.math.dirichlet.Dgf;
import irvine.math.dirichlet.Ds;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence2;
import irvine.oeis.a000.A000041;

/**
 * A050317 Number of ways n is a product of partition numbers &gt; 1.
 * @author Sean A. Irvine
 */
public class A050317 extends Sequence2 {

  private long mN = 1;

  @Override
  public Z next() {
    ++mN;
    final Sequence partitions = new A000041().skip(2);
    Ds series = Dgf.one();
    long s;
    while ((s = partitions.next().longValueExact()) <= mN) {
      series = Dgf.multiply(series, Dgf.zetap(s));
    }
    return series.coeff(mN);
  }
}
