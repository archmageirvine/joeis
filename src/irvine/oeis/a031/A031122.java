package irvine.oeis.a031;

import java.util.TreeSet;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000045;

/**
 * A031122 Integers that appear as ratios of Fibonacci numbers F(kn)/F(k), but omitting Fibonacci numbers F(n)/F(1) and Lucas numbers F(2n)/F(n).
 * @author Sean A. Irvine
 */
public class A031122 extends Sequence1 {

  // Heuristic, but will detect if an error is ever made

  private final MemorySequence mFibo = MemorySequence.cachedSequence(new A000045());
  private final TreeSet<Z> mQ = new TreeSet<>();
  private final TreeSet<Z> mOmit = new TreeSet<>();
  private final TreeSet<Z> mDone = new TreeSet<>();
  private Z mPrev = Z.ZERO;
  private int mN = 2;
  {
    mQ.add(Z.ONE);
    mOmit.add(Z.ONE);
  }

  @Override
  public Z next() {
    while (true) {
      final Z fn = mFibo.a(++mN);
      for (final Z dd : Jaguar.factor(mN).divisors()) {
        final int d = dd.intValue();
        final Z r = fn.divide(mFibo.get(d));
        if (!mDone.contains(r)) {
          mQ.add(r);
          if (d == 1 || 2 * d == mN) {
            mOmit.add(r);
          }
        }
      }
      final Z res = mQ.pollFirst();
      if (res.compareTo(mPrev) < 0) {
        throw new RuntimeException("Heuristic failed: " + res);
      }
      mDone.add(res);
      mPrev = res;
      if (mOmit.remove(res)) {
        continue;
      }
      return res;
    }
  }
}

