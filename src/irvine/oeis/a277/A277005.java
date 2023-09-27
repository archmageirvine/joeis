package irvine.oeis.a277;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.a036.A036691;

/**
 * A277005 Least prime greater than n-th compositorial.
 * @author Sean A. Irvine
 */
public class A277005 extends A036691 {

  private final Fast mPrime = new Fast();

  @Override
  public Z next() {
    return mPrime.nextPrime(super.next());
  }
}
