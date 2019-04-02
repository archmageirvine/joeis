package irvine.oeis.a006;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A006964 Number of directed rooted trees with n nodes.
 * @author Sean A. Irvine
 */
public class A006964 extends MemorySequence {

  {
    add(null); // 0th term
  }

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n < 2) {
      return Z.valueOf(n);
    }
    Z sum = Z.ZERO;
    for (int j = 1; j < n; ++j) {
      Z t = Z.ZERO;
      for (final Z d : Cheetah.factor(j).divisors()) {
        t = t.add(d.multiply(get(d.intValueExact())));
      }
      sum = sum.add(t.multiply(get(n - j)).multiply(3));
    }
    return sum.divide(n - 1);
  }
}
