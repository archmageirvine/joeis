package irvine.oeis.a007;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.a182.A182927;

/**
 * A007837 Number of partitions of n-set with distinct block sizes.
 * @author Sean A. Irvine
 */
public class A007837 extends MemorySequence {

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n == 0) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    final A182927 a = new A182927();
    for (int k = 1; k <= n; ++k) {
      sum = sum.add(Binomial.binomial(n - 1, k - 1).multiply(a.next()).multiply(a(n - k)));
    }
    return sum;
  }
}
