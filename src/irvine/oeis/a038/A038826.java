package irvine.oeis.a038;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A038826 Number of primes between n*10^6 and (n+1)*10^6.
 * @author Sean A. Irvine
 */
public class A038826 implements Sequence {

  private final Fast mPrime = new Fast();
  private long mN = -1000000;

  @Override
  public Z next() {
    mN += 1000000;
    final long l = mN + 1000000;
    int c = 0;
    long p = mN;
    while ((p = mPrime.nextPrime(p)) < l) {
      ++c;
    }
    return Z.valueOf(c);
  }
}
