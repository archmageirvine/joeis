package irvine.oeis.a007;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A007753 <code>a(n+1) =</code> Sum <code>C( a(k)^2,k), k=0..n</code>.
 * @author Sean A. Irvine
 */
public class A007753 extends MemorySequence {

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n == 0) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    for (int k = 0; k < n; ++k) {
      sum = sum.add(Binomial.binomial(get(k).square(), Z.valueOf(k)));
    }
    return sum;
  }
}

