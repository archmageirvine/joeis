package irvine.oeis.a173;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A173059 Nonnegative numbers n such that 2*n + 17 is prime.
 *
 * @author Karsten Knuth
 */
public class A173059 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final long current = mN++;
      if (mPrime.isPrime(Z.valueOf(current).multiply2().add(17))) {
        return Z.valueOf(current);
      }
    }
  }
}
