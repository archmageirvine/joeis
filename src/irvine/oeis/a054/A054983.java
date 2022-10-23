package irvine.oeis.a054;

import irvine.factor.factor.Jaguar;
import irvine.factor.prime.Fast;
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
      if (!mPrime.isPrime(++mN) && Jaguar.factor(mN).sigma().add(24).equals(Jaguar.factor(mN + 24).sigma())) {
        return Z.valueOf(mN);
      }
    }
  }
}
