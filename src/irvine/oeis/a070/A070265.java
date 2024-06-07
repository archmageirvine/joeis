package irvine.oeis.a070;

import java.util.Map;
import java.util.TreeMap;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A070265 Odd powers: numbers n = m^e with e &gt; 1 odd.
 * @author Sean A. Irvine
 */
public class A070265 extends Sequence1 {

  private final TreeMap<Z, Z> mPriority = new TreeMap<>();
  private Z mBasis = Z.THREE;

  @Override
  public Z next() {
    if (mPriority.isEmpty()) {
      mPriority.put(Z.EIGHT, Z.FOUR);
      return Z.ONE;
    }
    while (mBasis.square().compareTo(mPriority.firstKey()) <= 0) {
      final Z key = mBasis.square();
      if (!mPriority.containsKey(key)) {
        mPriority.put(mBasis.pow(3), mBasis.square());
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
