package irvine.oeis.a038;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A038825 Number of primes between n*100000 and (n+1)*100000.
 * @author Sean A. Irvine
 */
public class A038825 implements Sequence {

  private final Fast mPrime = new Fast();
  private long mN = -100000;

  @Override
  public Z next() {
    mN += 100000;
    final long l = mN + 100000;
    int c = 0;
    long p = mN;
    while ((p = mPrime.nextPrime(p)) < l) {
      ++c;
    }
    return Z.valueOf(c);
  }
}
