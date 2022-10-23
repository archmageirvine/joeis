package irvine.oeis.a097;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A097069 Positive integers n such that 2n - 9 is prime.
 * @author Karsten Knuth
 */
public class A097069 extends Sequence1 {

  private long mN = 0;
  private final Fast mPrime = new Fast();

  @Override
  public Z next() {
    while (true) {
      if (mPrime.isPrime(Z.valueOf(++mN).multiply2().subtract(9))) {
        return Z.valueOf(mN);
      }
    }
  }
}

