package irvine.oeis.a038;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A038832 Number of primes between n*10^12 and (n+1)*10^12.
 * @author Sean A. Irvine
 */
public class A038832 extends Sequence0 {

  private final Fast mPrime = new Fast();
  private long mN = -1000000000000L;

  @Override
  public Z next() {
    mN += 1000000000000L;
    final long l = mN + 1000000000000L;
    int c = 0;
    long p = mN;
    while ((p = mPrime.nextPrime(p)) < l) {
      ++c;
    }
    return Z.valueOf(c);
  }
}
