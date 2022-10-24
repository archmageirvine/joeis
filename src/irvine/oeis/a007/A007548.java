package irvine.oeis.a007;

import java.util.List;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A007548 Shifts 3 places left under exponentiation.
 * @author Sean A. Irvine
 */
public class A007548 extends MemorySequence {

  {
    add(Z.ONE);
  }

  static Z exponentialTransform(final List<Z> p, final List<Z> g, final int n) {
    Z sum = p.get(n);
    for (int k = 1; k < n; ++k) {
      sum = sum.add(Binomial.binomial(n - 1, k - 1).multiply(p.get(k)).multiply(g.get(g.size() - k)));
    }
    return sum;
  }

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n < 3) {
      return Z.ONE;
    } else {
      return exponentialTransform(toList(), toList(), n - 3);
    }
  }
}
