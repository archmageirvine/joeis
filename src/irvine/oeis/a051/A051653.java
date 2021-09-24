package irvine.oeis.a051;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A051653 Primes p such that 2310*p + 1 is also prime.
 * @author Sean A. Irvine
 */
public class A051653 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (p.multiply(2310).add(1).isProbablePrime()) {
        return p;
      }
    }
  }
}
