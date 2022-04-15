package irvine.oeis.a056;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.a001.A001187;

/**
 * A056066 Expansion of log( dC(x)/dx ), C(x) = e.g.f. for labeled connected graphs (A001187).
 * @author Sean A. Irvine
 */
public class A056066 extends MemorySequence {

  private final MemorySequence mB = new A001187();

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n == 0) {
      return Z.ZERO;
    }
    Z s = Z.ZERO;
    for (int k = 1; k < n; ++k) {
      s = s.add(Binomial.binomial(n, k).multiply(k).multiply(mB.a(n + 1 - k)).multiply(get(k)));
    }
    return mB.a(n + 1).subtract(s.divide(n));
  }
}
