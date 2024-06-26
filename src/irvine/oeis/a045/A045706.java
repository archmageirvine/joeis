package irvine.oeis.a045;

import java.util.TreeSet;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.PrependSequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a000.A000045;
import irvine.oeis.memory.MemorySequence;

/**
 * A045706 Number of ways n can be written as a sum of a square of a Fibonacci number and a cube of a Fibonacci number; F(1) = F(2) = 1 are considered the same.
 * @author Sean A. Irvine
 */
public class A045706 extends Sequence0 {

  // Change 0, 1, 1, 2, 3, 5, ... to 0, 1, 2, 3, 5, ...
  private final MemorySequence mFibo = MemorySequence.cachedSequence(new PrependSequence(new A000045().skip(2), 0));
  private final TreeSet<Long> mFiboSet = new TreeSet<>();
  {
    mFiboSet.add(mFibo.a(0).longValueExact());
  }
  private int mT = 0;
  private long mN = -1;

  private boolean isFibo(final long q) {
    while (mFiboSet.last() < q) {
      mFiboSet.add(mFibo.a(++mT).longValueExact());
    }
    return mFiboSet.contains(q);
  }

  @Override
  public Z next() {
    ++mN;
    long cnt = 0;
    long f;
    for (int k = 0; (f = mN - mFibo.a(k).pow(3).longValueExact()) >= 0; ++k) {
      final long q = Functions.SQRT.l(f);
      if (q * q == f && isFibo(q)) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}
