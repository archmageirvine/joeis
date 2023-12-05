package irvine.oeis.a067;

import java.util.Map;
import java.util.TreeMap;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067035 n sets a new record for the number of integers k such that n = k + reverse(k).
 * @author Sean A. Irvine
 */
public class A067035 extends Sequence1 {

  private final TreeMap<Long, Long> mValues = new TreeMap<>();
  private long mN = -1;
  private long mMax = -1;

  @Override
  public Z next() {
    while (true) {
      while (mValues.isEmpty() || mN < mValues.firstKey()) {
        ++mN;
        mValues.merge(mN + LongUtils.reverse(mN), 1L, Long::sum);
      }
      final Map.Entry<Long, Long> e = mValues.pollFirstEntry();
      if (e.getValue() > mMax) {
        mMax = e.getValue();
        return Z.valueOf(e.getKey());
      }
    }
  }
}

