package irvine.oeis.a039;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A039738 a(n)=number of primes q&lt;p having (p mod q)=4, where p=n-th prime.
 * @author Sean A. Irvine
 */
public class A039738 implements Sequence {

  private final Fast mPrime = new Fast();
  private long mP = 1;

  @Override
  public Z next() {
    mP = mPrime.nextPrime(mP);
    long c = 0;
    for (long q = 5; q < mP; q = mPrime.nextPrime(q)) {
      if (mP % q == 4) {
        ++c;
      }
    }
    return Z.valueOf(c);
  }
}
