package irvine.oeis.a391;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A391352 allocated for Clark Kimberling.
 * @author Sean A. Irvine
 */
public class A391352 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final long m = 3 * ++mN;
      if (m - mPrime.prevPrime(m) == mPrime.nextPrime(m) - m) {
        return Z.valueOf(mN);
      }
    }
  }
}
