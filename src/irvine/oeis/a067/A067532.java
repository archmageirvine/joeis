package irvine.oeis.a067;

import irvine.factor.factor.Jaguar;
import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067180.
 * @author Sean A. Irvine
 */
public class A067532 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (mPrime.isPrime(++mN + Jaguar.factor(mN).sigma0AsLong())) {
        return Z.valueOf(mN);
      }
    }
  }
}
