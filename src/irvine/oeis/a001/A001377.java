package irvine.oeis.a001;

import irvine.math.IntegerUtils;
import irvine.oeis.a000.A000595;

/**
 * A001377 Relations with 4 arguments on n nodes.
 * @author Sean A. Irvine
 */
public class A001377 extends A000595 {

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
            final int lcm = IntegerUtils.lcm(lijk, l);
            sum += (ijk * l / lcm) * s[i] * s[j] * s[k] * s[l];
          }
        }
      }
    }
    return sum;
  }
}
