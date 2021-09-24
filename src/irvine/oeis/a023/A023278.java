package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A023278 Primes that remain prime through 3 iterations of function f(x) = 3x + 4.
 * @author Sean A. Irvine
 */
public class A023278 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (mPrime.isPrime(p.multiply(3).add(4)) && mPrime.isPrime(p.multiply(9).add(16)) && mPrime.isPrime(p.multiply(27).add(52))) {
        return p;
      }
    }
  }
}
