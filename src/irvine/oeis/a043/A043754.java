package irvine.oeis.a043;

import java.util.TreeSet;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000959;
import irvine.oeis.memory.MemorySequence;

/**
 * A043754 Let L(n) = n-th lucky number. Then a(1)=0; a(n) is largest number m such that all divisors of L(n)^m are lucky numbers.
 * @author Sean A. Irvine
 */
public class A043754 extends Sequence1 {

  private final MemorySequence mLuckySeq = MemorySequence.cachedSequence(new A000959());
  private final TreeSet<Z> mLucky = new TreeSet<>();
  {
    mLucky.add(mLuckySeq.next()); // avoid empty tree (needed for A043772)
  }
  private int mN = -1;

  protected boolean isLuckyDivisible(final Z t, final int m) {
    final FactorSequence fs = new FactorSequence();
    fs.add(t, FactorSequence.UNKNOWN, m);
    Jaguar.factor(fs);
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

