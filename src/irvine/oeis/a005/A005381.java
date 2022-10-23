package irvine.oeis.a005;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A005381 Numbers k such that k and k-1 are composite.
 * @author Sean A. Irvine
 */
public class A005381 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 5;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (!mPrime.isPrime(mN) && !mPrime.isPrime(mN - 1)) {
        return Z.valueOf(mN);
      }
    }
  }
}
