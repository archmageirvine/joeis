package irvine.oeis.a052;

import irvine.factor.prime.Fast;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A052020 Sum of digits of k is a prime proper factor of k.
 * @author Sean A. Irvine
 */
public class A052020 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 11;

  @Override
  public Z next() {
    while (true) {
      final long v = ++mN;
      final long sum = Functions.DIGIT_SUM.l(v);
      if (sum != mN && mN % sum == 0 && mPrime.isPrime(sum)) {
        return Z.valueOf(mN);
      }
    }
  }
}
