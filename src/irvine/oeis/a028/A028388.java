package irvine.oeis.a028;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A028388 Good primes (version 2): prime(n) such that prime(n)^2 &gt; prime(n-i)*prime(n+i) for all 1 &lt;= i &lt;= n-1.
 * @author Sean A. Irvine
 */
public class A028388 implements Sequence {

  private final Fast mPrime = new Fast();
  private Z mP = Z.TWO;
  private long mN = 1;
  
  @Override
  public Z next() {
    while (true) {
      ++mN;
      mP = mPrime.nextPrime(mP);
      final Z s = mP.square();
      Z lo = mP;
      Z hi = mP;
      boolean ok = true;
      for (long k = 1; k < mN; ++k) {
        lo = mPrime.prevPrime(lo);
        hi = mPrime.nextPrime(hi);
        if (lo.multiply(hi).compareTo(s) >= 0) {
          ok = false;
          break;
        }
      }
      if (ok) {
        return mP;
      }
    }
  }
}
