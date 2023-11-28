package irvine.oeis.a066;

import irvine.factor.prime.Fast;
import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066978 a(n) = gcd(prime(2*n)+1, prime(n)+1).
 * @author Sean A. Irvine
 */
public class A066978 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mP = 1;
  private long mQ = 1;

  @Override
  public Z next() {
    mP = mPrime.nextPrime(mPrime.nextPrime(mP));
    mQ = mPrime.nextPrime(mQ);
    return Z.valueOf(LongUtils.gcd(mP + 1, mQ + 1));
  }
}
