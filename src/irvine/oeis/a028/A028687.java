package irvine.oeis.a028;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.DynamicArray;
import irvine.util.array.DynamicIntArray;

/**
 * A028687 Sorted k-factorial numbers (numbers of form k-1 excluded).
 * @author Sean A. Irvine
 */
public class A028687 extends Sequence1 {

  // k-factorials here are like F(k, m) = prod_{j..m} (k^j-1)

  private final TreeSet<Z> mQueue = new TreeSet<>();
  private final DynamicArray<Z> mKFactorials = new DynamicArray<>();
  private final DynamicIntArray mExponents = new DynamicIntArray();
  {
    mQueue.add(Z.ONE);
  }

  @Override
  public Z next() {
    final Z res = mQueue.pollFirst();
    int k = 2;
    while (mQueue.isEmpty() || Z.valueOf(k).square().subtract(1).compareTo(mQueue.first()) <= 0) {
      final int e = mExponents.get(k);
      if (e == 0) {
        mExponents.set(k, 2);
        final Z v = Z.valueOf(k).square().subtract(1).multiply(k - 1);
        mKFactorials.set(k, v);
        mQueue.add(v);
      } else if (mKFactorials.get(k).compareTo(res) <= 0) {
        mExponents.set(k, e + 1);
        final Z v = mKFactorials.get(k).multiply(Z.valueOf(k).pow(e + 1).subtract(1));
        mKFactorials.set(k, v);
        mQueue.add(v);
      }
      ++k;
    }
    return res;
  }
}
