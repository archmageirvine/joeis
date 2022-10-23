package irvine.oeis.a058;

import irvine.factor.factor.Jaguar;
import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;
import irvine.util.string.StringUtils;

/**
 * A058040 Numbers k such that if p_1,p_2,...,p_m, m&gt;1, are the prime factors of k, then there is some b&gt;0 such that k = Sum_{i=1..m} b^(p_i).
 * @author Sean A. Irvine
 */
public class A058040 extends Sequence1 {

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private long mN = 0;

  @Override
  public Z next() {
    outer:
    while (true) {
      ++mN;
      if (mVerbose && mN % 1000000 == 0) {
        StringUtils.message("Trying: " + mN);
      }
      final long[] p = ZUtils.toLong(Jaguar.factor(mN).toZArray());
      if (p.length > 1) {
        long k = 0;
        while (true) {
          ++k;
          long sum = 0;
          for (final long q : p) {
            sum += LongUtils.pow(k, q);
            if (sum > mN) {
              continue outer;
            }
          }
          if (sum == mN) {
            return Z.valueOf(mN);
          }
        }
      }
    }
  }
}
