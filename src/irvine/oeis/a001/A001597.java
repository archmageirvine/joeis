package irvine.oeis.a001;

import java.util.Map;
import java.util.TreeMap;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001597 Perfect powers: m^k where m <code>&gt; 0</code> and k <code>&gt;= 2</code>.
 * @author Sean A. Irvine
 */
public class A001597 implements Sequence {

  private final TreeMap<Z, Z> mPriority = new TreeMap<>();
  private Z mBasis = Z.THREE;

  @Override
  public Z next() {
    if (mPriority.isEmpty()) {
      mPriority.put(Z.FOUR, Z.TWO);
      return Z.ONE;
    }
    while (mBasis.square().compareTo(mPriority.firstKey()) <= 0) {
      final Z key = mBasis.square();
      if (!mPriority.containsKey(key)) {
        mPriority.put(mBasis.square(), mBasis);
      }
      mBasis = mBasis.add(1);
    }
    final Map.Entry<Z, Z> e = mPriority.pollFirstEntry();
    final Z value = e.getKey();
    final Z v = e.getValue();
    mPriority.put(value.multiply(v), v);
    return value;
  }
}
