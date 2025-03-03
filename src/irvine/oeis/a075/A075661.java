package irvine.oeis.a075;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.MemoryFunction1;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A075661 Let f(n) = lcd(n)-lpf(n), where lcd(n) is the largest common difference between consecutive divisors of n (ordered by size) and lpf(n) is the largest prime factor of n. Sequence gives number of iterations for f(n) to reach 0 or -1.
 * @author Sean A. Irvine
 */
public class A075661 extends Sequence1 {

  private int mN = 0;

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
    int m = ++mN;
    long cnt = 0;
    while (m != 0 && m != -1) {
      m = mF.get(m);
      ++cnt;
    }
    return Z.valueOf(cnt);
  }
}
