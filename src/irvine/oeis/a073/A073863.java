package irvine.oeis.a073;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A073863 a(1) = 4; a(n) = average of the largest and the smallest n-digit primes.
 * @author Sean A. Irvine
 */
public class A073863 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private Z mN = Z.ONE;

  @Override
  public Z next() {
    final Z lo = mPrime.nextPrime(mN);
    mN = mN.multiply(10);
    final Z hi = mPrime.prevPrime(mN);
    return hi.add(lo).divide2();
  }
}
