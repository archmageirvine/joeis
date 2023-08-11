package irvine.oeis.a036;

import irvine.factor.factor.Jaguar;
import irvine.math.MemoryFunction;
import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;

/**
 * A036249 Number of rooted trees of nonempty sets with n points. (Each node is a set of 1 or more points.).
 * @author Sean A. Irvine
 */
public class A036249 extends MemorySequence {

  // After Alois P. Heinz

  private final MemoryFunction<Integer, Z> mB = new MemoryFunction<>() {
    @Override
    protected Z compute(final Integer n) {
      if (n == 0) {
        return Z.ONE;
      }
      Z sum = Z.ZERO;
      for (int j = 1; j <= n; ++j) {
        Z s = Z.ZERO;
        for (final Z d : Jaguar.factor(j).divisors()) {
          s = s.add(d.multiply(a(d.intValue())));
        }
        sum = sum.add(s.multiply(getValue(n - j)));
      }
      return sum.divide(n);
    }
  };

  @Override
  protected Z computeNext() {
    if (size() == 0) {
      return Z.ZERO;
    }
    return a(size() - 1).add(mB.getValue(size() - 1));
  }
}

