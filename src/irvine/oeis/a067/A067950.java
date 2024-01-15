package irvine.oeis.a067;

import java.util.Arrays;

import irvine.math.z.Z;
import irvine.oeis.a007.A007712;
import irvine.util.Permutation;

/**
 * A067950 a(n) = number of 3-times (but not 4-times) reformable permutation of {1,...,n}.
 * @author Sean A. Irvine
 */
public class A067950 extends A007712 {

  /** Construct the sequence. */
  public A067950() {
    super(6);
  }

  private int mN = 5;
  private Z mF = Z.valueOf(120);

  @Override
  public Z next() {
    mF = mF.multiply(++mN);
    long count = 0;
    final Permutation perm = new Permutation(mN);
    int[] p;
    while ((p = perm.next()) != null) {
      final int[] reform = reform(Arrays.copyOf(p, p.length));
      if (reform != null) {
        final int[] reform2 = reform(reform);
        if (reform2 != null) {
          final int[] reform3 = reform(reform2);
          if (reform3 != null && reform(reform3) == null) {
            ++count;
          }
        }
      }
    }
    return Z.valueOf(count);
  }
}
