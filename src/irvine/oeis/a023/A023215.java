package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A023215 Primes p such that 4*p + 7 is also prime.
 * @author Sean A. Irvine
 */
public class A023215 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (mFast.isPrime(p.multiply(4).add(7))) {
        return p;
      }
    }
  }
}
