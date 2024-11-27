package irvine.oeis.a050;

import irvine.math.dirichlet.Dgf;
import irvine.math.dirichlet.Ds;
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
    Ds series = Dgf.one();
    long s;
    while ((s = fd.next().intValueExact()) <= mN) {
      series = Dgf.multiply(series, Dgf.zetap(s));
    }
    return series.coeff(mN);
  }
}
