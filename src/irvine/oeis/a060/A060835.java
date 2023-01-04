package irvine.oeis.a060;

import java.util.Map;
import java.util.TreeMap;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.DynamicArray;

/**
 * A060835 Least number of the form x^2 + y^3 (x, y positive) in n ways.
 * @author Sean A. Irvine
 */
public class A060835 extends Sequence1 {

  private final TreeMap<Z, Integer> mA = new TreeMap<>();
  private final DynamicArray<Z> mFirsts = new DynamicArray<>();
  private int mN = 0;
  private long mS = 1;
  private Z mSquare = Z.ONE;

  private void augment(final Map<Z, Integer> map, final Z key) {
    map.merge(key, 1, Integer::sum);
  }

  @Override
  public Z next() {
    ++mN;
    while (mFirsts.get(mN) == null) {
      while (mA.isEmpty() || mA.firstKey().compareTo(mSquare) > 0) {
        final Z cube = Z.valueOf(mS).pow(3);
        for (long k = 1; k <= mS; ++k) {
          final Z kz = Z.valueOf(k);
          augment(mA, cube.add(kz.square()));
          if (k != mS) {
            augment(mA, kz.pow(3).add(mSquare));
          }
        }
        mSquare = Z.valueOf(++mS).square();
      }
      final Map.Entry<Z, Integer> e = mA.pollFirstEntry();
      final int cnt = e.getValue();
      if (mFirsts.get(cnt) == null) {
        mFirsts.set(cnt, e.getKey());
      }
    }
    return mFirsts.get(mN);
  }
}
