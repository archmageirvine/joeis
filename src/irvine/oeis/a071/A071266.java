package irvine.oeis.a071;

import java.util.Map;
import java.util.TreeMap;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.array.DynamicLongArray;
import irvine.util.string.StringUtils;

/**
 * A071261.
 * @author Sean A. Irvine
 */
public class A071266 extends Sequence0 {

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private final TreeMap<Long, Integer> mA = new TreeMap<>();
  private final DynamicLongArray mFirsts = new DynamicLongArray();
  private int mN = -1;
  private long mM = 1;

  @Override
  public Z next() {
    if (++mN <= 1) {
      return mN == 0 ? Z.ONE : Z.ZERO;
    }
    while (mFirsts.get(mN) == 0) {
      while (mA.isEmpty() || mA.firstKey() > mM) {
        final long r = Functions.REVERSE.l(mM);
        if (r <= mM) {
          mA.merge(mM + r, 1, Integer::sum);
        }
        ++mM;
        if (mVerbose && mM % 100000000 == 0) {
          StringUtils.message("Search completed to " + mM);
        }
      }
      final Map.Entry<Long, Integer> e = mA.pollFirstEntry();
      final int cnt = e.getValue();
      if (mFirsts.get(cnt) == 0) {
        mFirsts.set(cnt, e.getKey());
        if (mVerbose) {
          StringUtils.message("Found solution for n=" + cnt + " is " + e.getKey());
        }
      }
    }
    return Z.valueOf(mFirsts.get(mN));
  }
}

