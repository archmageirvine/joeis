package irvine.oeis.a006;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A006558 Start of first run of n consecutive integers with same number of divisors.
 * @author Sean A. Irvine
 */
public class A006558 extends Sequence1 {

  protected long mN = 0;
  private long mM = 0;

  private boolean check(final long n, final long k) {
    final long s = Functions.SIGMA0.l(k);
    for (long j = k + 1; j < k + n; ++j) {
      if (Functions.SIGMA0.l(j) != s) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    ++mN;
    while (!check(mN, ++mM)) {
      // do nothing
    }
    return Z.valueOf(mM);
  }
}
