package irvine.oeis.a061;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A061673 Even numbers k such that k+1 and k-1 are both composite.
 * @author Sean A. Irvine
 */
public class A061673 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 24;

  @Override
  public Z next() {
    while (true) {
      mN += 2;
      if (!mPrime.isPrime(mN - 1) && !mPrime.isPrime(mN + 1)) {
        return Z.valueOf(mN);
      }
    }
  }
}

