package irvine.oeis.a072;

import java.util.Map;
import java.util.TreeMap;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Conjectural;
import irvine.oeis.Sequence0;
import irvine.util.array.DynamicLongArray;
import irvine.util.string.StringUtils;

/**
 * A071265.
 * @author Sean A. Irvine
 */
public class A072041 extends Sequence0 implements Conjectural {

  private static final long HEURISTIC = 1000;
  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private final DynamicLongArray mFirsts = new DynamicLongArray();
  private final TreeMap<Long, Integer> mA = new TreeMap<>();
  private long mK = 1;
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    if (mN == 1) {
      return Z.ZERO;
    }
    while (mN * mN * HEURISTIC > mK) {
      while (mA.isEmpty() || mA.firstKey() > mK) {
        final long r = Functions.REVERSE.l(mK);
        mA.merge(mK + r, 1, Integer::sum);
        ++mK;
        if (mVerbose && mK % 1000000 == 0) {
          StringUtils.message("Search completed to k=" + mK);
        }
      }
      final Map.Entry<Long, Integer> e = mA.pollFirstEntry();
      final int representations = e.getValue();
      if (mFirsts.get(representations) == 0) {
        if (representations < mN && representations > 1) {
          throw new RuntimeException("Heuristic failed: previously reported -1 for n=" + representations + " should have been " + e.getKey());
        }
        mFirsts.set(representations, e.getKey());
      }
    }
    final long res = mFirsts.get(mN);
    return res == 0 ? Z.NEG_ONE : Z.valueOf(res);
  }
}

