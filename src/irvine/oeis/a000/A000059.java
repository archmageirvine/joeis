package irvine.oeis.a000;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A000059 Numbers k such that (2k)^4 + 1 is prime.
 * @author Sean A. Irvine
 */
public class A000059 extends Sequence1 {

  private long mN = 0;
  private final Fast mPrime = new Fast();

  @Override
  public Z next() {
    while (true) {
      if (mPrime.isPrime(Z.valueOf(++mN).multiply2().square().square().add(1))) {
        return Z.valueOf(mN);
      }
    }
  }
}

