package irvine.oeis.a001;

import java.util.Map;
import java.util.TreeMap;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A001597 Perfect powers: m^k where m &gt; 0 and k &gt;= 2.
 * @author Sean A. Irvine
 */
public class A001597 extends Sequence1 {

  private final TreeMap<Z, Z> mPriority = new TreeMap<>();
  private final long mMinPower;
  private Z mBasis = Z.THREE;

  protected A001597(final long minPower) {
    mMinPower = minPower;
  }

  /** Construct the sequence. */
  public A001597() {
    this(2);
  }

  @Override
  public Z next() {
    if (mPriority.isEmpty()) {
      mPriority.put(Z.TWO.pow(mMinPower), Z.TWO);
      return Z.ONE;
    }
    while (mBasis.square().compareTo(mPriority.firstKey()) <= 0) {
      final Z key = mBasis.pow(mMinPower);
      if (!mPriority.containsKey(key)) {
        mPriority.put(key, mBasis);
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
