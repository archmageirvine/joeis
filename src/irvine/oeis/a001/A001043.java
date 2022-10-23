package irvine.oeis.a001;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A001043 Numbers that are the sum of 2 successive primes.
 * @author Sean A. Irvine
 */
public class A001043 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private Z mA = Z.TWO;

  @Override
  public Z next() {
    final Z t = mPrime.nextPrime(mA);
    final Z r = t.add(mA);
    mA = t;
    return r;
  }
}
