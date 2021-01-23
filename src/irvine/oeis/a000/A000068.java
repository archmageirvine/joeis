package irvine.oeis.a000;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000068 Numbers n such that n^4 + 1 is prime.
 * @author Sean A. Irvine
 */
public class A000068 implements Sequence {

  private long mN = 0;
  private final Fast mPrime = new Fast();

  @Override
  public Z next() {
    while (true) {
      if (mPrime.isPrime(Z.valueOf(++mN).square().square().add(1))) {
        return Z.valueOf(mN);
      }
    }
  }
}

