package irvine.oeis.a088;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.Permutation;

/**
 * A088851 Products of integers whose digits are permutations of 1, 2, 3, ..., n.
 * @author Sean A. Irvine
 */
public class A088851 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    int[] p = new int[++mN];
    for (int k = 0; k < p.length; ++k) {
      p[k] = k + 1;
    }
    final Permutation perm = new Permutation(p);
    Z prod = Z.ONE;
    while ((p = perm.next()) != null) {
      prod = prod.multiply(Permutation.permToZ(p));
    }
    return prod;
  }
}

