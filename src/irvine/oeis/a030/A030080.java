package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000040;

/**
 * A030080 Primes p such that digits of p appear in p^3.
 * @author Sean A. Irvine
 */
public class A030080 extends Sequence1 {

  private final Sequence mPrimes = new A000040();

  @Override
  public Z next() {
    while (true) {
      final Z p = mPrimes.next();
      if (A030079.isOk(p, p.pow(3))) {
        return p;
      }
    }
  }
}
