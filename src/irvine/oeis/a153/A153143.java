package irvine.oeis.a153;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A153143 Nonnegative numbers n such that 2n + 19 is prime.
 *
 * @author Karsten Knuth
 */
public class A153143 implements Sequence {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final long current = mN++;
      if (mPrime.isPrime(Z.valueOf(current).multiply2().add(19))) {
        return Z.valueOf(current);
      }
    }
  }
}
