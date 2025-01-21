package irvine.oeis.a074;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a006.A006988;

/**
 * A074383 Difference between (1+10^n)-th and (10^n)-th primes.
 * @author Sean A. Irvine
 */
public class A074383 extends Sequence0 {

  private final Sequence mA = new A006988();
  private final Fast mPrime = new Fast();

  @Override
  public Z next() {
    final Z p = mA.next();
    return mPrime.nextPrime(p).subtract(p);
  }
}
