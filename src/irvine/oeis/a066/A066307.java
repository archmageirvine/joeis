package irvine.oeis.a066;

import irvine.factor.prime.Fast;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066307 Nonprimes whose sum of digits is equal to its product of digits.
 * @author Georg Fischer
 */
public class A066307 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (!mPrime.isPrime(++mN)) {
        if (Functions.DIGIT_SUM.l(mN) == Functions.DIGIT_PRODUCT.l(mN)) {
          return Z.valueOf(mN);
        }
      }
    }
  }
}
