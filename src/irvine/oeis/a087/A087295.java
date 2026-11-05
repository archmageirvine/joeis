package irvine.oeis.a087;

import java.util.ArrayList;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A087295 Successive remainders when computing the Euclidean algorithm for (n,m) where m is any positive integer having no common factor with n, gives a list ending with a sublist of Fibonacci sequence. Find m such that this sublist has the greatest length and define a(n) as this length.
 * @author Sean A. Irvine
 */
public class A087295 extends Sequence0 {

  private long mN = -1;

  private static int count(final long n, final long r) {
    // Remainders for (n, n+r), starting with r
    final ArrayList<Long> rem = new ArrayList<>();
    rem.add(r);
    long x = n;
    long y = r;
    while (y != 0) {
      final long t = x % y;
      if (t != 0) {
        rem.add(t);
      }
      x = y;
      y = t;
    }

    // Match the Fibonacci numbers backwards: 1, 2, 3, 5, 8, ...
    final int len = rem.size();
    long a = 1;
    long b = 2;
    int k = 0;
    while (k < len && rem.get(len - 1 - k) == a) {
      ++k;
      final long t = a + b;
      a = b;
      b = t;
    }
    return k;
  }

  @Override
  public Z next() {
    if (++mN < 2) {
      return Z.ZERO;
    }
    int best = 0;
    for (long r = 1; r < mN; ++r) {
      if (Functions.GCD.i(mN, r) == 1) {
        best = Math.max(best, count(mN, r));
      }
    }
    return Z.valueOf(best);
  }
}
