package irvine.oeis.a063;

import irvine.factor.prime.Fast;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A063452 Numbers k such that k - mu(k) is prime.
 * @author Sean A. Irvine
 */
public class A063452 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (mPrime.isPrime(++mN - Functions.MOBIUS.i(mN))) {
        return Z.valueOf(mN);
      }
    }
  }
}
