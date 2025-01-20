package irvine.oeis.a074;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.MemoryFunction1;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.DynamicLongArray;

/**
 * A074348 Smallest number requiring n steps to reach 0 or -1 when iterating the function: f(n)=lcd(n)-lpf(n), where lcd(n) is the largest common difference between consecutive divisors of n (ordered by size) and lpf(n) is the largest prime factor of n.
 * @author Sean A. Irvine
 */
public class A074348 extends Sequence1 {

  private final DynamicLongArray mFirsts = new DynamicLongArray();
  private int mN = 0;
  private int mM = 0;
  private final MemoryFunction1<Integer> mF = new MemoryFunction1<>() {
    @Override
    protected Integer compute(final int n) {
      final FactorSequence fs = Jaguar.factor(n);
      final Z[] d = fs.divisorsSorted();
      int lcd = 0;
      for (int k = 1; k < d.length; ++k) {
        final int diff = d[k].subtract(d[k - 1]).intValueExact();
        if (diff > lcd) {
          lcd = diff;
        }
      }
      return lcd - fs.largestPrimeFactor().intValue();
    }
  };

  @Override
  public Z next() {
    ++mN;
    while (mFirsts.get(mN) == 0) {
      int cnt = 0;
      int m = ++mM;
      while (m > 0) {
        m = mF.get(m);
        ++cnt;
      }
      if (mFirsts.get(cnt) == 0) {
        mFirsts.set(cnt, mM);
      }
    }
    return Z.valueOf(mFirsts.get(mN));
  }
}
