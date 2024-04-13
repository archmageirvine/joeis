package irvine.oeis.a062;

import irvine.factor.prime.Fast;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A062713 Numbers k such that the sum of the digits of k is a prime factor of k.
 * @author Sean A. Irvine
 */
public class A062713 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      final long v = ++mN;
      final long d = Functions.DIGIT_SUM.l(v);
      if (mN % d == 0 && mPrime.isPrime(d)) {
        return Z.valueOf(mN);
      }
    }
  }
}
