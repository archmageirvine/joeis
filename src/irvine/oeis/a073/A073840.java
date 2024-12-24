package irvine.oeis.a073;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A073840 Product of the composite numbers between n and 2n (both inclusive).
 * @author Sean A. Irvine
 */
public class A073840 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z prod = Z.ONE;
    for (long k = mN; k <= 2 * mN; ++k) {
      if (!mPrime.isPrime(k)) {
        prod = prod.multiply(k);
      }
    }
    return prod;
  }
}
