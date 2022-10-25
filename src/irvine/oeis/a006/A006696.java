package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A006696 a(n) = min_{k=1..n} (a(k-1) + 2^k*(n + a(n-k))); a(0) = 0.
 * @author Sean A. Irvine
 */
public class A006696 extends MemorySequence {

  @Override
  protected Z computeNext() {
    if (size() == 0) {
      return Z.ZERO;
    }
    final int n = size();
    Z m = a(n - 1).add(n).multiply2();
    for (int k = 2; k <= n; ++k) {
      m = m.min(a(k - 1).add(a(n - k).add(n).shiftLeft(k)));
    }
    return m;
  }
}
