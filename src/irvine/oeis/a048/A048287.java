package irvine.oeis.a048;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A048287 Number of semiorders on n labeled nodes whose incomparability graph is connected.
 * @author Sean A. Irvine
 */
public class A048287 extends MemorySequence {

  {
    setOffset(1);
    add(null); // 0th
  }

  @Override
  protected Z computeNext() {
    final int n = size();
    Z sum = (n & 1) == 1 ? Z.ONE : Z.NEG_ONE;
    for (int k = 1; k < n; ++k) {
      sum = sum.add(Binomial.binomial(n, k).multiply(get(k)).multiply(get(n - k)));
    }
    return sum;
  }
}

