package irvine.oeis.a059;

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A059167 Number of n-node labeled graphs without endpoints.
 * @author Sean A. Irvine
 */
public class A059167 extends MemorySequence {

  private final MemorySequence mB = MemorySequence.cachedSequence(new A059166());

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n == 0) {
      return Z.ONE;
    }
    return Integers.SINGLETON.sum(0, n - 1, k -> Binomial.binomial(n - 1, k).multiply(mB.a(k + 1)).multiply(get(n - k - 1)));
  }
}
