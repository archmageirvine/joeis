package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A014668 <code>a(1) = 1, a(n) = Sum_{k=1..n-1} Sum_{d|k} a(d)</code>.
 * @author Sean A. Irvine
 */
public class A014668 extends MemorySequence {

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n == 0) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    for (int k = 0; k < n; ++k) {
      sum = sum.add(get(k).multiply(n / (k + 1)));
    }
    return sum;
  }
}

