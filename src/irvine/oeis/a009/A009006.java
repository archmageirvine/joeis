package irvine.oeis.a009;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A009006 Expansion of e.g.f.: <code>1 + tan(x)</code>.
 * @author Sean A. Irvine
 */
public class A009006 extends MemorySequence {

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n <= 1) {
      return n == 0 ? Z.ONE : Z.NEG_ONE;
    }
    if ((n & 1) == 0) {
      return Z.ZERO; // efficiency
    }
    Z sum = Z.ZERO;
    for (int k = 0; k < n; ++k) {
      sum = sum.add(get(k).multiply(Binomial.binomial(n, k)).shiftLeft(n - k - 1));
    }
    return sum.negate();
  }

  @Override
  public Z next() {
    return super.next().abs();
  }
}
