package irvine.oeis.a051;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A051507 Primes p such that p*q+2 is prime, where q is next prime after p.
 * @author Sean A. Irvine
 */
public class A051507 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (p.multiply(mPrime.nextPrime(p)).add(2).isProbablePrime()) {
        return p;
      }
    }
  }
}

