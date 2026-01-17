package irvine.oeis.a390;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.Permutation;

/**
 * A390914 a(n) is the maximum number of divisors (A000005) among all unique, nonzero numbers formed by permuting subsets of the digits of n.
 * @author Sean A. Irvine
 */
public class A390914 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final Permutation perm = Permutation.permuter(Z.valueOf(++mN));
    long max = 0;
    int[] p;
    while ((p = perm.next()) != null) {
      Z v = Permutation.permToZ(p);
      while (!v.isZero()) {
        final long s0 = Functions.SIGMA0.l(v);
        if (s0 > max) {
          max = s0;
        }
        v = v.divide(10);
      }
    }
    return Z.valueOf(max);
  }
}
