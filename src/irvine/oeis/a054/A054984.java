package irvine.oeis.a054;

import irvine.factor.factor.Jaguar;
import irvine.factor.prime.Fast;
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
      if (!mPrime.isPrime(++mN) && Jaguar.factor(mN).sigma().add(720).equals(Jaguar.factor(mN + 720).sigma())) {
        return Z.valueOf(mN);
      }
    }
  }
}
