package irvine.oeis.a030;

import irvine.math.IntegerUtils;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A030041 <code>a(n+1)=</code> Sum <code>a(k)a(n-k), k = 0 ... [ sqrt(n) ]</code>.
 * @author Sean A. Irvine
 */
public class A030041 extends MemorySequence {

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n < 2) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    for (int k = 0; k <= IntegerUtils.sqrt(n - 1); ++k) {
      sum = sum.add(get(k).multiply(get(n - 1 - k)));
    }
    return sum;
  }
}
