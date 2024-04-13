package irvine.oeis.a066;

import irvine.factor.prime.Fast;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
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
      if (mPrime.isPrime(ZUtils.digitProduct(++mN) - Functions.DIGIT_SUM.l(mN))) {
        return Z.valueOf(mN);
      }
    }
  }
}
