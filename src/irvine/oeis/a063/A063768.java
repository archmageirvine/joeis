package irvine.oeis.a063;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.a001.A001018;

/**
 * A063768 Smallest prime &gt;= 8^n.
 * @author Sean A. Irvine
 */
public class A063768 extends A001018 {

  private final Fast mPrime = new Fast();

  @Override
  public Z next() {
    return mPrime.nextPrime(super.next());
  }
}
