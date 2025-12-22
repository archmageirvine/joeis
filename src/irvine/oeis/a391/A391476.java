package irvine.oeis.a391;

import java.util.HashSet;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.Permutation;

/**
 * A391476 For n &gt;= 1, a(n) is the sum of the number of divisors A000005(r) for all distinct, nonzero numbers r formed by permuting subsets of the digits of n.
 * @author Sean A. Irvine
 */
public class A391476 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final Permutation perm = Permutation.permuter(Z.valueOf(++mN));
    final HashSet<Long> set = new HashSet<>();
    int[] p;
    while ((p = perm.next()) != null) {
      long r = 0;
      for (final int v : p) {
        r *= 10;
        r += v;
        if (r != 0) {
          set.add(r);
        }
      }
    }
    Z sum = Z.ZERO;
    for (final long t : set) {
      sum = sum.add(Functions.SIGMA0.l(t));
    }
    return sum;
  }
}
