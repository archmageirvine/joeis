package irvine.oeis.a085;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A085414 Primes that are a concatenation of a prime and its first digit.
 * @author Sean A. Irvine
 */
public class A085414 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final String p = super.next().toString();
      final Z q = new Z(p + p.charAt(0));
      if (q.isProbablePrime()) {
        return q;
      }
    }
  }
}

