package irvine.oeis.a145;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.a005.A005179;

/**
 * A145344 a(n) = smallest prime &gt;= the smallest positive integer with exactly n divisors.
 * @author Sean A. Irvine
 */
public class A145344 extends A005179 {

  private final Fast mPrime = new Fast();

  @Override
  public Z next() {
    return mPrime.nextPrime(super.next().subtract(1));
  }
}
