package irvine.oeis.a062;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A062296.
 * @author Sean A. Irvine
 */
public class A062301 extends A000040 {

  @Override
  public Z next() {
    final long p = super.next().longValueExact();
    long cnt = 0;
    for (long q = 2; 2 * q <= p; q = mPrime.nextPrime(q)) {
      if (mPrime.isPrime(p - q)) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}

