package irvine.oeis.a055;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A055781 Primes q of the form q = 10p + 1, where p is also prime.
 * @author Sean A. Irvine
 */
public class A055781 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next().multiply(10).add(1);
      if (mPrime.isPrime(p)) {
        return p;
      }
    }
  }
}
