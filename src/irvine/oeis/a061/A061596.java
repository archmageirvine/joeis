package irvine.oeis.a061;

import irvine.factor.prime.Fast;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A061596 Product of digits + 1 is prime, product of digits - 1 is prime, sum of digits + 1 is prime and sum of digits - 1 is prime.
 * @author Sean A. Irvine
 */
public class A061596 extends Sequence0 {

  private final Fast mPrime = new Fast();
  private long mN = 3;

  @Override
  public Z next() {
    while (true) {
      final long s = Functions.DIGIT_SUM.l(++mN);
      final long p = Functions.DIGIT_PRODUCT.l(mN);
      if (mPrime.isPrime(s - 1) && mPrime.isPrime(s + 1) && mPrime.isPrime(p + 1) && mPrime.isPrime(p - 1)) {
        return Z.valueOf(mN);
      }
    }
  }
}
