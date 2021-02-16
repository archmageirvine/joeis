package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A023233 Primes p such that 9*p + 2 is also prime.
 * @author Sean A. Irvine
 */
public class A023233 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (mFast.isPrime(p.multiply(9).add(2))) {
        return p;
      }
    }
  }
}
