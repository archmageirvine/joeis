package irvine.oeis.a061;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A061068 Primes which are the sum of a prime and its subscript.
 * @author Sean A. Irvine
 */
public class A061068 extends A000040 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next().add(++mN);
      if (mPrime.isPrime(t)) {
        return t;
      }
    }
  }
}
