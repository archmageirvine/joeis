package irvine.oeis.a117;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A117273 Numbers m such that the product of the digits of m is equal to the number of primes less than m.
 * @author Sean A. Irvine
 */
public class A117273 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mPiN = 0;
  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      final long pi = mPiN;
      if (mPrime.isPrime(++mN)) {
        ++mPiN;
      }
      if (ZUtils.digitProduct(mN) == pi) {
        return Z.valueOf(mN);
      }
    }
  }
}
