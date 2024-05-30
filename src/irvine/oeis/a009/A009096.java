package irvine.oeis.a009;

import java.util.Map;
import java.util.TreeMap;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A009096 Ordered perimeters of Pythagorean triangles.
 * @author Sean A. Irvine
 */
public class A009096 extends Sequence1 {

  private final TreeMap<Long, Integer> mPerimeters = new TreeMap<>();
  private long mC = 4;
  private Z mP = null;
  private int mCount = 0;

  @Override
  public Z next() {
    if (mCount == 0) {
      while (mPerimeters.isEmpty() || mPerimeters.firstKey() > 2 * mC) {
        final long c2 = ++mC * mC;
        for (long b = 2; b < mC; ++b) {
          final long a2 = c2 - b * b;
          final long a = Functions.SQRT.l(a2);
          if (a <= b && a * a == a2) {
            final long p = a + b + mC;
            mPerimeters.merge(p, 1, (x, y) -> x + y);
          }
        }
      }
      final Map.Entry<Long, Integer> entry = mPerimeters.pollFirstEntry();
      mP = Z.valueOf(entry.getKey());
      mCount = entry.getValue();
    }
    --mCount;
    return mP;
  }
}
