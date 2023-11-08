package irvine.oeis.a276;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.a011.A011551;

/**
 * A087421 Smallest prime &gt;= n!.
 * @author Sean A. Irvine
 */
public class A276198 extends A011551 {

  private final Fast mPrime = new Fast();

  @Override
  public Z next() {
    return mPrime.nextPrime(super.next().subtract(1));
  }
}
