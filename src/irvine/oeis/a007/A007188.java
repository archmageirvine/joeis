package irvine.oeis.a007;

import irvine.factor.prime.Fast;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007188.
 * @author Sean A. Irvine
 */
public class A007188 implements Sequence {

  private final Fast mPrime = new Fast();
  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z prod = Z.ONE;
    Z p = Z.ONE;
    for (long k = 0; k <= mN; ++k) {
      p = mPrime.nextPrime(p);
      prod = prod.multiply(p.pow(Binomial.binomial(mN, k)));
    }
    return prod;
  }
}
