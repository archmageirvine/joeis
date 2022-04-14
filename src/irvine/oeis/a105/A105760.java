package irvine.oeis.a105;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A105760 Nonnegative numbers k such that 2k+7 is prime.
 *
 * @author Karsten Knuth
 */
public class A105760 implements Sequence {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final long current = mN++;
      if (mPrime.isPrime(Z.valueOf(current).multiply2().add(7))) {
        return Z.valueOf(current);
      }
    }
  }
}
