package irvine.oeis.a080;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A080132 Number of primes between n*10^13 and (n+1)*10^13.
 * @author Sean A. Irvine
 */
public class A080132 extends Sequence0 {

  // Too slow to be useful

  private final Fast mPrime = new Fast();
  private long mN = -100000000;

  @Override
  public Z next() {
    mN += 100000000;
    final long l = mN + 100000000;
    int c = 0;
    long p = mN;
    while ((p = mPrime.nextPrime(p)) < l) {
      ++c;
    }
    return Z.valueOf(c);
  }
}
