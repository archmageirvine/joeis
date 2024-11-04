package irvine.oeis.a097;

import irvine.factor.factor.Jaguar;
import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A097792 Numbers of the form 4k^4 or (kp)^p for prime p &gt; 2 and k = 1, 2, 3, ....
 * @author Sean A. Irvine
 */
public class A097792 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 3;

  private boolean is(final long n) {
    if ((n & 3) == 0 && Z.valueOf(n / 4).root(4).auxiliary() == 1) {
      return true;
    }
    final Z zn = Z.valueOf(n);
    final Z r = zn.isPower();
    if (r == null) {
      return false;
    }
    final long p = zn.auxiliary();
    if (p <= 2) {
      return false;
    }
    if (mPrime.isPrime(p)) {
      return n % p == 0;
    }
    for (final Z qq : Jaguar.factor(p).toZArray()) {
      final long q = qq.longValue();
      if ((q & 1) == 1 && n % q == 0) {
        return true;
      }
    }
    return false;
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
