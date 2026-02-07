package irvine.oeis.a390;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.Permutation;

/**
 * A390053 a(1) = 1. For n &gt; 1, a(n) is the largest prime factor of A390052(n).
 * @author Sean A. Irvine
 */
public class A390053 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final Permutation perm = Permutation.permuter(++mN);
    long maxGpf = 1;
    long min = mN + 1;
    int[] p;
    while ((p = perm.next()) != null) {
      final long t = Permutation.permToZ(p).longValueExact();
      final long g = Functions.GPF.l(t);
      if (g >= maxGpf) {
        if (g == maxGpf) {
          min = Math.min(min, t);
        } else {
          maxGpf = g;
          min = t;
        }
      }
    }
    return Z.valueOf(maxGpf);
  }
}

