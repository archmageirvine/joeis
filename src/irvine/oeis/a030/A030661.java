package irvine.oeis.a030;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A030661 Product of next 2 primes after n.
 * @author Sean A. Irvine
 */
public class A030661 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    final long p = mPrime.nextPrime(++mN);
    return Z.valueOf(p).multiply(mPrime.nextPrime(p));
  }
}

