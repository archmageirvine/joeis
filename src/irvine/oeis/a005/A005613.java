package irvine.oeis.a005;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A005613 Cascade-realizable Boolean functions of n variables.
 * @author Sean A. Irvine
 */
public class A005613 extends MemorySequence {

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n <= 1) {
      return Z.TWO;
    }
    Z sum = Z.ZERO;
    Z t = Z.TWO;
    for (int p = 1; p < n; ++p) {
      t = t.multiply2();
      sum = sum.signedAdd((p & 1) == 1, Binomial.binomial(n, p).multiply(a(n - p)).multiply(t.add(1)));
    }
    return sum.signedAdd((n & 1) == 1, a(1).multiply(Z.ONE.shiftLeft(n).add(1)));
  }
}
