package irvine.oeis.a075;

import java.util.Map;
import java.util.TreeMap;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A075109 Odd perfect powers (1 together with numbers m^k, m odd, k &gt;= 2).
 * @author Sean A. Irvine
 */
public class A075109 extends Sequence1 {

  private final TreeMap<Z, Z> mPriority = new TreeMap<>();
  private Z mBasis = Z.FIVE;

  @Override
  public Z next() {
    if (mPriority.isEmpty()) {
      mPriority.put(Z.NINE, Z.THREE);
      return Z.ONE;
    }
    while (mBasis.square().compareTo(mPriority.firstKey()) <= 0) {
      final Z key = mBasis.square();
      if (!mPriority.containsKey(key)) {
        mPriority.put(mBasis.square(), mBasis);
      }
      mBasis = mBasis.add(2);
    }
    final Map.Entry<Z, Z> e = mPriority.pollFirstEntry();
    final Z value = e.getKey();
    final Z v = e.getValue();
    mPriority.put(value.multiply(v), v);
    return value;
  }
}
