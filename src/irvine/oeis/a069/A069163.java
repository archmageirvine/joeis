package irvine.oeis.a069;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A069163 Number of symmetric primes between n^2 and (n+2)^2. Two primes are termed symmetric in n^2 to (n+2)^2 if there is a k &lt; 2n such that mid-k and mid+k are both prime, where mid =n(n+2).
 * @author Sean A. Irvine
 */
public class A069163 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    final long mid = ++mN * (mN + 2);
    long count = 0;
    for (long p = mPrime.prevPrime(mid); p > mN * mN; p = mPrime.prevPrime(p)) {
      if (mPrime.isPrime(2 * mid - p)) {
        ++count;
      }
    }
    return Z.valueOf(count);
  }
}

