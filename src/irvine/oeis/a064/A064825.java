package irvine.oeis.a064;

import java.util.TreeMap;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.string.StringUtils;

/**
 * A064825 Numbers which are the sums of three positive triangular numbers in exactly two different ways.
 * @author Sean A. Irvine
 */
public class A064825 extends Sequence1 {

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private long mN = 0;
  private long mM = 1;
  private long mT = 1;
  private final TreeMap<Long, Integer> mA = new TreeMap<>();

  @Override
  public Z next() {
    while (true) {
      if (++mN >= mT - 2) {
        for (long k = 1; k <= mM; ++k) {
          final long tk = k * (k + 1) / 2;
          for (long j = 1; j <= k; ++j) {
            final long s = mT + tk + j * (j + 1) / 2;
            mA.merge(s, 1, Integer::sum);
          }
        }
        mT = ++mM * (mM + 1) / 2;
      }
      final Integer v = mA.remove(mN);
      if (v != null && v == 2) {
        return Z.valueOf(mN);
      }
      if (mVerbose && mN % 100000 == 0) {
        StringUtils.message("Search completed to " + mN);
      }
    }
  }
}
