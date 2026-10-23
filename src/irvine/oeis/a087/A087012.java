package irvine.oeis.a087;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A087012 Numbers m such that the number of primes of form 4*k+1 between m and 2*m equals the number of primes of form 4*k+3 between m and 2*m (inclusive).
 * @author Sean A. Irvine
 */
public class A087012 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      long cnt = 0;
      long p = mPrime.nextPrime(mN++);
      while (p <= 2 * mN) {
        if ((p & 3) == 3) {
          ++cnt;
        } else if (p != 2) {
          --cnt;
        }
        p = mPrime.nextPrime(p);
      }
      if (cnt == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}

