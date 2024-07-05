package irvine.oeis.a071;

import irvine.factor.prime.Fast;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A071179 n - (sum of prime factors of n) is prime.
 * @author Sean A. Irvine
 */
public class A071179 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 3;

  @Override
  public Z next() {
    while (true) {
      if (mPrime.isPrime(++mN - Functions.SOPF.l(mN))) {
        return Z.valueOf(mN);
      }
    }
  }
}
