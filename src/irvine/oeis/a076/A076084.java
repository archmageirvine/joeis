package irvine.oeis.a076;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.Permutation;

/**
 * A076084 Consider all numbers that can be formed by permuting the digits of n; take those with the greatest number of divisors; a(n) is the smallest of them.
 * @author Sean A. Irvine
 */
public class A076084 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final Permutation perm = Permutation.permuter(Z.valueOf(++mN));
    int[] p;
    Z maxS = Z.ZERO;
    Z max = Z.ZERO;
    while ((p = perm.next()) != null) {
      final Z v = Permutation.permToZ(p);
      final Z s = Functions.SIGMA0.z(v);
      if (s.compareTo(maxS) > 0) {
        maxS = s;
        max = v;
      }
    }
    return max;
  }
}
