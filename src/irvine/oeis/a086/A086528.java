package irvine.oeis.a086;

import java.util.Map;
import java.util.TreeMap;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.util.array.DynamicArray;

/**
 * A086528 Smallest prime which occurs exactly n times in the sequence A086527.
 * @author Sean A. Irvine
 */
public class A086528 extends Sequence0 {

  private int mN = -1;
  private final Sequence mA = new A086527();
  private final TreeMap<Z, Integer> mCounts = new TreeMap<>();
  private final DynamicArray<Z> mFirsts = new DynamicArray<>();
  {
    mCounts.merge(mA.next(), 1, Integer::sum);
    mFirsts.set(0, Z.TWO);
  }

  @Override
  public Z next() {
    ++mN;
    while (mFirsts.get(mN) == null) {
      while (mCounts.firstKey().multiply2().compareTo(mCounts.lastKey()) > 0) {
        mCounts.merge(mA.next(), 1, Integer::sum);
      }
      final Map.Entry<Z, Integer> e = mCounts.pollFirstEntry();
      final int cnt = e.getValue();
      if (mFirsts.get(cnt) == null) {
        mFirsts.set(cnt, e.getKey());
      }
    }
    return mFirsts.get(mN);
  }
}
