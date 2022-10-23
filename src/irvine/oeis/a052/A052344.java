package irvine.oeis.a052;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A052344 Number of ways to write n as the unordered sum of two nonzero triangular numbers.
 * @author Sean A. Irvine
 */
public class A052344 extends Sequence0 {

  private long mN = -6;

  @Override
  public Z next() {
    mN += 8;
    long cnt = 0;
    for (long k = 3, k2; 2 * (k2 = k * k) <= mN; k += 2) {
      final long t = mN - k2;
      final long s = LongUtils.sqrt(t);
      if (s * s == t) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}
