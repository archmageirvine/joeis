package irvine.oeis.a051;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A051654 Primes p such that 30030*p + 1 is also prime.
 * @author Sean A. Irvine
 */
public class A051654 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (p.multiply(30030).add(1).isProbablePrime()) {
        return p;
      }
    }
  }
}
