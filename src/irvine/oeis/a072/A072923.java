package irvine.oeis.a072;

import irvine.factor.prime.Fast;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A072923 Number of primes of the form floor( (1+1/k)^n ), 1&lt;=k&lt;=n.
 * @author Sean A. Irvine
 */
public class A072923 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long cnt = 0;
    for (long k = 1; k <= mN; ++k) {
      if (mPrime.isPrime(new Q(k + 1, k).pow(mN).floor())) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}

