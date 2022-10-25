package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A006014 a(n+1) = (n+1)*a(n) + Sum a(k)*a(n-k).
 * @author Sean A. Irvine
 */
public class A006014 extends MemorySequence {

  {
    setOffset(1);
  }

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n == 0) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    for (int k = 0; k < n - 1; ++k) {
      sum = sum.add(get(k).multiply(get(n - 2 - k)));
    }
    return sum.add(get(n - 1).multiply(n + 1));
  }
}

