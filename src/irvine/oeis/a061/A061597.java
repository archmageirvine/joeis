package irvine.oeis.a061;

import irvine.factor.prime.Fast;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A061597 Numbers whose sum of digits s equals its product of digits and s + 1 and s - 1 are both prime.
 * @author Sean A. Irvine
 */
public class A061597 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 3;

  @Override
  public Z next() {
    while (true) {
      final long s = Functions.DIGIT_SUM.l(++mN);
      final long p = Functions.DIGIT_PRODUCT.l(mN);
      if (s == p && mPrime.isPrime(s - 1) && mPrime.isPrime(s + 1)) {
        return Z.valueOf(mN);
      }
    }
  }
}
