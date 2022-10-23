package irvine.oeis.a039;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A039737 a(n)=number of primes q&lt;p having (p mod q)=3, where p=n-th prime.
 * @author Sean A. Irvine
 */
public class A039737 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mP = 1;

  @Override
  public Z next() {
    mP = mPrime.nextPrime(mP);
    long c = 0;
    for (long q = 5; q < mP; q = mPrime.nextPrime(q)) {
      if (mP % q == 3) {
        ++c;
      }
    }
    return Z.valueOf(c);
  }
}
