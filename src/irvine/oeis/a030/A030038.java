package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A030038 <code>a(n+1) =</code> Sum <code>a(k)a(n-k), k = 0 ... [ 3n/5 ]</code>.
 * @author Sean A. Irvine
 */
public class A030038 extends MemorySequence {

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n < 3) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    for (int k = 0; k <= 3 * (n - 1) / 5; ++k) {
      sum = sum.add(get(k).multiply(get(n - 1 - k)));
    }
    return sum;
  }
}
