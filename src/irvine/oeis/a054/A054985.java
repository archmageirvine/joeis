package irvine.oeis.a054;

import irvine.factor.factor.Cheetah;
import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A054985 Composite numbers x such that sigma(x+120) = sigma(x)+120.
 * @author Sean A. Irvine
 */
public class A054985 implements Sequence {

  private final Fast mPrime = new Fast();
  private long mN = 181;

  @Override
  public Z next() {
    while (true) {
      if (!mPrime.isPrime(++mN) && Cheetah.factor(mN).sigma().add(120).equals(Cheetah.factor(mN + 120).sigma())) {
        return Z.valueOf(mN);
      }
    }
  }
}
