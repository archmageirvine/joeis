package irvine.oeis.a028;

import irvine.factor.prime.Fast;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A028834 Numbers whose sum of digits is a prime.
 * @author Sean A. Irvine
 */
public class A028834 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      final long v = ++mN;
      if (mPrime.isPrime(Functions.DIGIT_SUM.l(v))) {
        return Z.valueOf(mN);
      }
    }
  }
}
