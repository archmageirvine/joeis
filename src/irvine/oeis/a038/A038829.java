package irvine.oeis.a038;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A038829 Number of primes between n*10^9 and (n+1)*10^9.
 * @author Sean A. Irvine
 */
public class A038829 extends Sequence0 {

  private final Fast mPrime = new Fast();
  private long mN = -1000000000;

  @Override
  public Z next() {
    mN += 1000000000;
    final long l = mN + 1000000000;
    int c = 0;
    long p = mN;
    while ((p = mPrime.nextPrime(p)) < l) {
      ++c;
    }
    return Z.valueOf(c);
  }
}
