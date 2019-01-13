package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.math.z.Binomial;

/**
 * A002439.
 * @author Sean A. Irvine
 */
public class A002439 extends MemorySequence {

  private Z mF = Z.ONE;

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n == 0) {
      return Z.ONE;
    }
    Z s = Z.ZERO;
    Z m = Z.ONE;
    for (int k = 1; k <= n; ++k) {
      m = m.multiply(-9);
      s = s.add(Binomial.binomial(2 * n + 1, 2 * k).multiply(m).multiply(get(n - k)));
    }
    if (n > 0) {
      mF = mF.multiply(-4);
    }
    return mF.subtract(s);
  }
}
