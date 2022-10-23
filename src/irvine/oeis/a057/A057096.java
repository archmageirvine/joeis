package irvine.oeis.a057;

import java.util.Map;
import java.util.TreeMap;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A057096 Saint-Exup\u00e9ry numbers: ordered products of the three sides of Pythagorean triangles.
 * @author Sean A. Irvine
 */
public class A057096 extends Sequence1 {

  // Cf. A009111

  private final TreeMap<Z, Integer> mProducts = new TreeMap<>();
  private long mC = 4;
  private Z mA = null;
  private int mCount = 0;

  @Override
  public Z next() {
    if (mCount == 0) {
      while (mProducts.isEmpty() || mProducts.firstKey().compareTo(Z.valueOf(mC).square()) > 0) {
        final long c2 = ++mC * mC;
        for (long b = 2; b < mC; ++b) {
          final long a2 = c2 - b * b;
          final long a = LongUtils.sqrt(a2);
          if (a <= b && a * a == a2) {
            final Z prod = Z.valueOf(a).multiply(b).multiply(mC);
            mProducts.merge(prod, 1, Integer::sum);
          }
        }
      }
      final Map.Entry<Z, Integer> entry = mProducts.pollFirstEntry();
      mA = entry.getKey();
      mCount = entry.getValue();
    }
    --mCount;
    return mA;
  }
}
