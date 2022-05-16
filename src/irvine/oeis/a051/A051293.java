package irvine.oeis.a051;

import irvine.factor.factor.Jaguar;
import irvine.math.MemoryFunction1;
import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A051293 Number of nonempty subsets of {1,2,3,...,n} whose elements have an integer average.
 * @author Sean A. Irvine
 */
public class A051293 extends MemorySequence {

  {
    next(); // skip 0
  }

  private final MemoryFunction1<Z> mB = new MemoryFunction1<Z>() {
    @Override
    protected Z compute(final int n) {
      if (n < 1) {
        return Z.ZERO;
      }
      Z sum = Z.ZERO;
      for (final Z d : Jaguar.factor(n).divisors()) {
        if (d.isOdd()) {
          sum = sum.add(Euler.phi(d).shiftLeft(n / d.intValue()));
        }
      }
      return sum.divide(n);
    }
  };

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n < 1) {
      return Z.ZERO;
    }
    return get(n - 1).add(mB.get(n)).subtract(1);
  }
}
