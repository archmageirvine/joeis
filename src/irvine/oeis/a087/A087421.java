package irvine.oeis.a087;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.a000.A000142;

/**
 * A087421 Smallest prime &gt;= n!.
 * @author Sean A. Irvine
 */
public class A087421 extends A000142 {

  private final Fast mPrime = new Fast();

  @Override
  public Z next() {
    return mPrime.nextPrime(super.next().subtract(1));
  }
}
