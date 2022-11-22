package irvine.oeis.a060;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A060448.
 * @author Sean A. Irvine
 */
public class A060462 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (++mN == 1 || !mPrime.isPrime(mN + 1)) {
        return Z.valueOf(mN);
      }
    }
  }
}
