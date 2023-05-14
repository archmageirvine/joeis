package irvine.oeis.a015;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A015502 a(1) = 1, a(n) = Sum_{k=1..n-1} (3^k - 1)/2 * a(k).
 * @author Sean A. Irvine
 */
public class A015502 extends MemorySequence {

  {
    setOffset(1);
  }

  protected int q() {
    return 3;
  }

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n == 0) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    Z t = Z.ONE;
    for (int k = 0; k < n; ++k) {
      t = t.multiply(q());
      sum = sum.add(a(k).multiply(t.subtract(1).divide(q() - 1)));
    }
    return sum;
  }
}
