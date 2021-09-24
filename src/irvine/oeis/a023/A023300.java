package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A023300 Primes that remain prime through 3 iterations of function f(x) = 10x + 3.
 * @author Sean A. Irvine
 */
public class A023300 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (mPrime.isPrime(p.multiply(10).add(3)) && mPrime.isPrime(p.multiply(100).add(33)) && mPrime.isPrime(p.multiply(1000).add(333))) {
        return p;
      }
    }
  }
}
