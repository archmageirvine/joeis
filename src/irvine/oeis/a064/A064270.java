package irvine.oeis.a064;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A064270 Primes of the form prime(k) - k; or primes arising in A014689.
 * @author Sean A. Irvine
 */
public class A064270 extends A000040 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next().subtract(++mN);
      if (mPrime.isPrime(t)) {
        return t;
      }
    }
  }
}
