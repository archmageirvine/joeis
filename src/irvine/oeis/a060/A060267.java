package irvine.oeis.a060;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A060267 Difference between 2 closest primes surrounding 2n.
 * @author Sean A. Irvine
 */
public class A060267 extends Sequence2 {

  private final Fast mPrime = new Fast();
  private long mN = 2;

  @Override
  public Z next() {
    mN += 2;
    return Z.valueOf(mPrime.nextPrime(mN) - mPrime.prevPrime(mN));
  }
}
