package irvine.oeis.a097;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A097338 Positive integers n such that 2n-11 is prime.
 *
 * @author Karsten Knuth
 */
public class A097338 implements Sequence {

  private long mN = 0;
  private final Fast mPrime = new Fast();

  @Override
  public Z next() {
    while (true) {
      if (mPrime.isPrime(Z.valueOf(++mN).multiply2().subtract(11))) {
        return Z.valueOf(mN);
      }
    }
  }
}

