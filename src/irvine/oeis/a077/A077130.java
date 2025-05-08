package irvine.oeis.a077;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A077094.
 * @author Sean A. Irvine
 */
public class A077130 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long r = 2;
    while (true) {
      r = mPrime.nextPrime(r);
      boolean ok = true;
      for (long k = mN * mN + 1; k < (mN + 1) * (mN + 1); ++k) {
        if (k % r == 0) {
          ok = false;
          break;
        }
      }
      if (ok) {
        return Z.valueOf(r);
      }
    }
  }
}

