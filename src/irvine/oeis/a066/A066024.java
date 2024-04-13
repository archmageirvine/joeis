package irvine.oeis.a066;

import irvine.factor.prime.Fast;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066024 Numbers k such that the product of the digits of k minus the sum of the digits of k is prime.
 * @author Sean A. Irvine
 */
public class A066024 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final long v = ++mN;
      if (mPrime.isPrime(Functions.DIGIT_PRODUCT.l(v) - Functions.DIGIT_SUM.l(mN))) {
        return Z.valueOf(mN);
      }
    }
  }
}
