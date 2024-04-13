package irvine.oeis.a028;

import irvine.factor.prime.Fast;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A028835 Numbers whose iterated sum of digits is a prime.
 * @author Sean A. Irvine
 */
public class A028835 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      long u = ++mN;
      while (u > 9) {
        u = Functions.DIGIT_SUM.l(u);
      }
      if (mPrime.isPrime(Functions.DIGIT_SUM.l(u))) {
        return Z.valueOf(mN);
      }
    }
  }
}
