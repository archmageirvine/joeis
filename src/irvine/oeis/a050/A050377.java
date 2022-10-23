package irvine.oeis.a050;

import irvine.math.z.DirichletSeries;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;

/**
 * A050377 Number of ways to factor n into "Fermi-Dirac primes" (members of A050376).
 * @author Sean A. Irvine
 */
public class A050377 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    final Sequence fd = new A050376();
    DirichletSeries series = DirichletSeries.ONE;
    long s;
    while ((s = fd.next().intValueExact()) <= mN) {
      series = series.multiply(DirichletSeries.zeta(s, mN, Z.ONE), mN);
    }
    return series.coeff(mN);
  }
}
