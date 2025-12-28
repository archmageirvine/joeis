package irvine.oeis.a391;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A391765 allocated for Ruud H.G. van Tol.
 * @author Sean A. Irvine
 */
public class A391765 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    long k = 0;
    long p = 1;
    while (true) {
      ++k;
      p = mPrime.nextPrime(p);
      if (p % mN == 1) {
        return Z.valueOf(k);
      }
    }
  }
}

