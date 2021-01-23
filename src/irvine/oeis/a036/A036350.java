package irvine.oeis.a036;

import irvine.factor.factor.Cheetah;
import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A036350 Composite numbers such that the sum of the prime factors is odd (counted with multiplicity).
 * @author Sean A. Irvine
 */
public class A036350 implements Sequence {

  private final Fast mPrime = new Fast();
  private long mN = 3;

  @Override
  public Z next() {
    while (true) {
      if (!mPrime.isPrime(++mN) && !Cheetah.factor(mN).sopfr().isEven()) {
        return Z.valueOf(mN);
      }
    }
  }
}
