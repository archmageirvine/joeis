package irvine.oeis.a049;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A049488 Primes p such that p+16 is prime.
 * @author Sean A. Irvine
 */
public class A049488 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (p.add(16).isProbablePrime()) {
        return p;
      }
    }
  }
}
