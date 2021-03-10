package irvine.oeis.a043;

import java.util.TreeSet;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000959;

/**
 * A043720.
 * @author Sean A. Irvine
 */
public class A043754 implements Sequence {

  private final Cheetah mFactor = new Cheetah();
  private final MemorySequence mLuckySeq = MemorySequence.cachedSequence(new A000959());
  private final TreeSet<Z> mLucky = new TreeSet<>();
  {
    mLucky.add(mLuckySeq.next()); // avoid empty tree (needed for A043772)
  }
  private int mN = -1;

  protected boolean isLuckyDivisible(final Z t, final int m) {
    final FactorSequence fs = new FactorSequence();
    fs.add(t, FactorSequence.UNKNOWN, m);
    mFactor.factor(fs);
    for (final Z d : fs.divisors()) {
      while (mLucky.last().compareTo(d) < 0) {
        mLucky.add(mLuckySeq.next());
      }
      if (!mLucky.contains(d)) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    final Z lucky = mLuckySeq.a(++mN);
    mLucky.add(lucky);
    if (Z.ONE.equals(lucky)) {
      return Z.ZERO;
    }
    int m = 0;
    while (isLuckyDivisible(lucky, m + 1)) {
      ++m;
    }
    return Z.valueOf(m);
  }
}

