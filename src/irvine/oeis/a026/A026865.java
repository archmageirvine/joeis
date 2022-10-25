package irvine.oeis.a026;

import irvine.math.MemoryFunction;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A026865 Number of labeled chain graphs.
 * @author Sean A. Irvine
 */
public class A026865 extends MemorySequence {

  {
    setOffset(1);
    next(); // skip 0th
  }

  private static final class KFunction extends MemoryFunction<Integer, Z> {
    @Override
    protected Z compute(final Integer n) {
      if (n == 0) {
        return Z.ONE;
      }
      Z sum = Z.ZERO;
      for (int r = 0; r < n; ++r) {
        sum = sum.add(Binomial.binomial(n, r).multiply(getValue(r)).shiftLeft((n - r) * (n - r - 1) / 2));
      }
      return sum.negate();
    }
  }

  private final KFunction mK = new KFunction();

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n == 0) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    for (int r = 1; r <= n; ++r) {
      sum = sum.add(Binomial.binomial(n, r).multiply(mK.getValue(r)).multiply(a(n - r)).shiftLeft(r * (n - r)));
    }
    return sum.negate();
  }
}
