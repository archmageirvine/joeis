package irvine.oeis.a009;

import java.util.Map;
import java.util.TreeMap;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A009111.
 * @author Sean A. Irvine
 */
public class A009111 implements Sequence {

  private final TreeMap<Long, Integer> mAreas = new TreeMap<>();
  private long mC = 4;
  private Z mA = null;
  private int mCount = 0;

  @Override
  public Z next() {
    if (mCount == 0) {
      while (mAreas.isEmpty() || mAreas.firstKey() > 2 * mC) {
        final long c2 = ++mC * mC;
        for (long b = 2; b < mC; ++b) {
          final long a2 = c2 - b * b;
          final long a = LongUtils.sqrt(a2);
          if (a <= b && a * a == a2) {
            final long area = a * b / 2;
            mAreas.merge(area, 1, (x, y) -> x + y);
          }
        }
      }
      final Map.Entry<Long, Integer> entry = mAreas.pollFirstEntry();
      mA = Z.valueOf(entry.getKey());
      mCount = entry.getValue();
    }
    --mCount;
    return mA;
  }
}
