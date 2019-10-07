package irvine.oeis.a026;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A026586 Number of labeled essential directed acyclic graphs (DAGs).
 * @author Sean A. Irvine
 */
public class A026586 extends MemorySequence {

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n == 0) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    for (int k = 1; k <= n; ++k) {
      sum = sum.signedAdd((k & 1) == 1, Binomial.binomial(n, k).multiply(Z.ONE.shiftLeft(n - k).add(k - n).pow(k)).multiply(get(n - k)));
    }
    return sum;
  }
}
