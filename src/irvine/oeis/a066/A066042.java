package irvine.oeis.a066;

import irvine.factor.prime.Fast;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066042 Numbers k such that k divided by ((sum of digits of k) multiplied by (product of digits of k)) is prime.
 * @author Sean A. Irvine
 */
public class A066042 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 11;

  @Override
  public Z next() {
    while (true) {
      final long prod = Functions.DIGIT_PRODUCT.l(++mN);
      if (prod != 0 && mN % prod == 0) {
        final long sum = Functions.DIGIT_SUM.l(mN);
        final long t = mN / prod;
        if (t % sum == 0 && mPrime.isPrime(t / sum)) {
          return Z.valueOf(mN);
        }
      }
    }
  }
}
