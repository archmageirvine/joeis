package irvine.oeis.a049;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A049482 Primes p such that p + 210 is also prime.
 * @author Sean A. Irvine
 */
public class A049482 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (p.add(210).isProbablePrime()) {
        return p;
      }
    }
  }
}
