package irvine.oeis.a053;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A053603 Number of ways to write n as an ordered sum of two nonzero triangular numbers.
 * @author Sean A. Irvine
 */
public class A053603 extends Sequence0 {

  private long mN = -6;

  @Override
  public Z next() {
    mN += 8;
    long cnt = 0;
    for (long k = 3, k2; 2 * (k2 = k * k) <= mN; k += 2) {
      final long t = mN - k2;
      final long s = LongUtils.sqrt(t);
      if (s * s == t) {
        cnt += s == k ? 1 : 2;
      }
    }
    return Z.valueOf(cnt);
  }
}
