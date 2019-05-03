package irvine.oeis.a005;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A005840 Expansion of <code>(1-x)*e^x/(2-e^x)</code>.
 * @author Sean A. Irvine
 */
public class A005840 extends MemorySequence {

  @Override
  protected Z computeNext() {
    final int n = size();
    Z sum = Z.valueOf(1 - n);
    for (int k = 0; k < n; ++k) {
      sum = sum.add(Binomial.binomial(n, k).multiply(get(k)));
    }
    return sum;
  }
}
