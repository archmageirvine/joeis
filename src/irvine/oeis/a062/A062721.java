package irvine.oeis.a062;

import irvine.math.z.Z;
import irvine.oeis.a001.A001358;

/**
 * A062721 Numbers k such that k is a product of two primes and k-2 is prime.
 * @author Sean A. Irvine
 */
public class A062721 extends A001358 {

  @Override
  public Z next() {
    while (true) {
      final Z semiprime = super.next();
      if (semiprime.subtract(2).isProbablePrime()) {
        return semiprime;
      }
    }
  }
}

