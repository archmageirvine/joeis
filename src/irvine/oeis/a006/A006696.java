package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A006696 <code>a(n) =</code> min_{k=1..n} <code>(a(k-1) + 2^k*(n + a(n-k))); a(0) = 0</code>.
 * @author Sean A. Irvine
 */
public class A006696 extends MemorySequence {

  @Override
  protected Z computeNext() {
    if (isEmpty()) {
      return Z.ZERO;
    }
    final int n = size();
    Z m = get(n - 1).add(n).multiply2();
    for (int k = 2; k <= n; ++k) {
      m = m.min(get(k - 1).add(get(n - k).add(n).shiftLeft(k)));
    }
    return m;
  }
}
