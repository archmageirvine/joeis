package irvine.oeis.a038;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A038828 Number of primes between n*10^8 and (n+1)*10^8.
 * @author Sean A. Irvine
 */
public class A038828 extends Sequence0 {

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
