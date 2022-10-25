package irvine.oeis.a003;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A003027 Number of weakly connected digraphs with n labeled nodes.
 * @author Sean A. Irvine
 */
public class A003027 extends MemorySequence {

  {
    setOffset(1);
    add(Z.ONE);
  }

  private int b(final int n) {
    return n * n - n;
  }

  @Override
  protected Z computeNext() {
    final int n = size();
    Z s = Z.ZERO;
    for (int k = 1; k < n; ++k) {
      s = s.add(Binomial.binomial(n, k).multiply(k).multiply(get(k)).shiftLeft(b(n - k)));
    }
    return Z.ONE.shiftLeft(b(n)).subtract(s.divide(n));
  }
}
