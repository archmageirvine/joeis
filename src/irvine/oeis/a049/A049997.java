package irvine.oeis.a049;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a000.A000045;

/**
 * A049997 Numbers of the form Fibonacci(i)*Fibonacci(j).
 * @author Sean A. Irvine
 */
public class A049997 extends Sequence0 {

  private final TreeSet<Z> mA = new TreeSet<>();
  private final MemorySequence mFibo = MemorySequence.cachedSequence(new A000045());
  private Z mPrev = Z.NEG_ONE;
  private int mN = 0;

  @Override
  public Z next() {
    while (mA.isEmpty() || mA.first().compareTo(mFibo.a(mN)) >= 0) {
      final Z f = mFibo.a(mN);
      for (int k = 0; k <= mN; ++k) {
        final Z prod = f.multiply(mFibo.a(k));
        if (prod.compareTo(mPrev) > 0) {
          mA.add(prod);
        }
      }
      ++mN;
    }
    mPrev = mA.pollFirst();
    return mPrev;
  }
}
