package irvine.oeis.a065;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A065383 a(n) = smallest prime &gt;= n*(n + 1)/2.
 * @author Sean A. Irvine
 */
public class A065383 extends Sequence0 {

  private final Fast mPrime = new Fast();
  private long mN = -1;

  @Override
  public Z next() {
    return mPrime.nextPrime(Z.valueOf(++mN).multiply(mN + 1).divide2().subtract(1));
  }
}
