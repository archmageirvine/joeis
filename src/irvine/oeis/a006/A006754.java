package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A006754 The generalized Conway-Guy sequence w^{0}.
 * @author Sean A. Irvine
 */
public class A006754 extends MemorySequence {

  // Conjectural formula

  private static final long[] INITIAL = {0, 3, 5, 6, 7, 14, 25, 45, 84, 162};

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n < INITIAL.length) {
      return Z.valueOf(INITIAL[n]);
    }
    return a(n - 1).multiply2().subtract(a(n - 1 - (int) Math.floor(0.5 + Math.sqrt(2L * (n - 1)))));
  }
}

