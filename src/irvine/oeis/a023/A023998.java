package irvine.oeis.a023;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A023998 Number of block permutations on an n-set which are uniform, i.e., corresponding blocks have same size.
 * @author Sean A. Irvine
 */
public class A023998 extends MemorySequence {

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n == 0) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    for (int k = 0; k < n; ++k) {
      sum = sum.add(Binomial.binomial(n, k).multiply(Binomial.binomial(n - 1, k)).multiply(get(k)));
    }
    return sum;
  }
}

