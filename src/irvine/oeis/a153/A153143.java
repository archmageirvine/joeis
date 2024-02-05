package irvine.oeis.a153;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A153143 Nonnegative numbers k such that 2k + 19 is prime.
 *
 * @author Karsten Knuth
 */
public class A153143 extends Sequence1 {

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
