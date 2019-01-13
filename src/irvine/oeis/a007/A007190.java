package irvine.oeis.a007;

import irvine.factor.prime.Fast;
import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007190.
 * @author Sean A. Irvine
 */
public class A007190 implements Sequence {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z prod = Z.ONE;
    Z p = Z.ONE;
    for (long k = 1; k <= mN; ++k) {
      p = mPrime.nextPrime(p);
      prod = prod.multiply(p.pow(Stirling.secondKind(mN, k)));
    }
    return prod;
  }
}
