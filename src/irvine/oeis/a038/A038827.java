package irvine.oeis.a038;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A038827 Number of primes between n*10^7 and (n+1)*10^7.
 * @author Sean A. Irvine
 */
public class A038827 extends Sequence0 {

  private final Fast mPrime = new Fast();
  private long mN = -10000000;

  @Override
  public Z next() {
    mN += 10000000;
    final long l = mN + 10000000;
    int c = 0;
    long p = mN;
    while ((p = mPrime.nextPrime(p)) < l) {
      ++c;
    }
    return Z.valueOf(c);
  }
}
