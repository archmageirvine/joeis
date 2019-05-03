package irvine.oeis.a005;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A005158 Number of alternating sign <code>n X n</code> matrices invariant under a <code>half-turn</code>.
 * @author Sean A. Irvine
 */
public class A005158 extends MemorySequence {

  // Conjectured formula

  {
    add(null);
  }

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n == 1) {
      return Z.ONE;
    }
    if ((n & 1) == 1) {
      return get(n - 1).multiply(Binomial.binomial(3 * (n - 1) / 2, (n - 1) / 2)).divide(Binomial.binomial(n - 1, (n - 1) / 2));
    } else {
      return get(n - 1).multiply(4).multiply(Binomial.binomial(3 * n / 2, n / 2)).divide(3).divide(Binomial.binomial(n, n / 2));
    }
  }
}
