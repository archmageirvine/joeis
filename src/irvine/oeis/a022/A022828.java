package irvine.oeis.a022;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A022828 <code>a(n) =</code> absolute value of <code>( a([ (n+1)/2 ]) - a([ (n+1)/3 ])+...+((-1)^n)a([ (n+1)/n ]) )</code>.
 * @author Sean A. Irvine
 */
public class A022828 extends MemorySequence {

  {
    add(Z.ONE);
  }

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n < 2) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    for (int k = 2; k <= n; ++k) {
      sum = sum.signedAdd((k & 1) == 0, get((n + 1) / k));
    }
    return sum.abs();
  }
}
