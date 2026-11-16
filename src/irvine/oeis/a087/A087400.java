package irvine.oeis.a087;

import irvine.math.z.Z;
import irvine.oeis.a080.A080696;

/**
 * A087400 Primes p such that p+2 is a piptorial number. Also numbers such that A080696(n)- 2 is prime.
 * @author Sean A. Irvine
 */
public class A087400 extends A080696 {

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next().subtract(2);
      if (t.isProbablePrime()) {
        return t;
      }
    }
  }
}
