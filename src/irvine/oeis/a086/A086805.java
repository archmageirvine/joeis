package irvine.oeis.a086;

import irvine.math.cr.Convergents;
import irvine.math.cr.Zeta;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A086805 Primes in the numerator of the continued fraction rational approximation of zeta(3).
 * @author Sean A. Irvine
 */
public class A086805 extends Sequence1 {

  private final Convergents mConvergents = new Convergents(Zeta.zeta(3));

  @Override
  public Z next() {
    while (true) {
      final Z n = mConvergents.next().num();
      if (n.isProbablePrime()) {
        return n;
      }
    }
  }
}
