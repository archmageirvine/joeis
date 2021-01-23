package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A023247 Primes p such that 3*p + 4 and 9*p + 16 are also prime.
 * @author Sean A. Irvine
 */
public class A023247 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (mFast.isPrime(p.multiply(3).add(4)) && mFast.isPrime(p.multiply(9).add(16))) {
        return p;
      }
    }
  }
}
