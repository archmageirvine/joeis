package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A023301 Primes that remain prime through 3 iterations of function f(x) = 10x + 9.
 * @author Sean A. Irvine
 */
public class A023301 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (mPrime.isPrime(p.multiply(10).add(9)) && mPrime.isPrime(p.multiply(100).add(99)) && mPrime.isPrime(p.multiply(1000).add(999))) {
        return p;
      }
    }
  }
}
