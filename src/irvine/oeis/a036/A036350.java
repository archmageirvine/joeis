package irvine.oeis.a036;

import irvine.factor.factor.Jaguar;
import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A036350 Composite numbers such that the sum of the prime factors is odd (counted with multiplicity).
 * @author Sean A. Irvine
 */
public class A036350 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 3;

  @Override
  public Z next() {
    while (true) {
      if (!mPrime.isPrime(++mN) && Jaguar.factor(mN).sopfr().isOdd()) {
        return Z.valueOf(mN);
      }
    }
  }
}
