package irvine.oeis.a038;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A038824 Number of primes between n*10000 and (n+1)*10000.
 * @author Sean A. Irvine
 */
public class A038824 extends Sequence0 {

  private final Fast mPrime = new Fast();
  private long mN = -10000;

  @Override
  public Z next() {
    mN += 10000;
    final long l = mN + 10000;
    int c = 0;
    long p = mN;
    while ((p = mPrime.nextPrime(p)) < l) {
      ++c;
    }
    return Z.valueOf(c);
  }
}
