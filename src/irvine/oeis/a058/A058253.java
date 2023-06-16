package irvine.oeis.a058;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A058253 Primes p such that 4^p - 3 is prime.
 * @author Sean A. Irvine
 */
public class A058253 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (Z.ONE.shiftLeft(2 * p.longValueExact()).subtract(3).isProbablePrime()) {
        return p;
      }
    }
  }
}
