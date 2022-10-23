package irvine.oeis.a101;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A101448 Nonnegative numbers k such that 2k + 11 is prime.
 *
 * @author Karsten Knuth
 */
public class A101448 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final long current = mN++;
      if (mPrime.isPrime(Z.valueOf(current).multiply2().add(11))) {
        return Z.valueOf(current);
      }
    }
  }
}
