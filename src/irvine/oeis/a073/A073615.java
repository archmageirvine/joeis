package irvine.oeis.a073;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A073565.
 * @author Sean A. Irvine
 */
public class A073615 extends Sequence2 {

  private final Fast mPrime = new Fast();
  private long mP = 2;
  private int mN = 0;

  private boolean is(final long[] d, final long p) {
    long q = p;
    for (final long v : d) {
      final long r = mPrime.nextPrime(q);
      if (r - q != v) {
        return false;
      }
      q = r;
    }
    return true;
  }

  @Override
  public Z next() {
    mP = mPrime.nextPrime(mP);
    final long[] d = new long[++mN];
    long q = mP;
    for (int k = 0; k < d.length; ++k) {
      final long r = mPrime.nextPrime(q);
      d[k] = r - q;
      q = r;
    }
    q = mP;
    while (true) {
      q = mPrime.nextPrime(q);
      if (is(d, q)) {
        return Z.valueOf(q);
      }
    }
  }
}
