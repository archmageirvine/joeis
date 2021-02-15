package irvine.oeis.a038;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A038830 Number of primes between n*10^10 and (n+1)*10^10.
 * @author Sean A. Irvine
 */
public class A038830 implements Sequence {

  private final Fast mPrime = new Fast();
  private long mN = -10000000000L;

  @Override
  public Z next() {
    mN += 10000000000L;
    final long l = mN + 10000000000L;
    int c = 0;
    long p = mN;
    while ((p = mPrime.nextPrime(p)) < l) {
      ++c;
    }
    return Z.valueOf(c);
  }
}
