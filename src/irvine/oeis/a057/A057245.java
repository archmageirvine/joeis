package irvine.oeis.a057;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.string.StringUtils;

/**
 * A057245 Numbers n such that n | Sum_{k=1..n} k!.
 * @author Sean A. Irvine
 */
public class A057245 implements Sequence {

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      long sum = 0;
      long f = 1;
      for (long k = 1; k <= mN && f != 0; ++k) {
        f *= k;
        f %= mN;
        sum += f;
        sum %= mN;
      }
      if (mVerbose && (mN & 0x1FFFF) == 0) {
        StringUtils.message("Search completed to n=" + mN);
      }
      if (sum == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
