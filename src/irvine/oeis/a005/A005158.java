package irvine.oeis.a005;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Conjectural;
import irvine.oeis.memory.MemorySequence;

/**
 * A005158 Number of alternating sign n X n matrices invariant under a half-turn.
 * @author Sean A. Irvine
 */
public class A005158 extends MemorySequence implements Conjectural {

  {
    setOffset(1);
    add(null);
  }

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n == 1) {
      return Z.ONE;
    }
    if ((n & 1) == 1) {
      return a(n - 1).multiply(Binomial.binomial(3L * (n - 1) / 2, (n - 1) / 2)).divide(Binomial.binomial(n - 1, (n - 1) / 2));
    } else {
      return a(n - 1).multiply(4).multiply(Binomial.binomial(3L * n / 2, n / 2)).divide(3).divide(Binomial.binomial(n, n / 2));
    }
  }
}
