package irvine.oeis.a031;

import java.util.TreeSet;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000045;

/**
 * A031122 Integers that appear as ratios of Fibonacci numbers <code>F(kn)/F(k)</code>, but omitting Fibonacci numbers <code>F(n)/F(1)</code> and Lucas numbers <code>F(2n)/F(n)</code>.
 * @author Sean A. Irvine
 */
public class A031122 implements Sequence {

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
      for (final Z dd : Cheetah.factor(mN).divisors()) {
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

