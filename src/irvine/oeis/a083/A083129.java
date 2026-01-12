package irvine.oeis.a083;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A083129 Consider the triangle in which n-th row contains the smallest set of n consecutive numbers such that every prime among first n primes divides at least one distinct number in the row (irrespective of order). Sequence gives the first column.
 * @author Sean A. Irvine
 */
public class A083129 extends Sequence1 {

  private int mN = 0;

  private boolean is(final long start, final long end, final long p, final boolean[] used) {
    if (p <= 1) {
      return true;
    }
    long t = (start / p) * p;
    int u = (int) (t - start);
    while (t < end) {
      if (t >= start && !used[u]) {
        used[u] = true;
        if (is(start, end, Functions.PREV_PRIME.l(p), used)) {
          return true;
        }
        used[u] = false;
      }
      t += p;
      u += p;
    }
    return false;
  }

  private boolean is(final long start, final int n) {
    final long p = Functions.PRIME.l(n);
    return is(start, start + n, p, new boolean[n]);
  }

  @Override
  public Z next() {
    ++mN;
    long m = 1;
    while (true) {
      if (is(++m, mN)) {
        return Z.valueOf(m);
      }
    }
  }
}

