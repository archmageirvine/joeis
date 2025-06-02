package irvine.oeis.a383;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A382454 allocated for Dar\u00edo Clavijo.
 * @author Sean A. Irvine
 */
public class A383752 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z prod = Z.ONE;
    for (long p = 2; p < mN; p = mPrime.nextPrime(p)) {
      final long r = mN % p;
      if (r != 0) {
        prod = prod.multiply(r);
      }
    }
    return prod;
  }
}
