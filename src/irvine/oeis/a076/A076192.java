package irvine.oeis.a076;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A076192 n == 1 mod 10 with property that n through n+9 contain no primes.
 * @author Sean A. Irvine
 */
public class A076192 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 190;

  @Override
  public Z next() {
    while (true) {
      mN += 10;
      if (mPrime.nextPrime(mN) - mN > 10) {
        return Z.valueOf(mN + 1);
      }
    }
  }
}
