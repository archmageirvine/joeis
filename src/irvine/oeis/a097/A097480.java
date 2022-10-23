package irvine.oeis.a097;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A097480 Positive integers n such that 2n-15 is prime.
 *
 * @author Karsten Knuth
 */
public class A097480 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (mPrime.isPrime(Z.valueOf(++mN).multiply2().subtract(15))) {
        return Z.valueOf(mN);
      }
    }
  }
}
