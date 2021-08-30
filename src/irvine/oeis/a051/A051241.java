package irvine.oeis.a051;

import irvine.math.IntegerUtils;
import irvine.oeis.a000.A000595;

/**
 * A051241 Number of relations with 5 arguments on n nodes.
 * @author Sean A. Irvine
 */
public class A051241 extends A000595 {

  {
    super.next();
  }

  @Override
  protected int t(final int[] s) {
    int sum = 0;
    for (int i = 1; i < s.length; ++i) {
      for (int j = 1; j < s.length; ++j) {
        final int ij = i * j;
        final int lij = IntegerUtils.lcm(i, j);
        for (int k = 1; k < s.length; ++k) {
          final int ijk = ij * k;
          final int lijk = IntegerUtils.lcm(lij, k);
          for (int l = 1; l < s.length; ++l) {
            final int ijkl = ijk * l;
            final int lijkl = IntegerUtils.lcm(lijk, l);
            for (int m = 1; m < s.length; ++m) {
              final int lcm = IntegerUtils.lcm(lijkl, m);
              sum += (ijkl * m / lcm) * s[i] * s[j] * s[k] * s[l] * s[m];
            }
          }
        }
      }
    }
    return sum;
  }
}
