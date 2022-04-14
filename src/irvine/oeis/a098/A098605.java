package irvine.oeis.a098;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A098605 Positive integers n such that 2n - 17 is prime.
 *
 * @author Karsten Knuth
 */
public class A098605 implements Sequence {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (mPrime.isPrime(Z.valueOf(++mN).multiply2().subtract(17))) {
        return Z.valueOf(mN);
      }
    }
  }
}
