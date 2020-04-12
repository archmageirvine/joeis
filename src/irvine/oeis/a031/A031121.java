package irvine.oeis.a031;

import java.util.TreeSet;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000045;

/**
 * A031121 Integer ratios of Fibonacci numbers <code>F(m)/F(n)</code>.
 * @author Sean A. Irvine
 */
public class A031121 implements Sequence {

  // Heuristic, but will detect if an error is ever made

  private final MemorySequence mFibo = MemorySequence.cachedSequence(new A000045());
  private final TreeSet<Z> mQ = new TreeSet<>();
  {
    mQ.add(Z.ONE);
  }
  private final TreeSet<Z> mDone = new TreeSet<>();
  private Z mPrev = Z.ZERO;
  private int mN = 2;

  @Override
  public Z next() {
    final Z fn = mFibo.a(++mN);
    for (final Z d : Cheetah.factor(mN).divisors()) {
      final Z r = fn.divide(mFibo.get(d.intValue()));
      if (!mDone.contains(r)) {
        mQ.add(r);
      }
    }
    final Z res = mQ.pollFirst();
    if (res.compareTo(mPrev) < 0) {
      throw new RuntimeException("Heuristic failed: " + res);
    }
    mDone.add(res);
    mPrev = res;
    return res;
  }
}

