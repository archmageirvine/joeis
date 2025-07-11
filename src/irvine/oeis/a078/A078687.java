package irvine.oeis.a078;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A078687 Number of x&gt;=0 such that prime(n)-2^x is prime.
 * @author Sean A. Irvine
 */
public class A078687 extends A000040 {

  @Override
  public Z next() {
    final long p = super.next().longValueExact();
    long cnt = 0;
    long t = 1;
    while (t < p) {
      if (mPrime.isPrime(p - t)) {
        ++cnt;
      }
      t <<= 1;
    }
    return Z.valueOf(cnt);
  }
}

