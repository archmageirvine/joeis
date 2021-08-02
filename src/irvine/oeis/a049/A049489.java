package irvine.oeis.a049;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A049489 Primes p such that p + 32 is also prime.
 * @author Sean A. Irvine
 */
public class A049489 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (p.add(32).isProbablePrime()) {
        return p;
      }
    }
  }
}
