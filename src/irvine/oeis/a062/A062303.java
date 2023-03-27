package irvine.oeis.a062;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A062303 Number of ways writing n-th prime as a sum of a nonprime and a composite.
 * @author Sean A. Irvine
 */
public class A062303 extends A000040 {

  @Override
  public Z next() {
    final long p = super.next().longValueExact();
    long cnt = 0;
    for (long q = 1; 2 * q <= p; ++q) {
      if (!mPrime.isPrime(q) && !mPrime.isPrime(p - q)) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}

