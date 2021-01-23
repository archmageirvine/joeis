package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A023213 Primes p such that 4p + 3 is prime.
 * @author Sean A. Irvine
 */
public class A023213 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (mFast.isPrime(p.multiply(4).add(3))) {
        return p;
      }
    }
  }
}
