package irvine.oeis.a028;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.array.DynamicArray;
import irvine.util.array.DynamicIntArray;

/**
 * A028688 Sorted factorial and k-factorial numbers (numbers of form <code>k-1</code> excluded).
 * @author Sean A. Irvine
 */
public class A028688 implements Sequence {

  // k-factorials here are like F(k, m) = prod_{j..m} (k^j-1)

  private final TreeSet<Z> mQueue = new TreeSet<>();
  private final DynamicArray<Z> mKFactorials = new DynamicArray<>();
  private final DynamicIntArray mExponents = new DynamicIntArray();
  private Z mF = Z.ONE;
  private long mN = 1;
  {
    mQueue.add(Z.ONE);
  }

  @Override
  public Z next() {
    final Z res = mQueue.pollFirst();
    int k = 2;
    while (mQueue.isEmpty() || Z.valueOf(k).square().subtract(1).compareTo(mQueue.first()) <= 0) {
      if (mF.compareTo(res) <= 0) {
        mF = mF.multiply(++mN);
        mQueue.add(mF);
      }
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
