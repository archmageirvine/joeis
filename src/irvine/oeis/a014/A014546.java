package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.a000.A000058;

/**
 * A014546 Primes in Sylvester's sequence A000058.
 * @author Sean A. Irvine
 */
public class A014546 extends A000058 {

  @Override
  public Z next() {
    while (true) {
      final Z s = super.next();
      if (s.isProbablePrime()) {
        return s;
      }
    }
  }
}
