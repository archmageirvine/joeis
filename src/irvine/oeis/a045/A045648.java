package irvine.oeis.a045;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;

/**
 * A045648 Number of chiral n-ominoes in (n-1)-space, one cell labeled.
 * @author Sean A. Irvine
 */
public class A045648 extends MemorySequence {

  {
    setOffset(1);
  }

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
      for (final Z dd : Jaguar.factor(j).divisors()) {
        final int d = dd.intValue();
        s = s.add(a(d - 1).multiply(d));
        if ((d & 3) == 2) {
          s = s.subtract(a(d / 2 - 1).multiply(d));
        }
      }
      sum = sum.add(s.multiply(a(n - j)));
    }
    return sum.divide(n);
  }
}
