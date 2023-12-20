package irvine.oeis.a067;

import irvine.factor.factor.Jaguar;
import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067533 Numbers k such that both k - tau(k) and k + tau(k) are prime where tau(k) = A000005(k).
 * @author Sean A. Irvine
 */
public class A067533 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 4;

  @Override
  public Z next() {
    while (true) {
      final long s0 = Jaguar.factor(++mN).sigma0AsLong();
      if (mPrime.isPrime(mN + s0) && mPrime.isPrime(mN - s0)) {
        return Z.valueOf(mN);
      }
    }
  }
}
