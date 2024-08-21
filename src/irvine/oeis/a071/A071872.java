package irvine.oeis.a071;

import java.util.TreeMap;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A071868.
 * @author Sean A. Irvine
 */
public class A071872 extends Sequence1 {

  private long mN = 0;
  private final TreeMap<Long, Long> mCounts = new TreeMap<>();
  private Z mSum = Z.ZERO;

  @Override
  public Z next() {
    mCounts.merge(Functions.SIGMA0.l(++mN) * mN, 1L, Long::sum);
    final long cnt = mCounts.getOrDefault(mN - 1, 0L);
    mSum = mSum.add(cnt);
    return mSum.add(cnt);
  }
}
