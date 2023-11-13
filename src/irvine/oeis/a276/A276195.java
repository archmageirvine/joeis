package irvine.oeis.a276;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.a011.A011545;

/**
 * A276195 Smallest prime &gt;= decimal expansion of Pi truncated to n places (A011545).
 * @author Sean A. Irvine
 */
public class A276195 extends A011545 {

  private final Fast mPrime = new Fast();

  @Override
  public Z next() {
    return mPrime.nextPrime(super.next().subtract(1));
  }
}
