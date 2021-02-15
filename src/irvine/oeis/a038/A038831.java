package irvine.oeis.a038;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A038831 Number of primes between n*10^11 and (n+1)*10^11.
 * @author Sean A. Irvine
 */
public class A038831 implements Sequence {

  private final Fast mPrime = new Fast();
  private long mN = -100000000000L;

  @Override
  public Z next() {
    mN += 100000000000L;
    final long l = mN + 100000000000L;
    int c = 0;
    long p = mN;
    while ((p = mPrime.nextPrime(p)) < l) {
      ++c;
    }
    return Z.valueOf(c);
  }
}
