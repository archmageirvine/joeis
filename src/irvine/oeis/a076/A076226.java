package irvine.oeis.a076;

import java.util.HashMap;
import java.util.Map;

import irvine.math.z.Z;
import irvine.util.string.StringUtils;

/**
 * A076221.
 * @author Sean A. Irvine
 */
public class A076226 extends A076221 {

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (mVerbose && mN % 100 == 0) {
        StringUtils.message("Starting " + mN);
      }
      final Map<Z, Long> counts = new HashMap<>();
      for (long k = 0; k < mN; ++k) {
        counts.merge(super.next(), 1L, Long::sum);
      }
      Z maxKey = null;
      long maxCount = 0;
      for (final Map.Entry<Z, Long> e : counts.entrySet()) {
        if (e.getValue() >= maxCount) {
          if (e.getValue() > maxCount || e.getKey().compareTo(maxKey) > 0) {
            maxKey = e.getKey();
            maxCount = e.getValue();
          }
        }
      }
      if (!maxKey.equals(mN - 1)) {
        return Z.valueOf(mN);
      }
    }
  }
}
