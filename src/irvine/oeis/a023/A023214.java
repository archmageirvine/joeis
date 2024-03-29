package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A023214 Primes p such that 4*p + 5 is also prime.
 * @author Sean A. Irvine
 */
public class A023214 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (mPrime.isPrime(p.multiply(4).add(5))) {
        return p;
      }
    }
  }
}
