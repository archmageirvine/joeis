package irvine.oeis.a057;

import java.util.Map;
import java.util.TreeMap;

import irvine.math.MutableInteger;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.string.StringUtils;

/**
 * A057535 Numbers expressible as (a^2 - 1)(b^2 - 1) in 5 distinct ways.
 * @author Sean A. Irvine
 */
public class A057535 implements Sequence {

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private final TreeMap<Z, MutableInteger> mCounts = new TreeMap<>();
  private long mN = 2;

  @Override
  public Z next() {
    while (true) {
      Z t = Z.valueOf(mN).square().subtract(1);
      while (mCounts.isEmpty() || mCounts.firstKey().compareTo(t) >= 0) {
        for (long k = 2; k <= mN; ++k) {
          final Z s = t.multiply(k - 1).multiply(k + 1);
          final MutableInteger cnt = mCounts.get(s);
          if (cnt != null) {
            cnt.postIncrement();
          } else {
            mCounts.put(s, new MutableInteger(1));
          }
        }
        t = Z.valueOf(++mN).square().subtract(1);
        if (mVerbose && mN % 1000 == 0) {
          StringUtils.message("n=" + mN + " cachedCount=" + mCounts.size() + " " + mCounts.firstKey() + ".." + mCounts.lastKey());
        }
      }
      final Map.Entry<Z, MutableInteger> e = mCounts.pollFirstEntry();
      if (e.getValue().get() == 5) {
        return e.getKey();
      }
    }
  }
}
