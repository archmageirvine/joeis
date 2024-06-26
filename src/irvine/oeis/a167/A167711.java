package irvine.oeis.a167;

import irvine.factor.prime.Fast;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A167711 Numbers such that sum of digits is one more than a prime.
 * @author Sean A. Irvine
 */
public class A167711 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 2;

  @Override
  public Z next() {
    while (true) {
      if (mPrime.isPrime(Functions.DIGIT_SUM.l(++mN) - 1)) {
        return Z.valueOf(mN);
      }
    }
  }
}
