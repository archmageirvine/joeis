package irvine.oeis.a038;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A038822 Number of primes between 100n and 100n+99.
 * @author Sean A. Irvine
 */
public class A038822 extends Sequence0 {

  private final Fast mPrime = new Fast();
  private long mN = -100;

  @Override
  public Z next() {
    mN += 100;
    final long l = mN + 100;
    int c = 0;
    long p = mN;
    while ((p = mPrime.nextPrime(p)) < l) {
      ++c;
    }
    return Z.valueOf(c);
  }
}
