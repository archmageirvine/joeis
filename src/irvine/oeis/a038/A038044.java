package irvine.oeis.a038;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A038042.
 * @author Sean A. Irvine
 */
public class A038044 extends MemorySequence {

  {
    add(null); // 0th
  }

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n == 1) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    for (final Z dd : Cheetah.factor(n - 1).divisors()) {
      final int d = dd.intValue();
      sum = sum.add(get(d).multiply(get((n - 1) / d)));
    }
    return sum;

  }
}
