package irvine.oeis.a082;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A082597 Number of sets of consecutive primes whose arithmetic mean is an integer, the largest prime of a set is n-th prime.
 * @author Sean A. Irvine
 */
public class A082597 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mP = 1;

  @Override
  public Z next() {
    mP = mPrime.nextPrime(mP);
    long cnt = 0;
    long sum = 0;
    long m = 0;
    long q = mP;
    while (q > 1) {
      sum += q;
      ++m;
      if (sum % m == 0) {
        ++cnt;
      }
      q = mPrime.prevPrime(q);
    }
    return Z.valueOf(cnt);
  }
}
