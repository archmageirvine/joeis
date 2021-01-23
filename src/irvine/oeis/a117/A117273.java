package irvine.oeis.a117;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A117273 Numbers n for which the product of the digits equals the number of prime numbers smaller than n.
 * @author Sean A. Irvine
 */
public class A117273 implements Sequence {

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
