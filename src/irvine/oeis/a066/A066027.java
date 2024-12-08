package irvine.oeis.a066;

import irvine.factor.prime.Fast;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066027 Numbers k such that the sum of digits of k minus the product of digits of k is prime.
 * @author Sean A. Irvine
 */
public class A066027 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (mPrime.isPrime(Functions.DIGIT_SUM.l(++mN) - Functions.DIGIT_PRODUCT.l(mN))) {
        return Z.valueOf(mN);
      }
    }
  }
}
