package irvine.oeis.a006;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006558.
 * @author Sean A. Irvine
 */
public class A006558 implements Sequence {

  private long mN = 0;
  private long mM = 0;

  private boolean check(final long n, final long k) {
    final long s = Cheetah.factor(k).sigma0();
    for (long j = k + 1; j < k + n; ++j) {
      if (Cheetah.factor(j).sigma0() != s) {
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
