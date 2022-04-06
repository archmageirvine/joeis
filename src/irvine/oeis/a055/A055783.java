package irvine.oeis.a055;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A055783 Primes q of form q=10p+7, where p is also prime.
 * @author Sean A. Irvine
 */
public class A055783 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next().multiply(10).add(7);
      if (mPrime.isPrime(p)) {
        return p;
      }
    }
  }
}
