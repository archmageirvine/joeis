package irvine.oeis.a071;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A071681 Number of ways to represent the n-th prime as arithmetic mean of two other primes.
 * @author Sean A. Irvine
 */
public class A071681 extends A000040 {

  @Override
  public Z next() {
    final Z p = super.next();
    final Z s = p.multiply2();
    long cnt = 0;
    for (Z q = Z.TWO; !q.equals(p); q = mPrime.nextPrime(q)) {
      if (mPrime.isPrime(s.subtract(q))) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}
