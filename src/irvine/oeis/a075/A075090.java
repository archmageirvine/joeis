package irvine.oeis.a075;

import java.util.Map;
import java.util.TreeMap;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A075090 Even perfect powers: numbers of the form (2*m)^k for some m&gt;=1 and k&gt;=2.
 * @author Sean A. Irvine
 */
public class A075090 extends Sequence1 {

  private final TreeMap<Z, Z> mPriority = new TreeMap<>();
  private Z mBasis = Z.FOUR;

  @Override
  public Z next() {
    if (mPriority.isEmpty()) {
      mPriority.put(Z.FOUR, Z.TWO);
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
