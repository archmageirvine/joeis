package irvine.oeis.a062;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A062302 Number of ways writing n-th prime as a sum of a prime and a nonprime.
 * @author Sean A. Irvine
 */
public class A062302 extends A000040 {

  @Override
  public Z next() {
    final long p = super.next().longValueExact();
    long cnt = 0;
    for (long q = 2; q < p; q = mPrime.nextPrime(q)) {
      if (!mPrime.isPrime(p - q)) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}

