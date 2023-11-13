package irvine.oeis.a276;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.a011.A011551;

/**
 * A276198 Smallest prime &gt;= decimal expansion of phi truncated to n places (A011551), where phi is the golden ratio (A001622).
 * @author Sean A. Irvine
 */
public class A276198 extends A011551 {

  private final Fast mPrime = new Fast();

  @Override
  public Z next() {
    return mPrime.nextPrime(super.next().subtract(1));
  }
}
