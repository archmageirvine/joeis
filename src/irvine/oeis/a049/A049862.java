package irvine.oeis.a049;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000045;

/**
 * A049862 Products of two Fibonacci numbers with distinct indices.
 * @author Sean A. Irvine
 */
public class A049862 implements Sequence {

  private final MemorySequence mFibo = MemorySequence.cachedSequence(new A000045());
  private final TreeSet<Z> mA = new TreeSet<>();
  private Z mPrev = Z.NEG_ONE;
  private int mN = 0;

  @Override
  public Z next() {
    while (mA.isEmpty() || mA.first().compareTo(mFibo.a(mN)) > 0) {
      final Z fn = mFibo.a(mN);
      for (int k = mN - 1; k >= 0; --k) {
        final Z prod = fn.multiply(mFibo.a(k));
        if (prod.compareTo(mPrev) <= 0) {
          break;
        }
        mA.add(prod);
      }
      ++mN;
    }
    mPrev = mA.pollFirst();
    return mPrev;
  }
}
