package irvine.oeis.a029;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;

/**
 * A029856 Number of rooted trees with 2-colored leaves.
 * @author Sean A. Irvine
 */
public class A029856 extends MemorySequence {

  // After Alois P. Heinz

  {
    setOffset(1);
    add(null); // 0th
  }

  private Z dsum(final int n) {
    Z sum = Z.ZERO;
    for (final Z d : Jaguar.factor(n).divisors()) {
      sum = sum.add(d.multiply(a(d.intValueExact())));
    }
    return sum;
  }

  protected Z first() {
    return Z.TWO;
  }

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n == 1) {
      return first();
    }
    Z sum = dsum(n - 1);
    for (int j = 1; j <= n - 2; ++j) {
      sum = sum.add(dsum(j).multiply(a(n - j)));
    }
    return sum.divide(n - 1);
  }
}
