package irvine.oeis.a028;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.array.LongDynamicArray;
import irvine.util.array.LongDynamicIntArray;

/**
 * A028690 Sorted Galois and Pseudo-Galois numbers.
 * @author Sean A. Irvine
 */
public class A028690 implements Sequence {

  private final TreeSet<Z> mQueue = new TreeSet<>();
  private final LongDynamicArray<Z> mGalois = new LongDynamicArray<>();
  private final LongDynamicIntArray mIndices = new LongDynamicIntArray();
  {
    mQueue.add(Z.ONE);
  }

  @Override
  public Z next() {
    final Z res = mQueue.pollFirst();
    long k = 2;
    while (mQueue.isEmpty() || Z.valueOf(k).square().subtract(k).compareTo(mQueue.first()) <= 0) {
      final int e = mIndices.get(k);
      if (e == 0) {
        mIndices.set(k, 1);
        final Z v = A028689.galois(k, 1);
        mGalois.set(k, v);
        mQueue.add(v);
      } else if (mGalois.get(k).compareTo(res) <= 0) {
        mIndices.set(k, e + 1);
        final Z v = A028689.galois(k, e + 1);
        mGalois.set(k, v);
        mQueue.add(v);
      }
      ++k;
    }
    return res;
  }
}
