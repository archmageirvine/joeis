package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.a002.A002024;

/**
 * A005230 Stern's sequence: <code>a(1) = 1, a(n+1)</code> is the sum of the m preceding terms, where m*(m-1)/2 <code>&lt; n &lt;=</code> m*(m+1)/2 or equivalently m = ceiling((sqrt(8*n+1)-1)/2) = A002024(n).
 * @author Sean A. Irvine
 */
public class A005230 extends MemorySequence {

  private final A002024 mLim = new A002024();

  {
    add(null);
  }

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n == 1) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    final int l = mLim.next().intValue();
    for (int k = 1; k <= l; ++k) {
      sum = sum.add(get(n - k));
    }
    return sum;
  }
}

