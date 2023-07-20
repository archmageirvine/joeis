package irvine.oeis.a039;

import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;

/**
 * A039721 a(1) = 1, a(m+1) = 2*Sum_{k=1..floor((m+1)/2)} a(m+1-k).
 * @author Sean A. Irvine
 */
public class A039721 extends MemorySequence {

  {
    setOffset(1);
    add(null);
  }

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n == 1) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    for (int k = 1; k <= n / 2; ++k) {
      sum = sum.add(a(n - k));
    }
    return sum.multiply2();
  }
}
