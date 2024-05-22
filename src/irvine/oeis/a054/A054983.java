package irvine.oeis.a054;

import irvine.factor.prime.Fast;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A054983 Composite numbers n such that sigma(n+24) = sigma(n) + 24.
 * @author Sean A. Irvine
 */
public class A054983 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 79;

  @Override
  public Z next() {
    while (true) {
      if (!mPrime.isPrime(++mN) && Functions.SIGMA1.z(mN).add(24).equals(Functions.SIGMA1.z(mN + 24))) {
        return Z.valueOf(mN);
      }
    }
  }
}
