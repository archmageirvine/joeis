package irvine.oeis.a057;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;

/**
 * A057817 Moebius invariant of cographic hyperplane arrangement for complete graph K_n. Also value of Tutte dichromatic polynomial T_G(0,1) for G=K_n. Also alternating sum F_{n,1} - F_{n,2} + F_{n,3} - ..., where F_{n,k} is the number of labeled forests on n nodes with k connected components.
 * @author Sean A. Irvine
 */
public class A057817 extends MemorySequence {

  {
    setOffset(1);
    add(Z.ZERO);
  }

  @Override
  protected Z computeNext() {
    final int n = size();
    Z sum = Z.valueOf(n).pow(n - 2);
    for (int k = 1; k < n; ++k) {
      sum = sum.subtract(Binomial.binomial(n - 1, k - 1).multiply(Z.valueOf(k).pow(k - 2)).multiply(a(n - k)));
    }
    return sum;
  }
}
