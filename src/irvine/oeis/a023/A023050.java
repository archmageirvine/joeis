package irvine.oeis.a023;

import java.util.Map;
import java.util.TreeMap;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A023050.
 * @author Sean A. Irvine
 */
public class A023050 implements Sequence {

  private final TreeMap<Z, Integer> mCounts = new TreeMap<>();
  private long mX = 1;

  @Override
  public Z next() {
    while (true) {
      Z x3 = Z.valueOf(mX).pow(3);
      while (mCounts.isEmpty() || mCounts.firstKey().compareTo(x3) > 0) {
        x3 = Z.valueOf(++mX).pow(3);
        for (long y = 1; y < mX; ++y) {
          if (LongUtils.gcd(mX, y) == 1) {
            final Z z = x3.add(Z.valueOf(y).pow(3));
            final Integer c = mCounts.get(z);
            mCounts.put(z, c == null ? 1 : c + 1);
          }
        }
      }
      final Map.Entry<Z, Integer> e = mCounts.pollFirstEntry();
      if (e.getValue() > 2) {
        return e.getKey();
      }
    }
  }
}
