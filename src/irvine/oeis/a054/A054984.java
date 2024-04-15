package irvine.oeis.a054;

import irvine.factor.prime.Fast;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A054984 Composite numbers x such that sigma(x + 6!) = sigma(x + 720) = sigma(x) + 720.
 * @author Sean A. Irvine
 */
public class A054984 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 426;

  @Override
  public Z next() {
    while (true) {
      if (!mPrime.isPrime(++mN) && Functions.SIGMA.z(mN).add(720).equals(Functions.SIGMA.z(mN + 720))) {
        return Z.valueOf(mN);
      }
    }
  }
}
