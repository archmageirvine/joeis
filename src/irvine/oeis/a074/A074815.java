package irvine.oeis.a074;

import irvine.factor.prime.Fast;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A006420.
 * @author Sean A. Irvine
 */
public class A074815 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = -1;

  private boolean is(final long n) {
    final long r = Functions.REVERSE.l(n);
    final long min = Math.min(r, 3 * n);
    final long max = Math.max(r, 3 * n);
    final long p = mPrime.nextPrime(min);
    return p > max;
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
