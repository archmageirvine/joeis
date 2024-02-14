package irvine.oeis.a068;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A061398.
 * @author Sean A. Irvine
 */
public class A068372 extends Sequence1 {

  static final long[] PRIMORIALS = {1, 2, 6, 30, 210, 2310, 30030, 510510, 9699690, 223092870, 6469693230L, 200560490130L, 7420738134810L, 304250263527210L, 13082761331670030L, 614889782588491410L};
  private final Fast mFast = new Fast();
  private long mN = 1;

  private boolean is(final long n) {
    for (int k = 1; PRIMORIALS[k] < n; ++k) {
      if (!mFast.isPrime(n - PRIMORIALS[k])) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      if (is(++mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
