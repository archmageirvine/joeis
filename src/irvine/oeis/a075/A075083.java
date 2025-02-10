package irvine.oeis.a075;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.Permutation;

/**
 * A075083 Largest composite number formed by permuting the digits of n, or 0 if no such number exists.
 * @author Sean A. Irvine
 */
public class A075083 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final Permutation perm = Permutation.permuter(Z.valueOf(++mN));
    Z max = Z.ZERO;
    int[] p;
    while ((p = perm.next()) != null) {
      final Z v = Permutation.permToZ(p);
      if (!Z.ONE.equals(v) && !v.isProbablePrime() & v.compareTo(max) > 0) {
        max = v;
      }
    }
    return max;
  }
}

