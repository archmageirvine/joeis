package irvine.oeis.a054;

import irvine.factor.factor.Jaguar;
import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A054985 Composite numbers x such that sigma(x+120) = sigma(x)+120.
 * @author Sean A. Irvine
 */
public class A054985 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 181;

  @Override
  public Z next() {
    while (true) {
      if (!mPrime.isPrime(++mN) && Jaguar.factor(mN).sigma().add(120).equals(Jaguar.factor(mN + 120).sigma())) {
        return Z.valueOf(mN);
      }
    }
  }
}
