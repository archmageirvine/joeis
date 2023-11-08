package irvine.oeis.a276;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.a011.A011543;

/**
 * A087421 Smallest prime &gt;= n!.
 * @author Sean A. Irvine
 */
public class A276196 extends A011543 {

  private final Fast mPrime = new Fast();

  @Override
  public Z next() {
    return mPrime.nextPrime(super.next().subtract(1));
  }
}
