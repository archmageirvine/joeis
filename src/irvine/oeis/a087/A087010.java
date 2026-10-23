package irvine.oeis.a087;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A087010 Number of primes of form 4*k+1 between n and 2n (inclusive).
 * @author Sean A. Irvine
 */
public class A087010 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    long cnt = 0;
    long p = mPrime.nextPrime(mN++);
    while (p <= 2 * mN) {
      if ((p & 3) == 1) {
        ++cnt;
      }
      p = mPrime.nextPrime(p);
    }
    return Z.valueOf(cnt);
  }
}

