package irvine.oeis.a065;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A065328 a(n) is the number of primes less than or equal to prime(n) - n.
 * @author Sean A. Irvine
 */
public class A065328 extends A000040 {

  private long mN = 0;
  private long mM = 0;
  private long mPi = 0;

  @Override
  public Z next() {
    final long t = super.next().longValueExact() - ++mN;
    while (mM < t) {
      if (mPrime.isPrime(++mM)) {
        ++mPi;
      }
    }
    return Z.valueOf(mPi);
  }
}
