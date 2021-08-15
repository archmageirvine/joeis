package irvine.oeis.a050;

import irvine.math.z.DirichletSeries;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a000.A000041;

/**
 * A050317 Number of ways n is a product of partition numbers &gt; 1.
 * @author Sean A. Irvine
 */
public class A050317 implements Sequence {

  private long mN = 1;

  @Override
  public Z next() {
    ++mN;
    final Sequence partitions = new SkipSequence(new A000041(), 2);
    DirichletSeries series = DirichletSeries.ONE;
    long s;
    while ((s = partitions.next().intValueExact()) <= mN) {
      series = series.multiply(DirichletSeries.zeta(s, mN, Z.ONE), mN);
    }
    return series.coeff(mN);
  }
}
