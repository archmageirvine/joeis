package irvine.oeis.a055;

import java.util.Arrays;

import irvine.math.z.Z;
import irvine.oeis.a007.A007712;
import irvine.util.Permutation;

/**
 * A055459 a(n) = number of permutations of {1,...,n} which are twice but not 3-times reformable.
 * @author Sean A. Irvine
 */
public class A055459 extends A007712 {

  /** Construct the sequence. */
  public A055459() {
    super(1);
  }

  private int mN = 3;
  private Z mF = Z.SIX;

  @Override
  public Z next() {
    if (++mN > 1) {
      mF = mF.multiply(mN);
    }
    long count = 0;
    final Permutation perm = new Permutation(mN);
    int[] p;
    while ((p = perm.next()) != null) {
      final int[] reform = reform(Arrays.copyOf(p, p.length));
      if (reform != null) {
        final int[] reform2 = reform(reform);
        if (reform2 != null && reform(reform2) == null) {
          ++count;
        }
      }
    }
    return Z.valueOf(count);
  }
}
