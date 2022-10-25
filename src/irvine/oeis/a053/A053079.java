package irvine.oeis.a053;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A053079 a(1)=1; a(m+1) = Sum_{k=1..m} gcd(k, a(m+1-k)).
 * @author Sean A. Irvine
 */
public class A053079 extends MemorySequence {

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
    for (int k = 0; k < n; ++k) {
      sum = sum.add(a(k).gcd(Z.valueOf(n - k)));
    }
    return sum;
  }
}
