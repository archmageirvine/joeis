package irvine.oeis.a030;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;

/**
 * A030040 a(n+1) = Sum_{k=0..floor(n/tau)} a(k) * a(n-k), where tau = (1+sqrt(5))/2.
 * @author Sean A. Irvine
 */
public class A030040 extends MemorySequence {

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n < 3) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    for (int k = 0; k <= CR.valueOf(n - 1).divide(CR.PHI).floor().intValueExact(); ++k) {
      sum = sum.add(a(k).multiply(a(n - 1 - k)));
    }
    return sum;
  }
}
