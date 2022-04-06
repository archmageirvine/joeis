package irvine.oeis.a055;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A055784 Primes q of form q = 10p + 9, where p is also prime.
 * @author Sean A. Irvine
 */
public class A055784 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next().multiply(10).add(9);
      if (mPrime.isPrime(p)) {
        return p;
      }
    }
  }
}
