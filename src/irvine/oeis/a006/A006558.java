package irvine.oeis.a006;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006558 Start of first run of n consecutive integers with same number of divisors.
 * @author Sean A. Irvine
 */
public class A006558 implements Sequence {

  protected long mN = 0;
  private long mM = 0;

  private boolean check(final long n, final long k) {
    final long s = Jaguar.factor(k).sigma0AsLong();
    for (long j = k + 1; j < k + n; ++j) {
      if (Jaguar.factor(j).sigma0AsLong() != s) {
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
