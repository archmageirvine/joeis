package irvine.oeis.a045;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A045648.
 * @author Sean A. Irvine
 */
public class A045648 extends MemorySequence {

  // After Alois P. Heinz

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n == 0) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    for (int j = 1; j <= n; ++j) {
      Z s = Z.ZERO;
      for (final Z dd : Cheetah.factor(j).divisors()) {
        final int d = dd.intValue();
        s = s.add(get(d - 1).multiply(d));
        if ((d & 3) == 2) {
          s = s.subtract(get(d / 2 - 1).multiply(d));
        }
      }
      sum = sum.add(s.multiply(get(n - j)));
    }
    return sum.divide(n);
  }
}
