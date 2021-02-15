package irvine.oeis.a038;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A038800 Number of primes between 10n and 10n+9.
 * @author Sean A. Irvine
 */
public class A038800 implements Sequence {

  private final Fast mPrime = new Fast();
  private long mN = -10;

  @Override
  public Z next() {
    mN += 10;
    final long l = mN + 10;
    int c = 0;
    long p = mN;
    while ((p = mPrime.nextPrime(p)) < l) {
      ++c;
    }
    return Z.valueOf(c);
  }
}
