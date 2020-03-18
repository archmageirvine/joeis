package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A030036 <code>a(n+1)=</code> Sum <code>a(k)a(n-k), k = 0 ... [ n/5 ]</code>.
 * @author Sean A. Irvine
 */
public class A030036 extends MemorySequence {

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n <= 5) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    for (int k = 0; k <= (n - 1) / 5; ++k) {
      sum = sum.add(get(k).multiply(get(n - 1 - k)));
    }
    return sum;
  }
}
