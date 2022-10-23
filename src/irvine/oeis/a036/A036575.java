package irvine.oeis.a036;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A036575 a(n) = least number not of form [ (a^2/n) ] + [ (b^2)/n ].
 * @author Sean A. Irvine
 */
public class A036575 extends Sequence1 {

  private long mN = 0;

  private boolean isOk(final long m) {
    final long t = m * mN;
    for (long a = 0; a * a <= t; ++a) {
      final long a2m = a * a / mN;
      final long r = m - a2m;
      final long b = LongUtils.sqrt(r * mN);
      if ((b * b) / mN == r || ((b + 1) * (b + 1)) / mN == r) {
        return true;
      }
    }
    return false;
  }

  @Override
  public Z next() {
    ++mN;
    long m = 0;
    while (true) {
      if (!isOk(++m)) {
        return Z.valueOf(m);
      }
    }
  }
}
