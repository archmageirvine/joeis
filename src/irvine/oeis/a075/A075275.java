package irvine.oeis.a075;

import irvine.factor.prime.Fast;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A075275 Numbers k such that k!! is an interprime, i.e., the average of two successive primes.
 * @author Sean A. Irvine
 */
public class A075275 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private int mN = 1;

  @Override
  public Z next() {
    while (true) {
      final Z df = Functions.MULTIFACTORIAL.z(++mN);
      final Z hi = mPrime.nextPrime(df);
      final Z lo = mPrime.prevPrime(df);
      if (hi.add(lo).equals(df.multiply2())) {
        return Z.valueOf(mN);
      }
    }
  }
}
