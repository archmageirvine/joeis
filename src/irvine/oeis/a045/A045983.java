package irvine.oeis.a045;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A045983 Numbers k such that n or more consecutive integers starting at k have the same number of distinct prime divisors.
 * @author Sean A. Irvine
 */
public class A045983 extends Sequence1 {

  private long mN = 0;
  private long mK = 1;

  private boolean isOk(final long k) {
    final long omega = Jaguar.factor(k).omega();
    for (int j = 1; j < mN; ++j) {
      if (Jaguar.factor(k + j).omega() != omega) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    ++mN;
    while (!isOk(mK)) {
      ++mK;
    }
    return Z.valueOf(mK);
  }
}
