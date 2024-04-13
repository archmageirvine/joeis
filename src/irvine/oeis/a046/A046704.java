package irvine.oeis.a046;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A046704 Additive primes: sum of digits is a prime.
 * @author Sean A. Irvine
 */
public class A046704 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (mPrime.isPrime(Functions.DIGIT_SUM.l(p))) {
        return p;
      }
    }
  }
}
