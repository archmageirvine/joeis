package irvine.oeis.a060;

import java.util.Map;
import java.util.TreeMap;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A060428 Numbers of form x^2 + xy + y^2 (with repetitions if more than one representation is possible).
 * @author Sean A. Irvine
 */
public class A060428 extends Sequence1 {

  private final TreeMap<Z, Integer> mA = new TreeMap<>();
  private Z mXLast = Z.ZERO;
  private Z mX2 = Z.ZERO;
  private Z mT = null;
  private long mCnt = 0;

  private void add(final Z n) {
    mA.merge(n, 1, Integer::sum);
  }

  @Override
  public Z next() {
    if (mCnt > 0) {
      --mCnt;
      return mT;
    }
    while (mA.isEmpty() || mA.firstKey().compareTo(mX2) > 0) {
      mXLast = mXLast.add(1);
      mX2 = mXLast.square();
      for (Z y = Z.ZERO; y.compareTo(mXLast) <= 0; y = y.add(1)) {
        final Z y2 = y.square();
        add(mX2.add(y2).add(mXLast.multiply(y)));
      }
    }
    final Map.Entry<Z, Integer> e = mA.pollFirstEntry();
    mT = e.getKey();
    mCnt = e.getValue() - 1;
    return mT;
  }
}

