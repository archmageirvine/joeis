package irvine.oeis.a072;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A072359 Primes p such that the p-1 digits of the decimal expansion of k/p (for k=1,2,3,...,p-1) fit into the k-th row of a magic square grid of order p-1.
 * @author Sean A. Irvine
 */
public class A072359 extends A000040 {

  {
    super.next();
  }

  private boolean is(final Z pp) {
    final int p = pp.intValueExact();
    final long[] d = new long[p - 1];
    long targetSum = 0;
    long diag1 = 0;
    long diag2 = 0;
    for (int k = 1; k < p; ++k) {
      long rowSum = 0;
      Q v = new Q(k, p);
      for (int j = 0; j < d.length; ++j) {
        v = v.multiply(10);
        final int t = v.floor().intValueExact();
        v = v.frac();
        rowSum += t;
        d[j] += t;
        if (j == k - 1) {
          diag1 += t;
        }
        if (j == d.length - k) {
          diag2 += t;
        }
      }
      if (k == 1) {
        targetSum = rowSum;
      } else if (rowSum != targetSum) {
        return false;
      }
    }
    if (diag1 != targetSum) {
      return false;
    }
    if (diag2 != targetSum) {
      return false;
    }
    for (long c : d) {
      if (c != targetSum) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (is(p)) {
        return p;
      }
    }
  }
}
