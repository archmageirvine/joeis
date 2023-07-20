package irvine.oeis.a051;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;
import irvine.oeis.a005.A005130;

/**
 * A051055 'Connected' alternating sign n X n matrices, i.e., not made from smaller blocks.
 * @author Sean A. Irvine
 */
public class A051055 extends MemorySequence {

  private final MemorySequence mR = MemorySequence.cachedSequence(new A005130());

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n == 0) {
      return Z.ZERO;
    }
    Z sum = Z.ZERO;
    for (int k = 0; k < n; ++k) {
      sum = sum.add(Binomial.binomial(n, k).square().multiply(k).multiply(a(k)).multiply(mR.a(n - k)));
    }
    return mR.a(n).subtract(sum.divide(n));
  }
}
