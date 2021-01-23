package irvine.oeis.a022;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A022094 Sum of first prime(n) primes.
 * @author Sean A. Irvine
 */
public class A022094 extends A000040 {

  private long mN = 0;
  private Z mSum = Z.ZERO;

  @Override
  public Z next() {
    do {
      mSum = mSum.add(super.next());
    } while (!mFast.isPrime(++mN));
    return mSum;
  }
}
