package irvine.oeis.a051;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A051164 Sequence is defined by property that (a0,a1,a2,a3,...) = binomial transform of (a0,a0,a0,a1,a1,a1,a2,a2,a2,a3,a3,a3,...).
 * @author Sean A. Irvine
 */
public class A051164 extends MemorySequence {

  @Override
  protected Z computeNext() {
    final int n = size();
    Z sum = Z.ZERO;
    for (int k = 0; k <= n; ++k) {
      sum = sum.add(Binomial.binomial(n, k).multiply(k < 3 ? Z.ONE : get(k / 3)));
    }
    return sum;
  }
}
