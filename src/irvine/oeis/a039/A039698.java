package irvine.oeis.a039;

import irvine.factor.prime.Fast;
import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A039698 Numbers n such that phi(n) + 1 is prime.
 * @author Sean A. Irvine
 */
public class A039698 implements Sequence {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (mPrime.isPrime(LongUtils.phi(++mN) + 1)) {
        return Z.valueOf(mN);
      }
    }
  }
}
