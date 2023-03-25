package irvine.oeis.a062;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A062291 Primes p = prime(k) such that k*p - 1 is also a prime.
 * @author Sean A. Irvine
 */
public class A062291 extends A000040 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (p.multiply(++mN).subtract(1).isProbablePrime()) {
        return p;
      }
    }
  }
}

