package irvine.oeis.a050;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A050216 Number of primes between (prime(n))^2 and (prime(n+1))^2, with a(0) = 2 by convention.
 * @author Sean A. Irvine
 */
public class A050216 extends A000040 {

  {
    setOffset(0);
  }

  private Z mHi = Z.ZERO;

  @Override
  public Z next() {
    final Z lo = mHi;
    mHi = super.next().square();
    long cnt = 0;
    for (Z p = mPrime.nextPrime(lo); p.compareTo(mHi) < 0; p = mPrime.nextPrime(p), ++cnt) {
      // do nothing
    }
    return Z.valueOf(cnt);
  }
}
