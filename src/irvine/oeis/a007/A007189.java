package irvine.oeis.a007;

import irvine.factor.prime.Fast;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A007189 Multiplicative encoding of Stirling numbers of first kind.
 * @author Sean A. Irvine
 */
public class A007189 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z prod = Z.ONE;
    Z p = Z.ONE;
    for (long k = 1; k <= mN; ++k) {
      p = mPrime.nextPrime(p);
      prod = prod.multiply(p.pow(Functions.STIRLING1.z(mN, k).abs()));
    }
    return prod;
  }
}
