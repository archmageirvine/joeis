package irvine.oeis.a015;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A015487 <code>a(0)=1, a(1)=3, a(n) =</code> sum_{k=0}^{k=n-1} 3^k a(k).
 * @author Sean A. Irvine
 */
public class A015487 extends MemorySequence {

  protected int q() {
    return 3;
  }

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n < 2) {
      return n == 0 ? Z.ONE : Z.valueOf(q());
    }
    Z sum = Z.ZERO;
    Z t = Z.ONE;
    for (int k = 0; k < n; ++k, t = t.multiply(q())) {
      sum = sum.add(get(k).multiply(t));
    }
    return sum;
  }
}
