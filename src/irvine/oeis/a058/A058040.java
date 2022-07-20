package irvine.oeis.a058;

import irvine.factor.factor.Jaguar;
import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;
import irvine.util.string.StringUtils;

/**
 * A058040 (p_1,p_2,...,p_m) = prime factors of n; (m&gt;1,k&gt;0); n such that n = Sum_{i=1,2,..,m} k^(p_i).
 * @author Sean A. Irvine
 */
public class A058040 implements Sequence {

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
