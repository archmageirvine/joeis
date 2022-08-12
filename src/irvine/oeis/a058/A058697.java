package irvine.oeis.a058;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.a000.A000041;

/**
 * A058697 P(p(n)), P = primes (A000040), p = partition numbers (A000041).
 * @author Sean A. Irvine
 */
public class A058697 extends A000041 {

  private final Fast mPrime = new Fast();
  private long mP = 1;
  private long mM = 0;

  @Override
  public Z next() {
    final long t = super.next().longValueExact();
    while (mM < t) {
      mP = mPrime.nextPrime(mP);
      ++mM;
    }
    return Z.valueOf(mP);
  }
}
