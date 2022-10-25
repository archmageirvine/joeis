package irvine.oeis.a051;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A051165 Sequence is defined by property that binomial transform of (a0,a1,a2,a3,...) = (a0,a0,a1,a1,a2,a2,a3,a3,...).
 * @author Sean A. Irvine
 */
public class A051165 extends MemorySequence {

  @Override
  protected Z computeNext() {
    final int n = size();
    Z sum = Z.ZERO;
    for (int k = 0; k <= n; ++k) {
      sum = sum.signedAdd(((n - k) & 1) == 0, Binomial.binomial(n, k).multiply(k < 2 ? Z.ONE : a(k / 2)));
    }
    return sum;
  }
}
