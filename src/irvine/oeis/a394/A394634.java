package irvine.oeis.a394;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import irvine.math.MemoryFunction1;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A394634 a(n) is the least k &gt;= 0 such that the maximum length of a divisibility chain among the distinct entries in row k of Pascal's triangle is n, or -1 if no such k exists.
 * @author Sean A. Irvine
 */
public class A394634 extends Sequence1 {

  // After Felix Huber

  private int mN = 0;

  private final MemoryFunction1<Integer> mH = new MemoryFunction1<>() {
    @Override
    protected Integer compute(final int k) {
      final int m = k / 2;
      final int[] t = new int[m + 1];
      Arrays.fill(t, 1);
      @SuppressWarnings("unchecked")
      final List<Integer>[] l = new List[m + 2];
      for (int j = 1; j <= m + 1; ++j) {
        l[j] = new ArrayList<>();
      }
      l[1].add(0);
      int u = 1;
      for (int i = 1; i <= m; ++i) {
        t[i] = 2;
        if ((k + 1) % i == 0) {
          t[i] = t[i - 1] + 1;
        }
        final int b = t[i];
        boolean f = false;
        for (int j = u; j >= b && !f; --j) {
          for (final int q : l[j]) {
            if (Binomial.binomial(k - q, i - q, Binomial.binomial(i, q)).isZero()) {
              t[i] = j + 1;
              f = true;
              break;
            }
          }
        }
        u = Math.max(u, t[i]);
        l[t[i]].add(0, i);
      }
      return u;
    }
  };

  @Override
  public Z next() {
    ++mN;
    long k = -1;
    while (mH.get(++k) != mN) {
      // Do nothing
    }
    return Z.valueOf(k);
  }
}
