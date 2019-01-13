package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A014645.
 * @author Sean A. Irvine
 */
public class A014645 extends MemorySequence {

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n == 0) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    for (int k = n; k >= 1; --k) {
      sum = sum.add(Z.valueOf(k).pow(get(n - k).intValueExact()));
    }
    return sum;
  }
}

