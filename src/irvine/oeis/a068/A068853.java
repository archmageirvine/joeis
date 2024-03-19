package irvine.oeis.a068;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A068853 a(1) = 2; a(n+1) is the smallest prime &gt; a(n) which differs from it in every digit.
 * @author Sean A. Irvine
 */
public class A068853 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mP = 1;

  static boolean is(final long s, final long p) {
    long t = s;
    long q = p;
    while (t != 0) {
      if (t % 10 == q % 10) {
        return false;
      }
      q /= 10;
      t /= 10;
    }
    return true;
  }

  @Override
  public Z next() {
    final long s = mP;
    while (true) {
      mP = mPrime.nextPrime(mP);
      if (is(s, mP)) {
        return Z.valueOf(mP);
      }
    }
  }
}
