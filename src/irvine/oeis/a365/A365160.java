package irvine.oeis.a365;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.a000.A000668;

/**
 * A087421 Smallest prime &gt;= n!.
 * @author Sean A. Irvine
 */
public class A365160 extends A000668 {

  private final Fast mPrime = new Fast();

  @Override
  public Z next() {
    final Z p = super.next();
    return mPrime.nextPrime(p).subtract(p);
  }
}
