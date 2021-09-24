package irvine.oeis.a023;

import irvine.math.z.Z;

/**
 * A023317 Primes that remain prime through 4 iterations of function f(x) = 6x + 5.
 * @author Sean A. Irvine
 */
public class A023317 extends A023288 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (mPrime.isPrime(p.multiply(1296).add(1295))) {
        return p;
      }
    }
  }
}
