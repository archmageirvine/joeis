package irvine.oeis.a078;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A078455 a(1) = 2. For n&gt;1, a(n) = smallest m such that m == 0 (mod prime(n)), m + 1 == 0 (mod prime(n+1)) and m-1 == 0 (mod prime(n-1)).
 * @author Sean A. Irvine
 */
public class A078455 extends A000040 {

  @Override
  public Z next() {
    final Z pp = super.next();
    if (Z.TWO.equals(pp)) {
      return Z.TWO;
    }
    final long q = pp.longValueExact();
    final long p = mPrime.prevPrime(q);
    final long r = mPrime.nextPrime(q);
    long m = 0;
    while (true) {
      if (++m % p == 0 && (m + 1) % q == 0 && (m + 2) % r == 0) {
        return Z.valueOf(m + 1);
      }
    }
  }
}

