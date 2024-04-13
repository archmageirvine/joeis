package irvine.oeis.a061;

import irvine.factor.prime.Fast;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A061597 Product of digits + 1 is prime, product of digits - 1 is prime, sum of digits + 1 is prime, sum of digits - 1 is prime and product of digits = sum of digits.
 * @author Sean A. Irvine
 */
public class A061597 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 3;

  @Override
  public Z next() {
    while (true) {
      final long v = ++mN;
      final long s = Functions.DIGIT_SUM.l(v);
      final long p = ZUtils.digitProduct(mN);
      if (s == p && mPrime.isPrime(s - 1) && mPrime.isPrime(s + 1)) {
        return Z.valueOf(mN);
      }
    }
  }
}
