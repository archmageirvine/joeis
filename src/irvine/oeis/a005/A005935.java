package irvine.oeis.a005;

import irvine.factor.prime.Fast;
import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A005935 Pseudoprimes to base 3.
 * @author Sean A. Irvine
 */
public class A005935 extends Sequence1 {

  private long mN = 90;
  private final Fast mPrime = new Fast();

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (!mPrime.isPrime(mN) && LongUtils.modPow(3, mN - 1, mN) == 1) {
        return Z.valueOf(mN);
      }
    }
  }
}
