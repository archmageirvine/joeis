package irvine.oeis.a073;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A073828.
 * @author Sean A. Irvine
 */
public class A073838 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z prod = Z.ONE;
    for (long k = mPrime.nextPrime(mN - 1); k <= 2 * mN; k = mPrime.nextPrime(k)) {
      prod = prod.multiply(k);
    }
    return prod;
  }
}
