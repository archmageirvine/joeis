package irvine.oeis.a076;

import irvine.factor.prime.Fast;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A076473 Number of pairs (p,q) of successive primes with p+q&lt;=n and gcd(p+q,n)=1.
 * @author Sean A. Irvine
 */
public class A076473 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long count = 0;
    long p = 2;
    long q = 3;
    while (p + q <= mN) {
      if (Functions.GCD.l(p + q, mN) == 1) {
        ++count;
      }
      p = q;
      q = mPrime.nextPrime(q);
    }
    return Z.valueOf(count);
  }
}
