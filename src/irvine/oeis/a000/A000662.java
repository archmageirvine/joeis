package irvine.oeis.a000;

import irvine.math.IntegerUtils;

/**
 * A000662 Number of relations with 3 arguments on n nodes.
 * @author Sean A. Irvine
 */
public class A000662 extends A000595 {

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
          final int lcm = IntegerUtils.lcm(lij, k);
          sum += (ij * k / lcm) * s[i] * s[j] * s[k];
        }
      }
    }
    return sum;
  }
}
