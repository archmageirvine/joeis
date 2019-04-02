package irvine.oeis.a007;

import irvine.factor.prime.Fast;
import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007189 Multiplicative encoding of Stirling numbers of first kind.
 * @author Sean A. Irvine
 */
public class A007189 implements Sequence {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z prod = Z.ONE;
    Z p = Z.ONE;
    for (long k = 1; k <= mN; ++k) {
      p = mPrime.nextPrime(p);
      prod = prod.multiply(p.pow(Stirling.firstKind(mN, k).abs()));
    }
    return prod;
  }
}
